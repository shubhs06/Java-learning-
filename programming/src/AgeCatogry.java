import java.util.*;
public class AgeCatogry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of person : ");
        int age = sc.nextInt();
        System.out.println("Persons Age is " + age);
        
        if (age < 0 ){
            System.out.println("Please enter valid Age");
        } else if (age < 13 && age > 0){
            System.out.println("Person is Child ");
        } else if (age < 20 && age > 12) {
            System.out.println("Person is Teenager ");
        } else if (age < 60 && age > 19 ){
            System.out.println("Person is Adult");
        } else {
            System.out.println("Person is Senior");
        }

    }
}
