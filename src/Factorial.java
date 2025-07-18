import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        long fact = FactorialClaculation(num);
        System.out.println("Given number Factorial is : " +fact);
    }
    public static long FactorialClaculation(long num) {
        long fact = 1;
        long i = 1; 
        while (i <= num) {
            fact = fact * i;
            i++;
        }
        return fact;
    }
}
