package CollectionsInJava;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetUniqueChar {
    public static void main(String[] args) {
        Set <Character> un = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print(" write Anything :");
        String wri = sc.nextLine();
        for (char ch : wri.toCharArray()) {
            un.add(ch);

        }
        System.out.println(un.size());
    }
}
