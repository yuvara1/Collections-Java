package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListt {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        // 1. add() method
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");
        System.out.println(fruits);

        // 2. add(index, element) method
        fruits.add(2, "Blueberry"); // Insert "Blueberry" at index
        System.out.println(fruits);

        // 3. addAll() method adding a collection of elements
        ArrayList<String> tropicalFruits = new ArrayList<>();
        tropicalFruits.add("Mango");
        tropicalFruits.add("Pineapple");
        fruits.addAll(tropicalFruits); // Add all tropical fruits
        System.out.println(fruits);

        // 4. addAll(index, collection) method
        ArrayList<String> citrusFruits = new ArrayList<>();
        citrusFruits.add("Orange");
        citrusFruits.add("Lemon");
        fruits.addAll(1, citrusFruits); // Insert citrus fruits at index 1
        System.out.println(fruits);

        //5. Using Collections.addAll() method
        java.util.Collections.addAll(fruits, "Fig", "Grapes"); // Add
        System.out.println(fruits);

        // 6. retainAll() method to keep only specified elements
        ArrayList<String> favoriteFruits = new ArrayList<>();
        favoriteFruits.add("Apple");
        favoriteFruits.add("Mango");
        favoriteFruits.add("Grapes");
        fruits.retainAll(favoriteFruits); // Retain only favorite fruits
        System.out.println(fruits);

        // 7. Using List.of() method (Java 9 and above)
        List<String> berries = List.of("Strawberry", "Raspberry", "Blackberry");
        fruits.addAll(berries); // Add all berries
        System.out.println(fruits);


        // 8. replaceAll() method to replace elements based on a condition
        fruits.replaceAll(fruit -> fruit.equals("Mango") ? "Papaya" : fruit); // Replace "Mango" with "Papaya"
        System.out.println(fruits);

        // 9. subList() method to add elements from a sublist
        List<String> subList = fruits.subList(0, 2); // Get a sublist of the first two elements
        fruits.addAll(subList); // Add elements from the
        System.out.println(fruits);

        // 10. copyOf() method (Java 10 and above)
        // Create an unmodifiable copy of a list and add its elements
        List<String> moreFruits = List.copyOf(List.of("Kiwi", "Papaya"));
        fruits.addAll(moreFruits); // Add more fruits
        System.out.println(fruits);

        // 11. Unmodifiable List addition (Java 9 and above)
        List<String> exoticFruits = List.of("Dragonfruit", "Durian");
        fruits.addAll(exoticFruits); // Add exotic fruits
        System.out.println(fruits);
    }
}
