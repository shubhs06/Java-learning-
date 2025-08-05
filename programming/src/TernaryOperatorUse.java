import java.util.Scanner;

public class TernaryOperatorUse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the Second Number : ");
        int num2 = scanner.nextInt();
        MinimumNumber(num1, num2);
        TernaryOperatorUse compare = new TernaryOperatorUse();
        compare.evenOdd(num1);
        compare.AbsoluteValue(num1);
        compare.StudentScore();

    }
    public static void MinimumNumber(int num1, int num2){
        int minmum = num1 < num2 ? num1 : num2 ;
        System.err.println("Minimum number is : "+ minmum);

    }

    void evenOdd(int num1){
        String evenodd = num1 % 2 == 0 ? "is Evenn Number" :  "is Odd Number";
        System.out.println("Given Number "+ num1 + " is " + evenodd);

    }

    void AbsoluteValue(int num1){

        int absolute = num1 >= 0 ? num1 : -num1;
        System.err.println("Given Numbers Absolute Value is : " + absolute);
    }

    void StudentScore(){
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter then Score of Student : ");
         int score = scanner.nextInt();

        String compare = score < 0 || score > 100 ?  "Not valid Score" : score >= 80 ? "High Score" : score >= 50 && score < 80 ? "Moderate" : "low Score" ;

        System.err.println("Student Score is : " + compare);
    }    
}
