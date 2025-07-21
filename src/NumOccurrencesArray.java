import java.util.*;
public class NumOccurrencesArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number Element : " );
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0 ;
        while (i < nums.length) {
        System.out.print("Please enter the element no " + (i + 1) + " :");   
            nums [i] =  input.nextInt();
            i++;
        }
        System.out.print("Enter the number you Want to Find : ");
        int num = input.nextInt();
        int occerrences = OfOccurrences(nums, num);
        System.out.print("Number of Occurrences Of Given Number are  : " + occerrences);

    }
    public static int OfOccurrences(int[] numArray ,int num){
        int occ = 0;
        int i = 0 ;
        while (i < numArray.length) {
            if (numArray[i] == num) {
                occ++;
            }
            i++;
        }
        return occ;
    }


}
