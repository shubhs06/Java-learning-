package CollectionsInJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapsWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map <String,String> world = new HashMap<>();
        world.put("India", "New Delhi");
        world.put("United States", "Washington, D.C.");
        world.put("United Kingdom", "London");
        world.put("Canada", "Ottawa");
        world.put("Australia", "Canberra");
        world.put("Japan", "Tokyo");
        world.put("France", "Paris");
        world.put("Germany", "Berlin");
        world.put("Brazil", "Brasília");
        world.put("South Africa", "Pretoria");

        System.out.print("Enter Which Countrys Capital you Want : ");
        String country = sc.nextLine();
        if (world.containsKey(country)) {
            System.out.printf("%s : %s", country,world.get(country));
        } else{
            System.out.printf("i don't have information of %s country ",country);
        }
        
    }
    

    
    
    
}
