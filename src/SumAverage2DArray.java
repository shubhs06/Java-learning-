import java.util.Scanner;

public class SumAverage2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] numArr = ArrayUtility.input2DArrayElements();
        long sum = Sum(numArr);
        double avg = Average(numArr);
        System.out.println("Your sum of 2D array is : " + sum);
        System.out.println("Your Average of 2D array is : " + avg);

    }
    public static double Average(int[][] numArr){
        if (numArr.length == 0) {
            return 0;
        }
        int row = numArr.length;
        int cols = numArr[0].length;
        double size = row * cols ;
        return Sum(numArr) / size;
    }
    public static long Sum(int[][] numArr){
        long sum = 0;
        int i = 0;
        while (i < numArr.length) {
            int j = 0;
            while (j < numArr[i].length) {
                sum += numArr[i][j];
                j++;
            }

            i++;
        }

        return sum;
    }
}
