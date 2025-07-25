import java.util.Scanner;

public class SwitchUse {
    public static void main(String[] args) {
       SwitchUse using = new SwitchUse();
       //using.Months();
       using.Calculator();


    }
    void Months(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Month Number : "); 
        int month = scanner.nextInt();
        
        switch (month) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("Ogs");
                break;
            case 9:
                System.out.println("Sab");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
        
            default:
                System.out.println(" invaid month ");
                break;
        }
        
    }
    double Calculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first Number  : ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the Second Number : ");
        double num2 = scanner.nextDouble();
        System.out.println("now enter Operation between : add , sub , multi , div");
        String choice = scanner.next() ;
        
        double result = switch (choice) {
            case "add" -> num1 + num2 ;
            case "sub" -> num1 - num2 ;
            case "multi" -> num1 * num2;
            case "div" -> num1 / num2 ;
            default -> 0;
        };
        System.err.println(result);
        return result;

    }
    
    

}
