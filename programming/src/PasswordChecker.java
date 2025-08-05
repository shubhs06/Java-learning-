import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.print("Enter your Name : ");
        String name = scanner.nextLine();

        System.err.print("Enter your Password : ");
        String pass = scanner.nextLine();

        PasswordChecker checker = new PasswordChecker();
        checker.passwordcheck(name, pass);
        
    }
    
    void passwordcheck(String name , String pass){
        Scanner scanner = new Scanner(System.in);
        String checkname;
        String checkpass;
        do{
        System.err.print("Check your Name : ");
        checkname = scanner.nextLine();

        System.err.print("Check your Password : ");
        checkpass = scanner.nextLine();

        }while(name == checkname && pass == checkpass);

        System.out.print("Password is correct");
    }

}
