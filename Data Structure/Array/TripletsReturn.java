package Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TripletsReturn {

    public static List<Integer> triplets(int[] nums){
        List<Integer> triplets = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = i+2; k < nums.length; k++) {

                    if (nums[i] + nums[j] + nums[k] == 0) {
                        triplets.add(nums[i]);
                        triplets.add(nums[j]);
                        triplets.add(nums[k]);
                        Collections.sort(triplets);
                        
                        System.out.println(triplets);
                    }

                }
            }
        }

        return triplets;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter Size of Array : ");
        int size = in.nextInt();
        int numbers[] = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Please enter array "+ (i+1) + " Element : ");
            numbers[i] = in.nextInt();                              //O(n)
        }
        System.out.print("Given Array is : ");
        for (int i : numbers) {
            System.out.print( i + " ");                              //O(n)
        }
        System.out.println();
        System.out.println(triplets(numbers));

        in.close();
    }

}
