package arrays.medium;

public class Buy_Sell_Stocks {

    public static int maxProfit(int[] prices) {

        int profit=0,min=prices[0];
        for(int i=0;i<prices.length;i++){
            profit=Math.max(profit,prices[i]-min);
            min=Math.min(min,prices[i]);
        }

        return profit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
