package FunctionalProgarming;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DistinctsNumbers {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,5,5,5,6,2,3);

       List<Integer> newlist = list.stream()
            .distinct()
            .collect(Collectors.toList());
            System.out.println(list);
            System.out.println(newlist);
    }
}
