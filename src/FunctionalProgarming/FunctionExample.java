package FunctionalProgarming;

import java.util.function.Function;

public class FunctionExample {

    // Method that takes Function<String, Integer> and a string
    public static int getStringLength(String input, Function<String, Integer> func) {
        return func.apply(input);
    }

    public static void main(String[] args) {
        // Lambda to get string length
        Function<String, Integer> lengthFunction = str -> str.length();

        // Test the method
        String testStr = "shubham";
        int length = getStringLength(testStr, lengthFunction);

        System.out.println("Length of \"" + testStr + "\": " + length);  // Output: 10
    }
}
