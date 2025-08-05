import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int result = DigitCalculation(num);
        System.out.println("sum of digits of given :" + result);

    }
    public static int DigitCalculation(int num){
        int digit =0;
        while (num > 0 ) {
            digit += (num % 10) ;
            num /= 10; 
            
        }
        return digit ;
    }
}
