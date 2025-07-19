import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        boolean result = PrimeNoLogic(num);
        if (result) {
            System.out.println("Given Number is "+ num + " Prime ");
            
        }else{
            System.out.println("Given Number is "+ num + " not Prime");
        }
        
    }
    public static boolean PrimeNoLogic(int num){
        int i = 2;
        while (i < num) {
            if (num %  i == 0){
                return false;
            }
            i++;    
        }
        return true;

    }

}
