// Problem: Best Time to Buy & Sell Stock
// Platform: LeetCode
// Difficulty: Easy
// Approach: Track minimum price and max profit
// Time Complexity: O(n)
// Space Complexity: O(1)


import java.util.*;
public class buyAndSell {
    static int maxProfit(int[] prices){
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int i = 0; i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }
            else{
                int profit = prices[i] - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = sc.nextInt();

        int[] prices = new int[n];
        System.out.print("Enter Elements:");
        for(int i=0;i<n;i++){
            prices[i] = sc.nextInt();

        }

        int result = maxProfit(prices);

        System.out.println("Max Profit is :" + result);

        sc.close();
    }

}
