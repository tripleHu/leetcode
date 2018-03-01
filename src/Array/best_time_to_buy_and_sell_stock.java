package Array;

public class best_time_to_buy_and_sell_stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,4,1};
		System.out.println(maxProfit(a));
	}
	public static int maxProfit(int[] prices) {
        int profit = 0; 
        for(int i = 0; i < prices.length; i++){
        	for(int j = i; j < prices.length; j++){
        		profit = Math.max(profit,prices[j] - prices[i]);
        	}
        }
        return profit;
    }
}
