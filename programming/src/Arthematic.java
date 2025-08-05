import java.util.Scanner;
public class Arthematic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double a = sc.nextInt();
        System.out.println("Enter second number: ");
        double b = sc.nextInt();
        System.out.println(" Using this " + a + " and " + b + " numbers we can perform arthematic operations like addition, subtraction, multiplication, Remainder and division.");

        double sum = a + b;
        double subtraction = a - b;
        double multiplication = a * b;
        double division = a / b;
        double remainder = a % b;

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + subtraction);  
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Remainder: " + remainder);


    }
}
