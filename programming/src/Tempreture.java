import java.util.Scanner;
public class Tempreture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tempreture in fehrenheit : ");
        double f = sc.nextDouble();
        System.out.println(" tempreture in fehrenheit is : " + f);
        
        double c = (f -32)* 5/9;
        System.out.println("So our converted Tempreture in celsius is : " + c);

        double k = c + 273.15;
        System.out.println("So our converted Tempreture in kelvin is : " + k);

    }
}
