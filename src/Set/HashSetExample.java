package Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    static void main() {
        Set<String> users = new HashSet<>();
        // 1. add() method to add elements
        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");
        System.out.println("HashSet after adds: " + users);

        // 2. remove() method to remove an element
        users.remove("Bob");
        System.out.println("HashSet after remove: " + users);

        // 3. contains() method to check for an element
        boolean hasAlice = users.contains("Alice");
        System.out.println("HashSet contains Alice: " + hasAlice);

        // 4. size() method to get the number of elements
        int size = users.size();
        System.out.println("Size of HashSet: " + size);

        // 5. isEmpty() method to check if the set is empty
        boolean isEmpty = users.isEmpty();
        System.out.println("Is HashSet empty: " + isEmpty);

        // 6. clear() method to remove all elements
        users.clear();
        System.out.println("HashSet after clear: " + users);

        // 7. clone() method to create a shallow copy
        users.add("David");
        users.add("Eve");
        Set<String> clonedSet = new HashSet<>(users);
        System.out.println("Cloned HashSet: " + clonedSet);

        // Final HashSet
        System.out.println("Final HashSet: " + users);

    }
}
