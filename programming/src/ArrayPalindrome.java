
public class ArrayPalindrome {
    public static void main(String[] args) {
        int[] numArray = ArrayUtility.inputArrayElements();
        boolean pali = Plindrome(numArray);
        if (pali) {
            System.out.println("Given Array is Palindrome  ");
        }else{
            System.out.println("Given Array is Not Paindrome ");
        }

    }
    public static boolean Plindrome(int numArray[]){
        int i = 0;
        while (i < numArray.length / 2) {
            if (numArray[i] != numArray[numArray.length - 1 - i ]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
