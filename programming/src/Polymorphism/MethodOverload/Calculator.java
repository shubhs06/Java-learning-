package Polymorphism.MethodOverload;

public class Calculator {

    public int add(int a,int b){
        System.out.println("retruns two integers method");
        return a + b;
    }

    public int add(int a,int b,int c){
        System.out.println("retruns three integers method");
        return a + b + c;
    }

    public double add(double a,double b){
        System.out.println("retruns Double method");
        return a + b;
    }

    public static void main(String[] args) {
        Calculator cl1 = new Calculator();
        System.out.println(cl1.add(4, 5));
        System.out.println(cl1.add(45, -66, 54));
        System.out.println(cl1.add(51.64, 045));

    }
}
