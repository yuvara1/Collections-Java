package Map;

import java.util.HashMap;

public class HashMapExample {
    static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // Adding key-value pairs to the HashMap
        // 1. put(key, value) method to add elements to the map
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        System.out.println("HashMap after puts: " + map);

        // 2. remove(key) method to remove a key-value pair
        map.remove("Two");
        System.out.println("HashMap after remove: " + map);

        // 3. containsKey(key) method to check for a key
        boolean hasOne = map.containsKey("One");
        System.out.println("HashMap contains key 'One': " + hasOne);

        //4. get(key) method to retrieve a value by key
        Integer value = map.get("Three");
        System.out.println("Value for key 'Three': " + value);

        // 5. size() method to get the number of key-value pairs
        int size = map.size();
        System.out.println("Size of HashMap: " + size);

        // 6. getOrDefault(key, defaultValue) method to get value or default
        Integer defaultValue = map.getOrDefault("Four", 4);
        System.out.println("Value for key 'Four' (default 4): " + defaultValue);

        // 7. putIfAbsent(key, value) method to add a key-value pair if the key is absent
        map.putIfAbsent("Four", 4);
        System.out.println("HashMap after putIfAbsent: " + map);

        // 8. putAll() method to add all key-value pairs from another map
        HashMap<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("Five", 5);
        anotherMap.put("Six", 6);
        map.putAll(anotherMap);
        System.out.println("HashMap after putAll: " + map);

        // 9. computeIfAbsent(key, mappingFunction) method to compute a value if the key is absent
        map.computeIfAbsent("Seven", k -> 7);
        System.out.println("HashMap after computeIfAbsent: " + map);

        // 10. computeIfPresent(key, remappingFunction) method to compute a new value if the key is present
        map.computeIfPresent("Three", (k, v) -> v + 10);
        System.out.println("HashMap after computeIfPresent: " + map);


        // 11. compute(key, remappingFunction) method to compute a new value for a key
        map.put("One", 1);
        map.compute("One", (k, v) -> v != null ? v * 2 : 1);
        System.out.println("HashMap after compute: " + map);

        // 12. computeAll(key, remappingFunction) method to compute new values for all keys
        map.replaceAll((k, v) -> v + 100);
        System.out.println("HashMap after replaceAll: " + map);
    }
}
