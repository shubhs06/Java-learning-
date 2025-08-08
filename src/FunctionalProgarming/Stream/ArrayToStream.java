package FunctionalProgarming.Stream;

import java.util.List;

public class ArrayToStream {
    public static void main(String[] args) {
        List<String> list = List.of("shubham","joquina","Sinu","ritu","praji");
        List<String> list2 = List.of("shubham","joquina","Sinu","ritu","praji","Raja");
        list.stream()
        .forEach(lists -> System.out.println(lists));
        System.out.println("\nFilterd list");

        // Print the reduced result
        String reducedResult = list2.stream()
            .filter(str -> str.length() > 5)
            .reduce("", (a , b) -> (a + " is Best friend of " + b));
        System.out.println(reducedResult);

}

}
