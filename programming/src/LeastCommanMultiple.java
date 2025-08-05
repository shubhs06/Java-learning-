import java.util.Scanner;
public class LeastCommanMultiple {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second number : ");
        int num2 = sc.nextInt();
        int lcm = LCMLogic(num1 , num2 );
        System.out.println(lcm);
    }
   
    public static int LCMLogic(int num1, int num2){     
        int i = 1;
        while (true) {
            int fact = num1 * i ;
            if (fact % num2 == 0  ) {
                return fact ;
        
            }
        i++;
        }

    }
}
