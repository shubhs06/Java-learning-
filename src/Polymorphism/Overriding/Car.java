package Polymorphism.Overriding;

public class Car extends Vehicle {
    
    @Override
    public void service(){
        super.service();
        System.out.println("Car Need Service In Every Week");
    }
}
