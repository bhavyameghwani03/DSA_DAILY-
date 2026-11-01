package Array_L2;

public class buy_and_sell_1 {
    public  static int maxProfit(int[] prices) {
        int maxprofit = 0;
        int min=prices[0];
        for (int i = 0; i < prices.length; i++) {
            maxprofit =Math.max(maxprofit,prices[i]-min);
            min=Math.min(min,prices[i]);
        }
        return maxprofit;

    }

    static void main() {
        int[] price={7,6,5,4,3,2};
        System.out.println(maxProfit(price));
    }
}
