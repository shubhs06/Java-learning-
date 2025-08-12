package FunctionalProgarming.ResultOfStudent;

import java.util.*;

public class SortStudents {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Amit", 78));
        students.add(new Student("Sneha", 88));
        students.add(new Student("Rahul", 65));
        students.add(new Student("Neha", 92));

        // Sort by marks using lambda
        students.sort((s1, s2) -> Integer.compare(s1.marks, s2.marks));

        // Print sorted list
        
        System.out.println("Sorted by marks (ascending):");
        students.forEach(System.out::println);
        System.out.println();
        System.out.println("Passed Students Are ");
        students.stream()
                .filter(student -> student.marks >= 80)
                .forEach(System.out::println);
    }
}
