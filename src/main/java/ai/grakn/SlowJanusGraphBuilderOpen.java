package ai.grakn;

import com.google.common.base.Stopwatch;
import org.janusgraph.core.JanusGraph;
import org.janusgraph.core.JanusGraphFactory;

/**
 * Hello world!
 *
 */
public class SlowJanusGraphBuilderOpen
{
    public static void main( String[] args ) {
        JanusGraphFactory.Builder builder = JanusGraphFactory.build().
            set("storage.hostname", "localhost").
            set("storage.cassandra.keyspace", "test").
            set("storage.backend", "cassandra");
        Stopwatch timer1 = Stopwatch.createStarted();
        JanusGraph builderOpened = builder.open();
        System.out.println("--- " + timer1.stop());
//
    }
}
