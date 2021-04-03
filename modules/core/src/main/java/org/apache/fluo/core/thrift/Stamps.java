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
/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.fluo.core.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class Stamps implements org.apache.thrift.TBase<Stamps, Stamps._Fields>,
    java.io.Serializable, Cloneable, Comparable<Stamps> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC =
      new org.apache.thrift.protocol.TStruct("Stamps");

  private static final org.apache.thrift.protocol.TField TX_STAMPS_START_FIELD_DESC =
      new org.apache.thrift.protocol.TField("txStampsStart", org.apache.thrift.protocol.TType.I64,
          (short) 1);
  private static final org.apache.thrift.protocol.TField GC_STAMP_FIELD_DESC =
      new org.apache.thrift.protocol.TField("gcStamp", org.apache.thrift.protocol.TType.I64,
          (short) 2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY =
      new StampsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY =
      new StampsTupleSchemeFactory();

  public long txStampsStart; // required
  public long gcStamp; // required

  /**
   * The set of fields this struct contains, along with convenience methods for finding and
   * manipulating them.
   */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TX_STAMPS_START((short) 1, "txStampsStart"), GC_STAMP((short) 2, "gcStamp");

    private static final java.util.Map<java.lang.String, _Fields> byName =
        new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch (fieldId) {
        case 1: // TX_STAMPS_START
          return TX_STAMPS_START;
        case 2: // GC_STAMP
          return GC_STAMP;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null)
        throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TXSTAMPSSTART_ISSET_ID = 0;
  private static final int __GCSTAMP_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap =
        new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TX_STAMPS_START, new org.apache.thrift.meta_data.FieldMetaData(
        "txStampsStart", org.apache.thrift.TFieldRequirementType.DEFAULT,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.GC_STAMP, new org.apache.thrift.meta_data.FieldMetaData("gcStamp",
        org.apache.thrift.TFieldRequirementType.DEFAULT,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Stamps.class, metaDataMap);
  }

  public Stamps() {}

  public Stamps(long txStampsStart, long gcStamp) {
    this();
    this.txStampsStart = txStampsStart;
    setTxStampsStartIsSet(true);
    this.gcStamp = gcStamp;
    setGcStampIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Stamps(Stamps other) {
    __isset_bitfield = other.__isset_bitfield;
    this.txStampsStart = other.txStampsStart;
    this.gcStamp = other.gcStamp;
  }

  public Stamps deepCopy() {
    return new Stamps(this);
  }

  @Override
  public void clear() {
    setTxStampsStartIsSet(false);
    this.txStampsStart = 0;
    setGcStampIsSet(false);
    this.gcStamp = 0;
  }

  public long getTxStampsStart() {
    return this.txStampsStart;
  }

  public Stamps setTxStampsStart(long txStampsStart) {
    this.txStampsStart = txStampsStart;
    setTxStampsStartIsSet(true);
    return this;
  }

  public void unsetTxStampsStart() {
    __isset_bitfield =
        org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TXSTAMPSSTART_ISSET_ID);
  }

  /** Returns true if field txStampsStart is set (has been assigned a value) and false otherwise */
  public boolean isSetTxStampsStart() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TXSTAMPSSTART_ISSET_ID);
  }

  public void setTxStampsStartIsSet(boolean value) {
    __isset_bitfield =
        org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TXSTAMPSSTART_ISSET_ID, value);
  }

  public long getGcStamp() {
    return this.gcStamp;
  }

  public Stamps setGcStamp(long gcStamp) {
    this.gcStamp = gcStamp;
    setGcStampIsSet(true);
    return this;
  }

  public void unsetGcStamp() {
    __isset_bitfield =
        org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __GCSTAMP_ISSET_ID);
  }

  /** Returns true if field gcStamp is set (has been assigned a value) and false otherwise */
  public boolean isSetGcStamp() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __GCSTAMP_ISSET_ID);
  }

  public void setGcStampIsSet(boolean value) {
    __isset_bitfield =
        org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __GCSTAMP_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field,
      @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
      case TX_STAMPS_START:
        if (value == null) {
          unsetTxStampsStart();
        } else {
          setTxStampsStart((java.lang.Long) value);
        }
        break;

      case GC_STAMP:
        if (value == null) {
          unsetGcStamp();
        } else {
          setGcStamp((java.lang.Long) value);
        }
        break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
      case TX_STAMPS_START:
        return getTxStampsStart();

      case GC_STAMP:
        return getGcStamp();

    }
    throw new java.lang.IllegalStateException();
  }

  /**
   * Returns true if field corresponding to fieldID is set (has been assigned a value) and false
   * otherwise
   */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
      case TX_STAMPS_START:
        return isSetTxStampsStart();
      case GC_STAMP:
        return isSetGcStamp();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof Stamps)
      return this.equals((Stamps) that);
    return false;
  }

  public boolean equals(Stamps that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_txStampsStart = true;
    boolean that_present_txStampsStart = true;
    if (this_present_txStampsStart || that_present_txStampsStart) {
      if (!(this_present_txStampsStart && that_present_txStampsStart))
        return false;
      if (this.txStampsStart != that.txStampsStart)
        return false;
    }

    boolean this_present_gcStamp = true;
    boolean that_present_gcStamp = true;
    if (this_present_gcStamp || that_present_gcStamp) {
      if (!(this_present_gcStamp && that_present_gcStamp))
        return false;
      if (this.gcStamp != that.gcStamp)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(txStampsStart);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(gcStamp);

    return hashCode;
  }

  @Override
  public int compareTo(Stamps other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetTxStampsStart(), other.isSetTxStampsStart());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTxStampsStart()) {
      lastComparison =
          org.apache.thrift.TBaseHelper.compareTo(this.txStampsStart, other.txStampsStart);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetGcStamp(), other.isSetGcStamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGcStamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gcStamp, other.gcStamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot)
      throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Stamps(");
    boolean first = true;

    sb.append("txStampsStart:");
    sb.append(this.txStampsStart);
    first = false;
    if (!first)
      sb.append(", ");
    sb.append("gcStamp:");
    sb.append(this.gcStamp);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(
          new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in)
      throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and
      // doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(
          new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class StampsStandardSchemeFactory
      implements org.apache.thrift.scheme.SchemeFactory {
    public StampsStandardScheme getScheme() {
      return new StampsStandardScheme();
    }
  }

  private static class StampsStandardScheme
      extends org.apache.thrift.scheme.StandardScheme<Stamps> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Stamps struct)
        throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true) {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
          break;
        }
        switch (schemeField.id) {
          case 1: // TX_STAMPS_START
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.txStampsStart = iprot.readI64();
              struct.setTxStampsStartIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // GC_STAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.gcStamp = iprot.readI64();
              struct.setGcStampIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Stamps struct)
        throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TX_STAMPS_START_FIELD_DESC);
      oprot.writeI64(struct.txStampsStart);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(GC_STAMP_FIELD_DESC);
      oprot.writeI64(struct.gcStamp);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StampsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public StampsTupleScheme getScheme() {
      return new StampsTupleScheme();
    }
  }

  private static class StampsTupleScheme extends org.apache.thrift.scheme.TupleScheme<Stamps> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Stamps struct)
        throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot =
          (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTxStampsStart()) {
        optionals.set(0);
      }
      if (struct.isSetGcStamp()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetTxStampsStart()) {
        oprot.writeI64(struct.txStampsStart);
      }
      if (struct.isSetGcStamp()) {
        oprot.writeI64(struct.gcStamp);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Stamps struct)
        throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot =
          (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.txStampsStart = iprot.readI64();
        struct.setTxStampsStartIsSet(true);
      }
      if (incoming.get(1)) {
        struct.gcStamp = iprot.readI64();
        struct.setGcStampIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(
      org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme())
        ? STANDARD_SCHEME_FACTORY
        : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

