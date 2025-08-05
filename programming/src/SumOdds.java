import java.util.Scanner;

public class SumOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int resurlt = OddClaculation(num) ;
        System.out.println("oddsum is " + resurlt + " till number " + num);
    }
    
    public static int OddClaculation(int num) {
        int sum = 0 ; 
        int i = 1 ;
        while (i <= num) {
            sum += i ;
        
            i += 2 ;
        }
        return sum ;
    }

}
