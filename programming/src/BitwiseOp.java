import java.util.Scanner;

public class BitwiseOp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Showcasing BitWise Operators.... ");
        System.out.print("Plase Enter First number : ");
        int num = scanner.nextInt();
        System.out.print("Now, Plase Enter Second number : ");
        int num2 = scanner.nextInt();
        
        // int result = num & num2 
        // System.out.println("Result of AND Operatot is : " + result);

        // int resultOR = num | num2 ;
        // System.out.println("Result of OR Operatot is : " + resultOR);

        // int resultXOR = num ^ num2 ;
        // System.out.println("Result of XOR Operatot is : " + resultXOR);

        // int result1 = ~num ;
        // int result2 = ~num2 ;
        // System.out.println("Result of NOT or compliment Operatot is : " + result1 + " first number \n" + result2 + " Second number" );

        int resultLeftShift = num << 1 ;
        System.out.println("Result of Left Shift Number : " + resultLeftShift);
        int resultRightShift = num2 >> 1 ;
        System.out.println("Result  of Right Shift Number : " + resultRightShift);
    }

}
