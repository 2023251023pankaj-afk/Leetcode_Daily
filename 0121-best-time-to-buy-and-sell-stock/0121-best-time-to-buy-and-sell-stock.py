class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        n = len(prices)
        profit =0
        max_pro=0
        buy = nums[0]
        for i in prices:
            buy=prices[0]
            if prices[i]<buy:
                buy = prices[i]
            if prices[i]>sell:
                sell = prices[i]

        return sell - buy