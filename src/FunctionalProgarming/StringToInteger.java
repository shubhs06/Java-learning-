package FunctionalProgarming;

import java.util.List;

public class StringToInteger {

    public static void main(String[] args) {
        List<String> str = List.of("1","5","4","5","6","8","3");

        str.stream()
            .map(Integer::parseInt)
            .map(num -> Math.pow(num, 2))
            .reduce(Double::sum)
            .ifPresent(System.out::println);

    }
}
