import java.util.Scanner;

public class ArrayUtility {
     public static int[] inputArrayElements() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of Elements : ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while (i < nums.length) {
            System.out.print("Please Enter the Element no " + (i + 1) +" : ");
            nums[i] = input.nextInt();
            i++;

        }
        return nums;
    }

    public static int[] [] input2DArrayElements() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of Elements in rows : ");
        int rows = input.nextInt();
        System.out.print("Enter the Number of Elements in columns : ");
        int column = input.nextInt();
        int[] []numArray = new int[rows][column];
        
        
        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j < column) {
                System.out.print("Please Enter the Element row: " + (i + 1) +" column: " + (j + 1) + " : ");
                numArray[i][j] = input.nextInt();
                j++;
            }
            i++;

        }
        return numArray;
        
    }    
    public static void DisplayArray(int [] numArray){
        int i = 0 ;
        while (i < numArray.length) {
            System.out.print(numArray[i] + " " );
            i++;
        }
        System.out.println(); 
    }
}
