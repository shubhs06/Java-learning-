package Array;

import java.util.Scanner;

public class LargestNumber {
    int largestNumberFinder(int [] numbers ){
        int max = Integer.MIN_VALUE;
        for (int i : numbers) {
            if (i > max) {                      //O(n)
                max = i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        LargestNumber lr = new LargestNumber();
        Scanner in = new Scanner(System.in);
        int numbers[] = new int[4];
        System.out.println("Please enter ur array");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();                              //O(n)
        }
        for (int i : numbers) {
            System.out.print(i + " ");                              //O(n)
        }

        int max = lr.largestNumberFinder(numbers);
        System.out.printf("%d is your largest number",max);


    in.close();
    }
}

// time complexity is : O(n) + O(n) + O(n) =3O(n)
//                                         =O(n)