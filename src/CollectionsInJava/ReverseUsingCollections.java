package CollectionsInJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ReverseUsingCollections {

    public static void main(String[] args) {
        List str = Arrays.asList("shubhs","a", "b");
        System.out.println(str);
        reversStringList(str);
        System.out.println(str);
        

        
    }

    public static void reversStringList(List <String>str){
        Collections.reverse(str);
        

    }
}
