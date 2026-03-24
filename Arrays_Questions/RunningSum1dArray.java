import java.util.*;
public class RunningSum1dArray {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("enter size of array:");
    int n = sc.nextInt();

    int[] nums = new int[n];
    System.out.println("enter elements:");
    for(int i =0;i<nums.length;i++){
        nums[i] = sc.nextInt();

    }
    int[] result = runningSum(nums);
    System.out.println("Running Sum:");
    for(int num: result){
        System.out.print(num+ " ");
    }
   } 
   public static int[] runningSum(int[] nums){
    for(int i =1;i<nums.length;i++){
        nums[i] = nums[i] + nums[i-1];
    }
    return nums;
   }
   
}
