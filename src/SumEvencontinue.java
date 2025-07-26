import java.util.Scanner;

public class SumEvencontinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number up to U want Sum : ");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < num ; i++) {
            if(i %  2 != 0 ){
                continue ;
            }
            sum += i;
        }
        System.err.println(sum + " is num even numbers up to "+ num);

    }

}
