import java.util.Scanner;
public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("\nyour presed first numbers is: " + num1);
        System.out.println("your presed second number is: " + num2);
        int sum = num1 + num2;
        System.out.println("The sum of the two numbers is: " + sum);
    }

}
