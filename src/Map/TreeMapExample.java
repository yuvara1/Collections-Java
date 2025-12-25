package Map;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("c", 3);
        map.put("a", 1);
        map.put("b", 2);

        System.out.println("TreeMap keys (sorted): " + map.keySet());
        System.out.println("firstKey=" + map.firstKey() + ", lastKey=" + map.lastKey());

        Map<String, Integer> sub = map.subMap("a", "c"); // 'c' exclusive
        System.out.println("subMap(a, c): " + sub);

    }
}
