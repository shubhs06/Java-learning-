package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static class ZerosException extends Exception {
    
        
    }

    void getNumbers(){
        
    }

    public void Division(int num1, int num2) throws ArithmeticException,ZerosException{
        int [] arr = new int[5];
        double i;
        try {
            
            i = num1/num2;
            if (i == 0){
                throw new ZerosException();
            }
            System.out.println(" " +i);
            System.out.println(arr[4]);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("division by Zero Occur");

        } catch (ZerosException exception){
           i = num2 / num1;
           System.out.println("We dont want Zero output so reversed the number");
           System.out.println(i);
        } catch (Exception e ){
            System.out.println("exception Occurs" + e);
        }
        finally {
            System.out.println("your division of numbers is " + num1 + " / "+ num2);
        }
        

    }
    
    
    

    public static void main(String[] args) throws Exception, ZerosException {

        Scanner sc = new Scanner(System.in);
        Calculator div = new Calculator();
        int num1, num2;
        try {
            System.out.print("Enter the First number : ");
            num1 = sc.nextInt();
            System.out.printf("Enter the Second number : ");
            num2 = sc.nextInt();
            div.Division(num1, num2);
        } catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println("only number are accepted");
        }
        
        
        
        
        
    }


}
