package Array;

import java.util.Scanner;

public class KadanesAlgo {
    public static void kadanes(int[] numbers){
        int max = Integer.MIN_VALUE;
        int cSum= 0;
        for (int i = 0; i < numbers.length; i++) {
            cSum = cSum + numbers[i];
            if (cSum < 0) {
                cSum = 0;
            }
            max = Math.max(cSum, max);
            System.out.print(max +" " );
        }
        System.out.println("Max sum is : " + max);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter Size of Array : ");
        int size = in.nextInt();
        int numbers[] = new int[size];
        System.out.print("Please enter array Array Element : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();                              //O(n)
        }
        System.out.print("Given Array is : ");
        for (int i : numbers) {
            System.out.print( i + " ");                              //O(n)
        }
        System.out.println();
        kadanes(numbers);
        in.close();
    }
}
