import java.net.SocketTimeoutException;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if (isPalindrome) {
            System.out.println("given number is Palindrome ");
        } else {
            System.out.println("Given number is not PalinDrome");
        }

    }
    public static boolean isPalindrome(int num){
        int pali = 0;
        int copynum =num;
        while (num > 0) {
            int digit = num % 10 ;
            pali = pali * 10 + digit ;
            num /= 10;
        }
        
        return pali == copynum;
 
    }
}
