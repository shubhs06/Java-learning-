import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner shubhs = new Scanner(System.in);
        System.out.println("Enter your marks in percentage: ");
        double marks = shubhs.nextDouble();
        System.out.println("Your percentage are: " + marks + "%");
        
        if (marks < 0 || marks > 100) {
            System.out.println("Please enter a valid marks percentage. Marks should be between 0 and 100.");
        }else if ( marks >= 95){
            System.out.println("your Grade is A+ ");
        } else if ( marks >=80 && marks < 95) {
            System.out.println("Your Grade is A ");
        } else if ( marks >= 70 && marks < 80) {
            System.out.println("Your Grade is B+ ");
        } else if ( marks >= 60 && marks < 70) {
            System.out.println("Your Grade is B ");
        } else if ( marks >= 45 && marks < 60) {
            System.out.println("Your Grade is C ");
        } else if ( marks >= 35 && marks < 45) {
            System.out.println("Your Grade is D ");
        } else {
            System.out.println("You are Failed");
        }

    }

}
