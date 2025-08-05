import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        MultiplicationTable(GettingNumber());


    }

    public static void MultiplicationTable(int num){
        int i = 1 ;
        while (i <= 10) {
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        }
        
    }

    public static int GettingNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number for multiplication Table : ");
        int num = scanner.nextInt();
        return num ;

    }

}
