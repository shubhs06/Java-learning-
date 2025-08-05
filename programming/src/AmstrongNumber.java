import java.util.*;
public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        boolean isAmstrong = isAmstrong(num);
        if (isAmstrong) {
            System.out.println("Given number Is Amstrong Number");
        } else {
            System.out.println("Given number is not Amstrong Number ");
        }
         

    }
    public static boolean isAmstrong(int num){
        int digits = noOfDigit(num);
        int finalNumber = 0 ; 
        int copynum = num;
        while (num > 0) {
            int lastDigit = num % 10 ;
            num /= 10 ;
            finalNumber += pow(lastDigit, digits); 
        }
        System.out.println("the finalnumber is :" + finalNumber);
        return finalNumber == copynum ;
    }
    public static int pow(int num1 , int num2){
        int result = 1;
        int i = 0;
        while (i <= num2) {
            result *= num1;
            i++;

        }
        System.out.println("power of number " + num1 + " is " + num2);
        return result;

    }
    public static int noOfDigit(int num){
        int digit = 0;
        
        while (num > 0) {
            digit++;
            num /= 10;
        }
        System.out.println("number of digit are " + digit);
        return digit;

    }
}
