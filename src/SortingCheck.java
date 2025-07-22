import java.util.*;
public class SortingCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Elements : ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while (i < nums.length) {
            System.out.print("Please enter the element no "+ (i+1)+ " : ");
            nums[i] = input.nextInt();
            i++;
        }
        boolean incre = isIncresing(nums);
        boolean decre = isDecresing(nums);
        if (incre || decre) {
            System.out.println("Given Array is Sorted ");
            
        } else {
            System.out.println("Given Array is not Sorted ");
        }


    }
    
    public static boolean isDecresing(int nums[]){
        int i = 1;
        while (i < nums.length) {
            if (nums[i] > nums[i -1]) {
                return false;           
            }
            i++;
        }
        return true;
    }
    public static boolean isIncresing(int nums[]){
        int i = 1;
        while (i < nums.length) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
