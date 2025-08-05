package Abstraction.Trigno;

public class Square extends Shape {

    private double side;
    
    public Square(double side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        // TODO Auto-generated method stub
        double area = Math.pow(side,2);
        System.out.printf("Area of Square : %f%n", area);
        
    }

}
