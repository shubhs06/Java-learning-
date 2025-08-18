package SortingAlgorithm;

import java.util.Scanner;

public class BasicSorting {

    static void SelectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int smallest = i;
            for (int j = i+1; j < n -1; j++) {
                if (arr[smallest] > arr[j])  {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        System.out.print("SelectionSort Array is : ");
        for (int i = 0 ; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void BubbleSort(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            boolean swap = false;
            for (int j = 0; j < n-1 -i; j++) {
                if (arr[j] > arr[j+1]) {
                    //Swap
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swap = true;

                }
            }
            if (swap != true ) break;
        }
        System.out.print("BubbleSort Array is : ");
        for (int i = 0 ; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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
        BubbleSort(numbers);
        SelectionSort(numbers);
        in.close();
    }
}
