import java.util.Scanner;

public class DeleteNumberInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] numArray = ArrayUtility.inputArrayElements();
        System.out.print("Now, Enter then number you Want to delete from Array : ");
        int numDelete = input.nextInt();
        int[] newArray = deleteArray(numArray, numDelete);
        System.out.println("Your New array is ");
        ArrayUtility.DisplayArray(newArray);


    }
    public static int[] deleteArray(int[] numArray, int numDelete){
        int occ = NumOccurrencesArray.OfOccurrences(numArray, numDelete);
        if (occ == 0){
            return numArray;
        }
        int newSize = numArray.length - occ ;
        int[] newArray = new int[newSize];
        int i = 0, j = 0;
        while (i < numArray.length) {
            if (numArray[i] != numDelete) {
                newArray[j] = numArray[i];
                j++;
            }
            i++;
        }
        
        return newArray;
    }
    
}
