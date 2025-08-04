package CollectionsInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Swaping {

    public static void main(String[] args) {
        List <Integer> intigers = Arrays.asList(1,3,4,2,6,6);
        System.out.println(intigers);
        swap(intigers, 2, 0);
        System.out.println(intigers);
    }
    public static void swap(List <Integer> list , int x , int y){

        list.set(x, list.set(y,list.get(x)));
        


    }
}
