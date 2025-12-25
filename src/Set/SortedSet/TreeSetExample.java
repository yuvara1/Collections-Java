package Set.SortedSet;

import java.util.*;

public class TreeSetExample {
    // Implementation goes here
    static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");
        treeSet.add("Apricot");
        System.out.println("TreeSet (sorted): " + treeSet);

        // Demonstrating some TreeSet methods
        treeSet.add("Date");
        System.out.println("After adding Date: " + treeSet);

        System.out.println("Contains 'Apple': " + treeSet.contains("Apple"));
        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());
        treeSet.remove("Banana");
        System.out.println("After removing Banana: " + treeSet);
        System.out.println("Size of TreeSet: " + treeSet.size());

        treeSet.clear();
        System.out.println("After clear, is TreeSet empty: " + treeSet.isEmpty());

    }
}
