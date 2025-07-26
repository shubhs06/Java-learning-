import java.util.Scanner;

public class MaxArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the Elements in Array : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < arr.length ; i++ ){
            System.out.print("Please enter the element no " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        } 
        MaxNO(arr);

    }
    static void MaxNO(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Number is Maximum : " + max);
    }
}
