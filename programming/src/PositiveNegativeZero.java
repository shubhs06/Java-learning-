import java.util.Scanner;
public class PositiveNegativeZero {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the number : ");
        int n = sc.nextInt ();
        if (n > 0){
            System.out.println("the number is positive  : " + n);
        } else if (n < 0) {
            System.out.println("The number is negative : " + n);
        } else {
            System.out.println("The number is zero : " + n);
        }
    }

}
