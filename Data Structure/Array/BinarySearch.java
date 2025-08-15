package Array;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearchAlgo(int[] number,int num){
        int s = 0;
        int e = number.length -1;
        while (s <= e ) {
            int mid = (s+e) /2 ;
            if (number[mid] == num) {
                return mid;
            }
            if (number[mid] < num) {
                s = mid + 1;
            } else {
                e = mid -1;
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
    }
}
