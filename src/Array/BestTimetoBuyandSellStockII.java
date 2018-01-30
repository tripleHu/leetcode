package Array;

public class BestTimetoBuyandSellStockII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = { 4, 0, 1, 0, 0, 0, 6, 1, 4 };
		System.out.println(maxProfit(prices));
	}

	public static int maxProfit(int[] prices) {
		Result result = new Result();
		result.profit = 0;
		result.Canbuy =true;
		
		if (prices.length <= 1) {
			return 0;
		}
		if (prices.length == 2) {
			return prices[0] > prices[1] ? 0 : prices[1] - prices[0];
		}
		for (int i = 0; i < prices.length; i++) {
			Caculate(prices, i, result);
		}

		return result.profit;
	}

	public static Result Caculate(int prices[], int index, Result result) {
		if (index == prices.length - 1) {
			result.profit += result.Canbuy ? 0 : prices[index];
			result.Canbuy =result.Canbuy;
			return result;
		} else {
			if (result.Canbuy) {
				if (prices[index + 1] > prices[index]) {
					result.profit += (-1) * prices[index];
					result.Canbuy =false;
				}
				if (prices[index + 1] < prices[index]) {
					result.profit += 0;
				}
			} else{
				if (prices[index + 1] > prices[index]) {
					result.profit += 0;
				}
				if (prices[index + 1] < prices[index]) {
					result.Canbuy = true;
					result.profit += prices[index];
				}
			}
			return result;
		}

	}
	public static class Result{
		public int profit;
		public boolean Canbuy;
	}
}
