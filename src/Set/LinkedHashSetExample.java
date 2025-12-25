package Set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    static void main(String[] args) {
        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        System.out.println("Initial: " + fruits);

        // add() and duplicate handling
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("After add: " + fruits);
        System.out.println("Add duplicate 'Apple' returned: " + fruits.add("Apple"));

        // addAll()
        fruits.addAll(Arrays.asList("Date", "Elderberry", "Fig"));
        System.out.println("After addAll: " + fruits);

        // contains() and containsAll()
        System.out.println("Contains 'Banana': " + fruits.contains("Banana"));
        System.out.println("ContainsAll [Apple, Fig]: " + fruits.containsAll(Arrays.asList("Apple", "Fig")));

        // size() and isEmpty()
        System.out.println("Size: " + fruits.size());
        System.out.println("Is empty: " + fruits.isEmpty());

        // iterator()
        System.out.print("Iterate: ");
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // toArray()
        Object[] objArr = fruits.toArray();
        System.out.println("toArray (Object[]): " + Arrays.toString(objArr));
        String[] strArr = fruits.toArray(new String[0]);
        System.out.println("toArray (String[]): " + Arrays.toString(strArr));

        // remove()
        fruits.remove("Banana");
        System.out.println("After remove 'Banana': " + fruits);

        // removeAll()
        fruits.removeAll(Arrays.asList("Date", "NonExisting"));
        System.out.println("After removeAll(Date,NonExisting): " + fruits);

        // retainAll()
        fruits.retainAll(Arrays.asList("Apple", "Cherry"));
        System.out.println("After retainAll(Apple,Cherry): " + fruits);

        // clone via constructor
        LinkedHashSet<String> cloned = new LinkedHashSet<>(fruits);
        System.out.println("Cloned set: " + cloned);

        // equals() and hashCode()
        System.out.println("Equals cloned: " + fruits.equals(cloned));
        System.out.println("Original hashCode: " + fruits.hashCode());

        // removeIf()
        fruits.removeIf(s -> s.startsWith("C"));
        System.out.println("After removeIf startsWith 'C': " + fruits);

        // clear()
        fruits.clear();
        System.out.println("After clear: " + fruits + ", isEmpty: " + fruits.isEmpty());
    }
}
