public class ReverseInteger {
    public static void main(String[] args) {
        int num = 54;
        int reverse =0 ;
            for (int i = num; i != 0; i /= 10) {
                int digit = i % 10 ;
                reverse = reverse * 10 + digit;
            }
            System.out.println(reverse);

    }
}
// f(n)= 2 + n +1
//f(n) = n //constant removed