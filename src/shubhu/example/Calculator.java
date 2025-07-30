package shubhu.example;

import shubhu.exmaple.geometry.Circle;
import shubhu.exmaple.geometry.Rectangel;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(5.5);
        Rectangel rect = new Rectangel(12,34);

        double cirAera = Math.PI * Math.pow(cir.radius, 2);
        long rectAera = rect.length * rect.breadth;

        System.out.printf("Circle area is : %f %nArea of Rectangel : %d",cirAera,rectAera);

    }

}
