package Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    // Named comparator: compares integers by their last digit
    static class LastDigitComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b) {
            return Integer.compare(a % 10, b % 10);
        }
    }

    // Named comparator: compare students by name (case-insensitive) then by age
    static class NameThenAgeComparator implements Comparator<Student> {
        @Override
        public int compare(Student a, Student b) {
            int nameCmp = String.CASE_INSENSITIVE_ORDER.compare(a.name, b.name);
//            System.out.println(STR."Comparing \{" + a + "} and \{" + b + "}, nameCmp=" + nameCmp);
            if (nameCmp != 0) return nameCmp;
            return Integer.compare(a.age, b.age);
        }
    }

    public static void main(String[] args) {
        // Case-insensitive string sort
        List<String> fruits = new ArrayList<>(List.of("banana", "Apple", "orange", "apple"));
        fruits.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println("Case-insensitive: " + fruits);

        // Sort by length using comparingInt with method reference
        List<String> words = new ArrayList<>(List.of("banana", "apple", "orange", "kiwi"));
        words.sort(Comparator.comparingInt(String::length));
        System.out.println("By length: " + words);

        // Integers sorted by last digit using named comparator and comparingInt
        List<Integer> nums = new ArrayList<>(List.of(11, 23, 51, 34, 2, 1, 90));
        nums.sort(new LastDigitComparator());
        System.out.println("By last digit (named): " + nums);

        List<Integer> nums2 = new ArrayList<>(List.of(11, 23, 51, 34, 2, 1, 90));
        nums2.sort(Comparator.comparingInt(i -> i % 10));
        System.out.println("By last digit (comparingInt): " + nums2);

        // Reverse order
        List<Integer> nums3 = new ArrayList<>(List.of(3, 1, 4, 2));
        nums3.sort(Comparator.reverseOrder());
        System.out.println("Reverse: " + nums3);

        // Students: comparator chaining and case-insensitive name comparison
        List<Student> students = new ArrayList<>();
        students.add(new Student("Yuvaraj", 21));
        students.add(new Student("Arun", 22));
        students.add(new Student("Arun", 20));
        students.add(new Student("nithin", 33));
        students.add(new Student("arun", 19));

        // By age then by name (case-insensitive)
        students.sort(Comparator.comparingInt((Student s) -> s.age)
                .thenComparing(s -> s.name, String.CASE_INSENSITIVE_ORDER));
        System.out.println(STR."Students by age then name (case-insensitive): \{students}");

        // By name (case-insensitive) then age using named comparator
        students.sort(new NameThenAgeComparator());
        System.out.println("Students by name then age (case-insensitive): " + students);

        // By name descending (case-insensitive) then age
        students.sort(Comparator.comparing((Student s) -> s.name, String.CASE_INSENSITIVE_ORDER)
                .reversed()
                .thenComparingInt(s -> s.age));
        System.out.println("Students by name desc then age: " + students);

    }
}
