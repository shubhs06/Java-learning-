package Array;

import java.util.Scanner;

public class WaterTrappingProblem {

    public static int trappingWater (int[] hight){
        //calculate left max
        int[] leftmax = new int[hight.length];
        leftmax[0] = hight[0];
        for (int i = 1; i < leftmax.length; i++) {
            leftmax[i]= Math.max(hight[i], leftmax[i-1]);
        }

        //calculate right max
        int[] rightmax = new int[hight.length];
        rightmax[rightmax.length-1] = hight[hight.length -1];
        for (int i = rightmax.length -2; i >= 0; i--) {
            rightmax[i] = Math.max(hight[i], rightmax[i+1]);
        }

        int trappedWater = 0;
        //loop
        for (int i = 0; i < hight.length; i++) {
            int waterlevel= Math.min(rightmax[i], leftmax[i]);
            trappedWater += (waterlevel - hight[i]);
        }
        return trappedWater;
        //water level =min(left max , right max)
        // trapping water = water level - hight [i] * width


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
        int trapped =trappingWater(numbers);
        System.out.println("Trapped Water is : "+trapped);

        in.close();
    }

}
