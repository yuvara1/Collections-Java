package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import List.ArrayListt;

public class LinkedListt {
    public static void main(String[] args) {
        List<String> fruits = new LinkedList<>(List.of("InitialFruit1", "InitialFruit2"));

        // Adding elements to the LinkedList
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
        LinkedList<String> tropicalFruits = new LinkedList<>();
        tropicalFruits.add("Mango");
        tropicalFruits.add("Pineapple");
        fruits.addAll(tropicalFruits); // Add all tropical fruits
        System.out.println(fruits);

        // 4. addAll(index, collection) method
        LinkedList<String> citrusFruits = new LinkedList<>();
        citrusFruits.add("Orange");
        citrusFruits.add("Lemon");
        fruits.addAll(1, citrusFruits); // Insert citrus fruits at index 1
        System.out.println(fruits);

        //5. Using Collections.addAll() method
        java.util.Collections.addAll(fruits, "Fig", "Grapes"); // Add
        System.out.println(fruits);

        // 6. retainAll() method to keep only specified elements
        LinkedList<String> favoriteFruits = new LinkedList<>();
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
        fruits.replaceAll(fruit -> fruit.equals("Mango") ? "Papaya" :
                fruit); // Replace "Mango" with "Papaya"
        System.out.println(fruits);
        // 9. subList() method to add elements from a sublist
        List<String> moreFruits = List.of("Kiwi", "Watermelon", "Cantaloupe", "Honeydew");
        fruits.addAll(moreFruits.subList(1, 3)); // Add "
        System.out.println(fruits);

        // 10 . Offer, poll, peek methods from Queue interface
        Queue<String> fruitQueue = new LinkedList<>(fruits);
        fruitQueue.offer("Papaya"); // Add element to the end of the queue
        System.out.println("After offer(): " + fruitQueue);

        String polledFruit = fruitQueue.poll(); // Remove and return the head of the queue
        System.out.println("Polled fruit: " + polledFruit);
        System.out.println("After poll(): " + fruitQueue);

        String peekedFruit = fruitQueue.peek(); // Return the head of the queue without removing
        System.out.println("Peeked fruit: " + peekedFruit);
        System.out.println("After peek(): " + fruitQueue);



    }

}
