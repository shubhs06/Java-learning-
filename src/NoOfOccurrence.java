import java.util.*;
public class NoOfOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the Elements in Array : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < arr.length ; i++ ){
            System.out.print("Please enter the element no " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }   
        Occu(arr);      
    }

    static void Occu(int[] arr){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the Number you want to Find : ");
        int num = input.nextInt();
        int occ = 0;
        for (int i : arr) {
            if (i == num  ) {
                occ++;
            }
        }
        System.out.println("Number of Occurences of number " + num + " is occurs " + occ + " times");

    }
}
