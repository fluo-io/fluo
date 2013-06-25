/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.accumulo.accismus.impl;

import org.apache.accumulo.accismus.Column;
import org.apache.accumulo.accismus.ColumnSet;
import org.apache.accumulo.accismus.Constants;
import org.apache.accumulo.accismus.Transaction;
import org.apache.accumulo.core.data.Mutation;
import org.apache.accumulo.core.data.Value;


/**
 * 
 */
public class ColumnUtil {
  public static final long PREFIX_MASK = 0xe000000000000000l;
  public static final long WRITE_PREFIX = 0x6000000000000000l;
  public static final long DEL_LOCK_PREFIX = 0x4000000000000000l;
  public static final long LOCK_PREFIX = 0x2000000000000000l;
  public static final long ACK_PREFIX = 0xc000000000000000l;
  public static final long DATA_PREFIX = 0xa000000000000000l;
  
  public static final long TIMESTAMP_MASK = 0x1fffffffffffffffl;

  public static void commitColumn(boolean isTrigger, Column col, boolean isWrite, long startTs, long commitTs, ColumnSet observedColumns, Mutation m) {
    if (isWrite) {
      m.put(ByteUtil.toText(col.getFamily()), ByteUtil.toText(col.getQualifier()), col.getVisibility(), WRITE_PREFIX | commitTs,
          new Value(ByteUtil.encode(startTs)));
    } else {
      m.put(col.getFamily().toArray(), col.getQualifier().toArray(), col.getVisibility(), DEL_LOCK_PREFIX | commitTs, DelLockValue.encode(startTs, false));
    }
    
    if (isTrigger) {
      m.put(col.getFamily().toArray(), col.getQualifier().toArray(), col.getVisibility(), ACK_PREFIX | startTs, Transaction.EMPTY);
      m.putDelete(Transaction.toBytes(Constants.NOTIFY_CF), Transaction.concat(col), col.getVisibility(), startTs);
    }
    
    if (observedColumns.contains(col)) {
      m.put(Transaction.toBytes(Constants.NOTIFY_CF), Transaction.concat(col), col.getVisibility(), commitTs, Transaction.EMPTY);
    }
  }
  

}