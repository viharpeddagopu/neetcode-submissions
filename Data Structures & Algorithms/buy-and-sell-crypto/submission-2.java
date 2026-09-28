class Solution {
	public int maxProfit(int[] prices) {
		int l = 0;
		int profit = 0, mP = 0;
		
		for(int r = 1; r < prices.length; r++){
			if(prices[r] < prices[l]){
				l = r;
				continue;
			}
			mP = Math.max(mP, prices[r] - prices[l]);
		}
		return mP;
	}
}