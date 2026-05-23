package may21;

public class BestTimeSellAndbuyStocks {

    public static void main(String[] args) {
        int[] prices = {7 , 1, 5, 3, 6,4};
        int maxProfit = 0 ;
        int minPrice = prices[0];
        for(int i = 1 ; i < prices.length; i++ ){

            maxProfit = Math.max(maxProfit , (prices[i] - minPrice));
            minPrice = Math.min(minPrice , prices[i]);

        }

        System.out.println(maxProfit);

    }
}


/*

 // comparing each pair to know the maximum profit
  int maxProfit = 0;
        for(int i = 0 ;i < prices.length ; i++ ){
            for(int j = i+1 ; j < prices.length; j++ ){

                if(( prices[j] - prices[i] )> maxProfit){
                    maxProfit =  prices[j] - prices[i];
                }
            }
        }


 */
