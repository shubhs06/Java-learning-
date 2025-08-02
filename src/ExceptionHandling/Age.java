package ExceptionHandling;

import java.util.Scanner;

public class Age {

    public static class UnderAgeException extends Exception { 
        public UnderAgeException() {
            super("You are under age.");
        }
    }

    public static void main(String[] args) throws UnderAgeException {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        try {
            System.out.print("Enter the Your Age :");
            age = scanner.nextInt();
            if (age < 18) {
                throw new UnderAgeException();
            }
        } catch (UnderAgeException e) {
            System.out.print(e.getMessage());
        }finally{
            System.out.print(" Your Age is "+ age);
        }


        

    }


}
