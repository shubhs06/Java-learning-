import java.util.Scanner;

public class EvenOddBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the number : ");
        int num = sc.nextInt();
        int result = num & 1;
        if(result == 0) {
            System.out.println("Given number is Even. ");
        }else {
            System.out.println("Given number is Odd");
        }
    }

}
