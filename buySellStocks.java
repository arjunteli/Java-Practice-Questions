import java.util.*;
public class buySellStocks {
    public static int profit(int prices[]){
        int profit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for(int i =0;i<prices.length;i++){
            int SP = prices[i];
            buyPrice = Math.min(buyPrice,prices[i]);//
            profit = Math.max(profit,SP-buyPrice);
        }



        return profit;
    }
    public static void main(String args [] ){
        int prices [] = {7,1,5,3,6,4};
        System.out.println("Max profit is = "+profit(prices));

    }    
}
