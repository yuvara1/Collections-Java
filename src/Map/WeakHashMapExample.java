package Map;

import java.util.WeakHashMap;
import java.util.Map;

public class WeakHashMapExample {
    public static void main(String[] args) throws InterruptedException {
        Map<Object, String> map = new WeakHashMap<>();
        Object key = new Object();
        map.put(key, "someValue");

        System.out.println("Before GC: containsKey? " + map.containsKey(key) + ", size=" + map.size());

        // Drop strong reference and request GC; entry may be removed
        key = null;
        System.gc();
        Thread.sleep(100);

        System.out.println("After GC (may be collected): size=" + map.size());
        System.out.println("Map contents: " + map);
    }
}
