import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount : ");
        double p = sc.nextInt();
        System.out.println("Enter rate of interest : ");
        double r = sc.nextInt();
        System.out.println("enter time in the year : ");
        double t = sc.nextInt();
        double si = (p *r * t) / 100;
        System.out.println("Simple Interest is : " + si);     
    }


}
