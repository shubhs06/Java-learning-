public class FinalCar {
    final int carModelNo;
    final String carEnginename;
    final int carWheels;

    FinalCar(int carModelNo , String carEnginename , int carWheels){
        this.carModelNo =carModelNo;
        this.carEnginename =carEnginename;
        this.carWheels = carWheels;

    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "45,\"Thar\",4";
    }
    public static void main(String[] args) {
        FinalCar myCar = new FinalCar(45,"Thar",4);
        System.out.println(myCar.toString());
    }
}
