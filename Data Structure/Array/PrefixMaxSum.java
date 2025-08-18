package Array;

import java.util.Scanner;

public class PrefixMaxSum {
    public static void printSubArray(int [] numbers){
        int max = Integer.MIN_VALUE;                    // for max take integers smallest value
        int sum =0;                                     // sum variable declare
        int[] prefix = new int[numbers.length];
        prefix[0] = numbers[0];
        for (int i = 1 ; i < prefix.length; i++) {
            prefix [i] = prefix[i-1] + numbers[i];
        }


        for (int i = 0; i < numbers.length; i++) {      //Starting Loop for array first number
            for (int j = i; j < numbers.length; j++) {  // second loop for sub array end end number
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];                 //
                    System.out.print("= " +sum);         //print sub array sum
                    if (max < sum) {
                        max = sum;                          //max update
                    }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Max sum is :"+ max);            // max print

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
        printSubArray(numbers);
        in.close();
    }
}
