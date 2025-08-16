package Array;

import java.util.Scanner;

public class PairOfArray {

    public static void pairs(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i +1; j < numbers.length; j++) {
                System.out.print("("+ numbers[i] + ", " + numbers[j] + ")");

            }
            System.out.println();
        }
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
        pairs(numbers);
        in.close();
    }
}
