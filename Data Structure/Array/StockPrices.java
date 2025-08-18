package Array;

import java.util.Scanner;

public class StockPrices {
    public static int get_profit(int[] prices){
        int profit=0;
        int max_price = 0;           //setting selling
        int min_price = Integer.MAX_VALUE;            //getting buying
        for (int i = 0; i < prices.length; i++) {
            if (min_price < prices[i]) {
                profit = prices[i] - min_price;
                max_price =  Math.max(max_price, profit);
            } else{
                min_price = prices[i];
            }
        }
        return max_price;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter Size of Array : ");
        int size = in.nextInt();
        int numbers[] = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Please enter array "+ (i+1) + " Element : ");
            numbers[i] = in.nextInt();                              //O(n)
        }
        System.out.print("Given Array is : ");
        for (int i : numbers) {
            System.out.print( i + " ");                              //O(n)
        }
        System.out.println();
        int profit = get_profit(numbers);
        System.out.println("Profit Of the Week Day is : " + profit);
        in.close();
    }
}
