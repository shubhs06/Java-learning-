package Inheritance.Array;

import Inheritance.Array.ArrayOperations.Statistics;

public class outputoArOp {
    public static void main(String[] args) {
        ArrayOperations opr = new ArrayOperations(new int[]{1,5,5,6,4});
        ArrayOperations.Statistics sta = opr.new Statistics();
        System.out.println(sta.Mean());
         System.out.println(sta.median());

    }
     
}
