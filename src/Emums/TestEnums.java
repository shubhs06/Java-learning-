package Emums;

public class TestEnums {
    public static void main(String[] args) {
        
        System.out.println();



        for (Day values : Day.values()) {
            System.err.printf("%s : %s\n", values,values.isWeekDay());
        }
    }
}
