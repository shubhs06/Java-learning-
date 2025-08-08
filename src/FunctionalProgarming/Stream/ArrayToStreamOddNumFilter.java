package FunctionalProgarming.Stream;

import java.util.List;

public class ArrayToStreamOddNumFilter {
    public static void main(String[] args) {
        List<Integer> list = List.of(54,3,5,6,25,62,5,6,68,8);

        System.out.print("\nFilterd list of Odd numbers : ");

        // Print the reduced result
        list.stream()
            .filter(num -> num % 2 != 0)
            .forEach(num -> System.out.print(num + " "));

}

}
