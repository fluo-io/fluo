Accismus
========

A [Percolator][2] prototype  for [Accumulo][1].  This prototype relies on 
Accumulo 1.6.0 which has [ACCUMULO-1000][3] and [ACCUMULO-112][5].
[ACCUMULO-1000][3] makes cross row transactions possible and  [ACCUMULO-112][5]
makes it possible to effeciently find notifications.  Theoretically this
prototype is to a point where it could run in a distributed manner.  But this
has not been tested.  The pieces are in place, CAS is done on the tablet server
and the Oracle is a service.  

There is a lot that needs to be done.  If you are interested in contributing
send me an email or check out the issues.


Building Accismus
-----------------

Using Maven, you can build Accismus with the following steps.

```
git clone https://github.com/keith-turner/Accismus.git
cd Accismus
mvn package
```

Experimenting with Accismus
---------------------------

An easy way to experiment with Accismus is to play with the [phrasecount][7] example.

Running Accismus
----------------

The following instructions command show a rough outline of how to get Accismus
installed and running on a single node.  These instructions assume an Accumulo
1.6 instance is already running.

You will need observers to run.  You can use the [phrasecount][7] examples
observers, check out its instructions for setting up observers in
`initialization.properties`.

```
OJAR=<location of observer jar>
OPT=/opt
mvn package 
tar -C $OPT -xvzf modules/distribution/target/accismus-0.0.1-SNAPSHOT-bin.tar.gz
cd $OPT/accismus-0.0.1-SNAPSHOT
cp $OJAR lib/observers
cd conf
cp examples/* .
vim accismus-env.sh
vim initialization.properties
vim accismus.properties
cd ..
./bin/initialize.sh
```

The preferred method is run Accismus applications within YARN:

```
./bin/oracle.sh start-yarn
./bin/worker.sh start-yarn
```

You can use `yarn application -list` to check the status of the applications. 
Logs are viewable within YARN.  When finished, you can kill the applications
using `yarn application -kill <Application ID>`.  The application ID can be
found using the list command.

If you do not have YARN set up, you can run Accismus as local Java processes:
```
./bin/oracle.sh start-local
./bin/worker.sh start-local
```
When finished, run the following commands to stop local oracle and worker.
```
./bin/worker.sh stop-local
./bin/oracle.sh stop-local
```

Dependencies
------------

Running `mvn package` will build a tar ball that contains all of the
dependencies needed at runtime.  Currently the tar ball is targeted twoards
Hadoop 2.3.0 and Accumulo 1.6.0.  If you have different versions installed on
your cluster, you can try passing the following options to maven package.
Other versions of Hadoop and Accumulo may not work, please open a bug if you
run into problems.

```
mvn package -Daccumulo.version=1.6.1-SNAPSHOT -Dhadoop.version=2.4.0
```  

Tuning Accumulo
---------------

Accismus will reread the same data frequenty when it checks conditions on
mutations.   When Accismus initializes a table it enables data caching to make
this more efficient.  However you may need to increase the amount of memory
available for caching in the tserver by increasing `tserver.cache.data.size`.
Increasing this may require increasing the maximum tserver java heap size in
`accumulo-env.sh`.  

Accismus will run many client threads, will want to ensure the tablet server
has enough threads.  Should probably increase the
`tserver.server.threads.minimum` Accumulo setting.

Group commit in Accumulo 1.6.0 is broken, the patch on [ACCUMULO-2766][8] can
be applied to fix this.  


[1]: http://accumulo.apache.org
[2]: http://research.google.com/pubs/pub36726.html
[3]: https://issues.apache.org/jira/browse/ACCUMULO-1000
[5]: https://issues.apache.org/jira/browse/ACCUMULO-112
[7]: https://github.com/keith-turner/phrasecount
[8]: https://issues.apache.org/jira/browse/ACCUMULO-2766

