package Polymorphism.Overriding;

public class Testcase {

    public static void main(String[] args) {
        Car c1 = new Car();
        Vehicle vc = new Car();
        Vehicle v = new Vehicle();

        Testcases(v);
        Testcases(vc);
        //c1.service();;


    }

    public static void Testcases(Vehicle veh){

        veh.service();
    }
}
