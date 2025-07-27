import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter your String : ");
        String hmm = sc.next();
        System.out.println("Your given String is "+ ((Palindrome(hmm) ? "Palindrome" : "Not Palindrome"))); 


    }
    public static boolean Palindrome(String pali){

        if (pali.length() <= 1) {
            return true;
        }
        int lastposs = pali.length() -1;
        if (pali.charAt(0) !=  pali.charAt(lastposs)){
            return false;
        }
        String newpali = pali.substring(1, lastposs);
        return Palindrome(newpali);
    }
}
