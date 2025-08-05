import java.util.Scanner;

public class RverseArray {
    public static void main(String[] args) {
        
        int[] numArray = ArrayUtility.inputArrayElements();
        reversed(numArray);
        System.out.println("Your Reversed Array Is ");
         ArrayUtility.DisplayArray(numArray);
    }
    public static boolean reversed (int[] numArray){
        int i = 0;
        while (i < numArray.length / 2) {
            int swap = numArray[i];
            numArray[i] = numArray[(numArray.length - 1) -i];
            numArray[(numArray.length - 1) -i] = swap;
            i++;
        }
        return true;
    }
    
}
