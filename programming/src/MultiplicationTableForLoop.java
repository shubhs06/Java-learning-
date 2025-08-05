import java.util.Scanner;

public class MultiplicationTableForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scanner.nextInt();
        
        for(int i = 1; i <= 10 ; i++ ){

            System.err.println(num + " X " + i + " = " + num * i);

        }

    }
}
