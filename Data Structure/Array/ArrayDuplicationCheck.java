package Array;

import java.util.Scanner;

public class ArrayDuplicationCheck {
    static boolean duplicate(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int check = arr[i];
            if (arr[i] == check) {
                return true;
            }
            System.out.printf("%d is more then one appear ", check);

        }

        return false;
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
        boolean isdubble = duplicate(numbers);
        System.out.println(" yes num is " + isdubble);
    }
}
