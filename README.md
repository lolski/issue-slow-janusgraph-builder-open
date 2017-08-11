This project is intended to reproduce the slow `JanusGraph.Builder.open()` issue. The issue is observed on JanusGraph `0.2.0-grakn-SNAPSHOT` with Apache Cassandra `2.2.10`

## Running the program
1. `wget http://apache.claz.org/cassandra/2.2.10/apache-cassandra-2.2.10-bin.tar.gz`
2. `tar -xf apache-cassandra-2.2.10-bin.tar.gz`
3. `cd apache-cassandra-2.2.10/`
4. `vim conf/cassandra.yaml` and set `start_rpc: true`
5. `bin/cassandra -f`
6. ` mvn package -T 2.5C -DskipTests=true`
7. `mvn exec:java -Dexec.mainClass="ai.grakn.SlowJanusGraphBuilderOpen"`

## Output
Executing the program will yield the following output:
```
...
...
22:42:42,764  INFO KCVSLog:744 - Loaded unidentified ReadMarker start time 2017-08-11T15:42:42.751Z into org.janusgraph.diskstorage.log.kcvs.KCVSLog$MessagePuller@2d9caaeb
--- 1.052 s

```
The number shown is the time taken for `JanusGraph.Builder.open()` to execute
