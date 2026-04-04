import java.util.*;

public class RunningSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for(int i =0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        for(int i = 1;i<nums.length;i++){
            nums[i] = nums[i] + nums[i-1];
        }
        System.out.println(Arrays.toString(nums));
    }
}
