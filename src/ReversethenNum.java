import java.util.*;
public class ReversethenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int revesed = ReverseLogic(num);
        System.out.println("Reversed Given number is : " + revesed);

    }
    public static int ReverseLogic(int num){
        int revese = 0 ;
        while (num > 0) {
            int digit =  num % 10 ;
            revese = revese * 10 + digit ;
            num /= 10;            
        }
        
        return revese;

    }

}
