package Array;

import java.util.Scanner;

public class SubArray {

    public static void printSubArray(int [] numbers){
        int max = Integer.MIN_VALUE;
        int sum =0;                                     // sum variable declare
        for (int i = 0; i < numbers.length; i++) {      //Starting Loop for array first number
            for (int j = i; j < numbers.length; j++) {  // second loop for sub array end end number
                sum = 0;                            //again sum make zero for getting next sub array sum
                for (int k = i; k <= j; k++) {          //print sub array
                    System.out.print(numbers[k] +" ");  //printing statement
                    sum += numbers[k];                  //sub array sum of elements
                    }
                    System.out.print("= " +sum);         //print sub array sum
                    if (max < sum) {
                        max = sum;
                    }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Max sum is :"+ max);
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
