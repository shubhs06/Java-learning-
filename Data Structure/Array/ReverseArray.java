package Array;

public class ReverseArray {
    public static void main(String[] args) {
        int [] number ={4,6,2,5,3};
        // int [] newarray = new int[number.length ];
        // for (int i = 0; i < newarray.length; i++) {
        //     newarray[i] = number[number.length -1 -i];
        //     System.out.print(newarray[i]);
        // }
        int start =0 ,last = number.length -1;
        while (start < last) {
            int temp = number[last];
            number[last] = number[start];
            number[start] = temp;
            start++;
            last--;
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        
    }
}
