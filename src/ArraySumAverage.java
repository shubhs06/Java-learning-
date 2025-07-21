import java.util.*;
public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of element in Array : ");
        int num = input.nextInt();
        int [] size = new int[num];
        int i = 0;
        while (i < num) {
            System.out.print("Please enter the Element no" + (i + 1) + "  :");
            size[i] = input.nextInt();
            i++;
        }
        long sum = Sum(size);
        double averageOf = AverageOf(size);
        System.out.println("Sum of the numbers Are : " + sum);
        System.out.println("Average Of the numbers Are :" +averageOf); 

    }
    public static long Sum(int[] size){
        int sum = 0;
        int i = 0;
        while (size.length > i) {
            sum += size[i];
            i++;
        }
        return sum;
    }
    public static double AverageOf(int[] size){
        double avg = Sum(size);

        return avg / size.length;
    }
}
