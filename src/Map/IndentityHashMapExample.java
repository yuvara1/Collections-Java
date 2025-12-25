package Map;

import java.util.IdentityHashMap;
import java.util.Map;

public class IndentityHashMapExample {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        String k1 = new String("key");
        String k2 = new String("key"); // equal but different identity
        map.put(k1, 1);
        map.put(k2, 2);

        System.out.println("IdentityHashMap size (should be 2): " + map.size());
        System.out.println("get(k1): " + map.get(k1));
        System.out.println("get(k2): " + map.get(k2));
        System.out.println("Iteration:");
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue() + " (identity)");
        }
    }
}
