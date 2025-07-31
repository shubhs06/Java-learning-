package Abstraction.Trigno;

public class Circle extends Shape {

    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public void calculateArea() {
        // TODO Auto-generated method stub
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("Area of Circle : %f %n ", area);
        
    }
}
