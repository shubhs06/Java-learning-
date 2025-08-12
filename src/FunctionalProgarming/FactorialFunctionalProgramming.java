package FunctionalProgarming;

import java.util.stream.IntStream;

public class FactorialFunctionalProgramming {
    public static void main(String[] args) {
        System.out.println(factorial(5));

        IntStream.rangeClosed(2, 5)
            .reduce((a , b) -> a * b)
            .ifPresent(System.out::println);

    }

    public static long factorial(int num){
        int fact = 1;
        if (num == 0 || num == 1) {
            return 1;
        }
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
