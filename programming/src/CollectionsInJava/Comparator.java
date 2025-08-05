package CollectionsInJava;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Comparator {

    public static void main(String[] args) {
        List <String> list = Arrays.asList("Shubham","Abhay","Anand","Ajay", "Sourabh", "Giri");
        System.out.println(list);
        sortDesending(list);
        System.out.println(list);
        System.out.println(Collections.frequency(list, "Ajay"));
        System.out.println(Collections.frequency(list, "Ajya"));
        Collections.reverse(list);
        System.out.println(list);
        
        System.out.println(list);

    }

    public static void sortDesending(List <String> stringList) {
        Collections.sort(stringList, new java.util.Comparator<String>() {
            public int compare(String a, String b) {
                return b.compareTo(a); // descending order
            }
        });
    }

}
