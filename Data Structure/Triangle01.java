public class Triangle01 {
public static void main(String[] args) {
    pattern01(5);
}
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
}
