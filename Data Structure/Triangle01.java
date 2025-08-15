public class Triangle01 {

    public static void pattern01(int n){
        for (int i =  1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                if((i + j) % 2 == 0){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }

    public static void pattern02(int n){
        int counter =1;
        for (int i =  1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(counter +" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void pattern03(int n){
        //first half
        for (int i =  1; i <= n; i++) {
            //stars -i
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            //spaces
            for (int j = 1; j < 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for (int i = n; i >= 1; i--) {
            //stars -i
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            //spaces
            for (int j = 1; j < 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern04(int n){
        //first half
        for (int i =  1; i <= n ; i++){
            for (int j = 1; j <= (n- i) ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.err.println();
        }
    }

    public static void pattern05(int n){
        //first half
        for (int i =  1; i <= n ; i++){
            for (int j = 1; j <= (n- i) ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.err.println();
        }
    }

    public static void pattern06(int n){
        //first half
        for (int i =  1; i <= n ; i++){
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) -1; j++) {
                System.out.print("*");
            }
            System.err.println();
        }
        //2nd half
        for (int i =  n; i >= 1 ; i--){
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) -1; j++) {
                System.out.print("*");
            }
            System.err.println();
        }
    }
    public static void pattern07(int n){

        for (int i =  1; i <= n ; i++){
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                    System.out.print(j);
            }
            for (int j = i -1; j >= 1 ; j--) {
                    System.out.print(j);
            }
            System.err.println();
        }
    }
    public static void pattern08(int n){

        for (int i =  0; i <= n ; i++){
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            int num =1;

            for (int j = 0; j <=i ; j++) {
                    System.out.print(num + " " );
                    num = num * (i -j)/ (j + 1);

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    pattern08(3 );
}
}
