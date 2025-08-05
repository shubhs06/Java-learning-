import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        System.out.println("Given Number Fibonacci Series is : " );
        FiboLogic(num);
    }
    public static void FiboLogic(int num){
        if (num < 0) return ;
        System.out.println("0 ");
        if (num == 0) return ;  
        System.out.println("1 ");       
        
        int first = 0 , second = 1 ;
        int thrid ;
        while (first + second <= num) {
            thrid =  first + second ;
            System.out.println(thrid + " ");
            
            first = second ;
            second = thrid ;
        }
    
    }
}
