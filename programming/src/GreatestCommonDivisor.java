import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        int first = sc.nextInt();
        System.out.print("Enter second Number : ");
        int second = sc.nextInt();
        int result = GCDLogic( first, second);
        System.out.println("Gretest Common Divisor Of given number is : " + result);

    }
    public static int GCDLogic(int first, int second){
        int gcd = 1;
        int i = 2;
        int least = Least(first, second);

        while (i <= least) {
            if (first % i == 0 && second % i ==0) {
                gcd = i;
            }
            i++;  
        }


        return gcd;

    }
    public static int Least(int first , int second){
        if (first < second) {
            return first;
        }else{
            return second;
        }
    }

}
