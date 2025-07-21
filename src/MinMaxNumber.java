import java.util.*;
public class MinMaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i=0;
        while (i < nums.length) {
            System.out.print("Please enter the element no " + (i+1) +" :");
            nums[i] = input.nextInt();
            i++;
        }
        int max = Max(nums);
        int min = Min(nums);
        System.out.println("Your minmum number is " + min);
        System.out.print("Your Maximum number is " + max);
    }
    public static int Max(int[] nums ){
        if (nums.length == 0) {
            return Integer.MIN_VALUE;

        }
        
        int max = nums[0];
        int i = 1;
        while (i < nums.length) {
            if (max < nums[i]) {
                max = nums[i];
            }
            i++;
        }
        return max;
    }
    public static int Min (int[] nums){
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < nums.length) {
            if (min > nums[i]) {
                min = nums[i];
            }    
            i++;
        }
        return min;
    }
}
