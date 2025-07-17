import java.util.Scanner;
public class Perimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of one side of the rectangle: ");
        double a = scanner.nextDouble();
        System.out.println("Enter the length of the second side of the rectangle: ");
        double b = scanner.nextDouble();
        System.out.println("Enter the length of the third side of the rectangle: ");
        double c = scanner.nextDouble();
        System.out.println("Enter the length of the fourth side of the rectangle: ");
        double d = scanner.nextDouble();

        double perimeter = a + b + c + d;
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }
}
