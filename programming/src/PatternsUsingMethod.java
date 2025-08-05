import java.util.*;

public class PatternsUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers of Rows for Patterns  : ");
        int num = sc.nextInt();
        RightHalfPyramid(num);
        RightAlignedHalfPyramid(num);
        ReverseRightHalfPyramid(num);
    }
    public static void RightHalfPyramid(int rows){
        System.out.println("Right Half Pyramid is Here");
        int i = 1;
        while (i <= rows) {
            System.out.println(" ");
            int j = 1 ;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            i++;
        }
        System.out.println();
    }
    public static void RightAlignedHalfPyramid(int rows) {
    System.out.println("Right-Aligned Half Pyramid:");

    int i = 1;
    while (i <= rows) {
        int space = 1;
        while (space <= rows - i) {
            System.out.print("  "); // 2 spaces for alignment
            space++;
        }

        int star = 1;
        while (star <= i) {
            System.out.print("* ");
            star++;
        }

        System.out.println();
        i++;
    }
}

    public static void ReverseRightHalfPyramid(int rows){
        System.out.println("Reverse Right Half Pyramid is Here" );

        int i = 1 ;
        while (i <= rows) {
            System.out.println(" ");
            int j = rows ;
            while (j >= i) {
                System.out.print("* ");
                j--;
            }
            i++ ;
        }
        System.out.println();

    }

}
