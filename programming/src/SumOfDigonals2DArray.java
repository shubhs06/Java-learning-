public class SumOfDigonals2DArray {
    public static void main(String[] args) {
        int numArr[][] = ArrayUtility.input2DArrayElements();
        long sum = sumOfDigonals(numArr);
        System.out.println("Sum of Digoanals of 2D Arrays Are : " + sum);

    }
    public static long sumOfDigonals(int [][] numArr){
        long leftsum = sumOfLeftDigonals(numArr);
        long rightsum = sumOfRightDigonals(numArr);
        long sum = leftsum + rightsum;
        if (numArr.length % 2 != 0) {
            int ind = numArr.length / 2 ;
            sum -= numArr[ind][ind];     
        }

        return sum ;
    }
    public static long sumOfLeftDigonals(int [][] numArr){
        long sum = 0;
        int i = 0;
        while (i < numArr.length) {
            sum += numArr[i][i];
            i++;
        }

        return sum;
    }
    public static long sumOfRightDigonals(int [][] numArr){
        long sum = 0;
        int i =0;
        while (i < numArr.length) {
            int j = numArr.length - 1 - i;
            sum += numArr[i][j];
            
            i++;

        }

        return sum;
    }
}
