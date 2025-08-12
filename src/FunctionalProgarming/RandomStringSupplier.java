package FunctionalProgarming;

import java.util.function.Supplier;
import java.util.Random;

public class RandomStringSupplier {
    public static void main(String[] args) {
        // Characters to use in the random string
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();

        // Supplier to generate a 6-character random string
        Supplier<String> randomStringSupplier = () -> {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                int index = random.nextInt(chars.length());
                sb.append(chars.charAt(index));
            }
            return sb.toString();
        };

        // Generate and print 3 random strings
        System.out.println("Random String 1: " + randomStringSupplier.get());
        System.out.println("Random String 2: " + randomStringSupplier.get());
        System.out.println("Random String 3: " + randomStringSupplier.get());
    }
}
