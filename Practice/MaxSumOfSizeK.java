import java.util.*;
public class MaxSumOfSizeK {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter element:");
        for(int i =0;i<n;i++){
            nums[i] = sc.nextInt();

        }
        System.out.println("Enter K:");
        int k = sc.nextInt();

        System.out.println(maxSum(nums, k));

    }
    public static int maxSum(int[] nums, int k){
        int windowSum = 0;

        for(int i =0;i<k;i++){
            windowSum += nums[i];

        }
        int maxSum = windowSum;

        for(int i=k;i<nums.length;i++){
            windowSum += nums[i];
            windowSum -= nums[i-k];

            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
}
