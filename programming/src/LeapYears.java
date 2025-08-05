import java.util.Scanner;

public class LeapYears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year :  ");
        int year = sc.nextInt();
        if (year < 0) {
            System.out.println("Plase enter a valid year. year cannot be negative. try again with 1 or greater.");
        } else if( year % 400 == 0){
            System.out.println(year + " is leap year");
        } else if (year % 100 == 0) {
            System.out.println( year + " is not a leap year");
        }else if (year % 4 == 0) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
        
    }

}
