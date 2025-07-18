import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        boolean result = PrimeNoLogic(num);
        if (result) {
            System.out.println("Number is prime ");
            
        }else{
            System.out.println("Number is not prime");
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
