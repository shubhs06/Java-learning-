import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        
        int number = 2765;
        guessing(number);

    }

    static void guessing(int number){
        Scanner scanner = new Scanner(System.in);
        int num;
        do{
        System.out.print("Guess your number : ");
        num = scanner.nextInt();

        }while(number != num) ;

        System.out.println("Congrats You Guess correct Number");

    }

}
