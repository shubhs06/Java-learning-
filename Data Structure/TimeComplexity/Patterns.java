public class Patterns {

     public static void main(String[] args) {
        int rows = 5; // Number of rows                 // 1

        // Triangle
        System.out.println("Triangle:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {              // n * n + 1
                System.out.print("* ");
            }
            System.out.println();
        }

    //Inverted Triangle:

        System.out.println("\nInverted Triangle:");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");                 // n * n +1

            }
            System.out.println();
        }

        //Pyramid:

        System.out.println("\nPyramid:");
            for (int i = 1; i <= rows; i++) {
                // Print spaces
                for (int space = 1; space <= rows - i; space++) {
                    System.out.print(" ");
                }
                // Print stars
                for (int star = 1; star <= (2 * i - 1); star++) {               //n * 2n 
                    System.out.print("*");
                }
                System.out.println();
            }

    }
}


//f(n) = 1 + n^2 + n^2 + n * 2n
// f(n) = n ^ 2 + n ^ 2 + 2n^2  
//f(n) = n^2