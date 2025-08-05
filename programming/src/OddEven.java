import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if ( n == 0){
            System.out.println("The number is zero: " + n);
        }else if (n % 2 == 0) {
            System.out.println("the number is even: " + n);
        } else{
            System.out.println("the number is odd: " + n);
        }
        }
    }

