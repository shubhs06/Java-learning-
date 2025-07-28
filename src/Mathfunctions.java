import java.util.Scanner;

public class Mathfunctions {

    
    
    public static void main(String[] args) {
       
        Mathfunctions dice = new Mathfunctions();
        // for (int i = 0; i < 10; i++) {
        //     System.out.println("Your dice number is : " + dice.diceGame());
        // }
        dice.GuessingGame();
       


    }

    static void circle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius length of Circle in Cm : ");
        double radius = sc.nextDouble();

        double areacir = Math.PI * Math.pow(radius, 2);
        double circumferece = 2* Math.PI * radius;
        System.out.println("Area of circle is : "+ areacir);
        System.out.println("circumferece of Circle is : " + circumferece);
    }

    
    
    int diceGame(){
        int random = (int) Math.round(Math.random()* 6) ;
        return random;
    }

    boolean GuessingGame(){
        Scanner sc = new Scanner(System.in);
        int random = (int) Math.round(Math.random()* 100) ;
        System.out.println(random);
        System.out.print("Enter your Guessing Number in 1 to 100 : ");
        int num = sc.nextInt();
        for(int i = 1; i < 10 ; i++){
        if (random != num){
            System.out.print("your remaining chances are "+ (10 - i) +",Plase try Again : ");
            num = sc.nextInt();           
            } else{
                System.out.println("correct num");
                break;
            }    

        }
        return true;
    }

}
