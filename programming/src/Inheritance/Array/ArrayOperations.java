package Inheritance.Array;

public class ArrayOperations {

    private int[] num;

    

    public ArrayOperations(int[] num) {
        this.num = num;
    }



    public class Statistics {

        double Mean(){
            double sum=0;
            for (int i : num) {
                sum += i;

            }
            return sum/num.length;
        }

        double median(){
            int[] sort = num.clone();
            java.util.Arrays.sort(sort);
            int middle = sort.length / 2;
            if (sort.length % 2 == 0) {
                return (sort[middle - 1] + sort[middle]) / 2.0;
            } else {
                return sort[middle];
            }
        }    
        
    }

}
