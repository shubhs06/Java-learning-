package Array;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearchAlgo(int[] number,int num){
        int start = 0;                      //starting index
        int end = number.length -1;         //end index of array
        while (start <= end ) {
            int mid = (start + end) / 2 ; // getting middle of array
            //comparing
            if (number[mid] == num) {
                return mid;
            }
            //shifting left
            if (number[mid] < num) {
                start = mid + 1;
            //shifting right
            } else {
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Size of array : ");
        int size = in.nextInt();
        int numbers[] = new int[size];
        System.out.println("Please enter ur array");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();                              //O(n)
        }
        for (int i : numbers) {
            System.out.print(i + " ");                              //O(n)
        }
        System.out.println("Enter your Number : ");
        int num = in.nextInt();
        int index =binarySearchAlgo(numbers, num);
        System.out.println(index);

        in.close();
    }
}
