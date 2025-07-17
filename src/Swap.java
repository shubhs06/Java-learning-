import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int z = sc.nextInt();
        System.out.println("Before swapping: firstNumber= " + a + ", secondNumber = " + z);
        // Swapping logic
        int temp = a;
        a = z;
        z = temp;
        System.out.println("After swapping: firstNumber= " + a + ", secondNumber = " + z);

    }


}
