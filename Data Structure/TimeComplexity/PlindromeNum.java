public class PlindromeNum {
public static void main(String[] args) {
    int num = 55355;
    int reverse =0;
    for (int i = num; i != 0; i /= 10) {
        int digit = i % 10 ;
        reverse = reverse * 10 + digit;
    }
    String isPlindrome = (reverse == num) ? "Number is Palindrome" : "Number is not Palindrome";
    System.out.println(isPlindrome);
}
}
//f(n) = 2 + n + 2
//f(n) = n 
