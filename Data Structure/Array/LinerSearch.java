package Array;

public class LinerSearch {

    public static int LinerSearchOfindex(int[] numbers , int key){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers = {2,6,2,6,46,5,2,2,65};
        int key =2;

        int index = LinerSearchOfindex(numbers, key);
        if (index == -1) {
            System.out.println("not Have number");
        } else {
            System.out.println("Index of given number is :"+ index);
        }
    }
}
