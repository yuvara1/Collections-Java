// java
package Map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Enumeration;

public class HashTableExample {
    public static void main(String[] args) {
        // 1. Creating a Hashtable and adding key-value pairs
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "One");
        hashtable.put(2, "Two");
        hashtable.put(3, "Three");
        System.out.println("Hashtable: " + hashtable);

        // 2. Accessing a value
        String value = hashtable.get(2);
        System.out.println("Value for key 2: " + value);

        // 3. Removing a key-value pair
        hashtable.remove(3);
        System.out.println("Hashtable after removing key 3: " + hashtable);

        // 4. Checking if a key exists
        boolean hasKey1 = hashtable.containsKey(1);
        System.out.println("Contains key 1: " + hasKey1);

        // 5. Checking if a value exists
        boolean hasValueTwo = hashtable.containsValue("Two");
        System.out.println("Contains value 'Two': " + hasValueTwo);

        // 6. Size of the table
        System.out.println("Size: " + hashtable.size());

        // 7. Iterating entries using entrySet
        System.out.println("Iterating entries:");
        for (Map.Entry<Integer, String> entry : hashtable.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 8. Iterating keys using Enumeration
        System.out.println("Iterating keys with Enumeration:");
        Enumeration<Integer> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Integer k = keys.nextElement();
            System.out.println(k + " => " + hashtable.get(k));
        }

        // 9. Put-if-absent pattern (safely add only if key not present)
        int keyToAdd = 2;
        String newValue = "TwoUpdated";
        if (!hashtable.containsKey(keyToAdd)) {
            hashtable.put(keyToAdd, newValue);
            System.out.println("Added key " + keyToAdd + " with value " + newValue);
        } else {
            System.out.println("Key " + keyToAdd + " already present with value: " + hashtable.get(keyToAdd));
        }

        // 10. Clear the table
        hashtable.clear();
        System.out.println("Hashtable after clear: " + hashtable + " (size=" + hashtable.size() + ")");
    }
}
