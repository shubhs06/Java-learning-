package FunctionalProgarming.Lambda;

import java.util.function.BinaryOperator;

public class MultiWithLambda {

    public static void main(String[] args) {

        BinaryOperator<Integer> multi = (a, b) -> a * b;
        int result = multi.apply(2,64);
        System.out.println(result);
    }

}
