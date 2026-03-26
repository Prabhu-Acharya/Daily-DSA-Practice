import java.util.*;
public class MaxAndMin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        
        System.out.println("enter element:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter element:");
        for(int i =0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        maxMin(nums);
    }
    static void maxMin(int[] nums){
        int max = nums[0];
        int min = nums[0];
        for(int i =0;i<nums.length;i++){
            if(nums[i]>max){
                max  = nums[i];
            }
            if(nums[i]<min){
                min  = nums[i];
            }
        }
        System.out.println("max element :" +max);
        System.out.println("min element :" +min);
    }
}
