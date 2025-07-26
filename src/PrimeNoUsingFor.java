import java.util.Scanner;

public class PrimeNoUsingFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scanner.nextInt();
        boolean prime = Primeno(num);
        if (prime) {
            System.out.println("Given number is Prime ");
        } else {
            System.out.println("Given number is not Prime ");
        }
    }
    static boolean Primeno(int num){
        for(int i = 2 ; i <= num ; i++){
            if(num % 2 != 0){
                return true;
            }
        }
        return false;
    }

}
