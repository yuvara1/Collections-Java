package List;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>(List.of("Apple", "Banana", "Cherry"));
        System.out.println("Initial Vector: " + vec);
        // 1. add() method
        vec.add("Date");
        vec.add("Elderberry");
        System.out.println("After add(): " + vec);

        // 2. add(index, element) method
        vec.add(2, "Blueberry");
        System.out.println("After add(index, element): " + vec);
        // 3. addAll() method
        Vector<String> tropicalFruits = new Vector<>();
        tropicalFruits.add("Mango");
        tropicalFruits.add("Pineapple");
        vec.addAll(tropicalFruits);
        System.out.println("After addAll(): " + vec);

        // 4. addAll(index, collection) method
        Vector<String> citrusFruits = new Vector<>();
        citrusFruits.add("Orange");
        citrusFruits.add("Lemon");
        vec.addAll(1, citrusFruits);
        System.out.println("After addAll(index, collection): " + vec);

        // 5. Using Collections.addAll() method
        java.util.Collections.addAll(vec, "Fig", "Grapes");
        System.out.println("After Collections.addAll(): " + vec);

        // 6. retainAll() method
        Vector<String> favoriteFruits = new Vector<>();
        favoriteFruits.add("Apple");
        favoriteFruits.add("Mango");
        favoriteFruits.add("Grapes");
        vec.retainAll(favoriteFruits);
        System.out.println("After retainAll(): " + vec);

        // 7. Using List.of() method
        List<String> berries = List.of("Strawberry", "Raspberry", "Blackberry");
        vec.addAll(berries);
        System.out.println("After adding berries: " + vec);

        // 8. replaceAll() method
        vec.replaceAll(fruit -> fruit.equals("Mango") ? "Papaya" : fruit);
        System.out.println(STR."After replaceAll(): \{vec}");

        // 9. subList() method
        List<String> subList = List.of("Kiwi", "Watermelon");
        vec.addAll(subList);
        System.out.println("After adding subList: " + vec);

        // Final Vector
        System.out.println("Final Vector: " + vec);

    }
}
