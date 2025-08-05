import java.util.Scanner;

public class SearchNoIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] numarr = ArrayUtility.input2DArrayElements();
        System.out.println("Now enter the number you Want to search : ");
        int num = sc.nextInt();
        boolean isFound = search(numarr, num);
        if (isFound) {
            System.out.println("Your number was Found. ");
        } else {
            System.out.println("Your number was not Found. ");
        }


    }
    public static boolean search(int [] [] numarr, int num){
        int i = 0;
        while (i < numarr.length) {
            int j = 0;
            while (j < numarr[i].length) {
                if (numarr[i][j] == num) {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
