// java
package Map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrentHashMapExample {

    /**
     * Create and return an empty ConcurrentHashMap.
     */
    public static ConcurrentHashMap<String, Integer> createMap() {
        return new ConcurrentHashMap<>();
    }

    /**
     * Put a key/value if absent and return the previous value (or null).
     */
    public static Integer putIfAbsent(ConcurrentHashMap<String, Integer> map, String key, Integer value) {
        return map.putIfAbsent(key, value);
    }

    /**
     * Increment the integer value for the key by delta using compute.
     * If the key is absent, it will be initialized to delta.
     */
    public static int incrementBy(ConcurrentHashMap<String, Integer> map, String key, int delta) {
        return map.compute(key, (k, v) -> (v == null) ? delta : v + delta);
    }

    /**
     * Remove the key only if its current value equals expected.
     * Returns true if removed.
     */
    public static boolean removeIfValue(ConcurrentHashMap<String, Integer> map, String key, int expected) {
        return map.remove(key, expected);
    }

    /**
     * Iterate entries and run a consumer lambda (here we just print).
     */
    public static void iterateEntries(ConcurrentHashMap<String, Integer> map) {
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " => " + e.getValue());
        }
    }

    /**
     * Demonstrates concurrent increments on the same key using multiple threads.
     * Returns final value for the key.
     */
    public static int concurrentIncrementDemo(int threads, int incrementsPerThread) throws InterruptedException {
        ConcurrentHashMap<String, Integer> map = createMap();
        String key = "counter";
        map.put(key, 0);

        ExecutorService ex = Executors.newFixedThreadPool(threads);
        for (int i = 0; i < threads; i++) {
            ex.submit(() -> {
                for (int j = 0; j < incrementsPerThread; j++) {
                    // use compute to safely update the value
                    map.compute(key, (k, v) -> v + 1);
                }
            });
        }

        ex.shutdown();
        if (!ex.awaitTermination(30, TimeUnit.SECONDS)) {
            ex.shutdownNow();
            throw new IllegalStateException("Tasks did not finish");
        }

        return map.getOrDefault(key, 0);
    }

    /**
     * Small demonstration in main.
     */
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String, Integer> map = createMap();

        putIfAbsent(map, "a", 1);
        putIfAbsent(map, "b", 2);
        incrementBy(map, "a", 5);          // a -> 6
        incrementBy(map, "c", 3);          // c -> 3 (was absent)
        removeIfValue(map, "b", 2);        // removes b

        System.out.println("Map contents after basic ops:");
        iterateEntries(map);

        int finalCount = concurrentIncrementDemo(8, 1_000);
        System.out.println("Final concurrent counter value: " + finalCount);
    }
}
