import java.util.*;
public class ContinuousSubarraySum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = sc.nextInt();

        int nums[] = new int[n];
        System.out.println("enter element:");
        for(int i =0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter K:");
        int k = sc.nextInt();

        System.out.println(checkSubarraySum(nums,k));
    }
    public static boolean checkSubarraySum(int[] nums, int k){
        Map<Integer, Integer> map = new HashMap();
        map.put(0,-1);

        int sum = 0;

        for(int i =0;i<nums.length;i++){
            sum += nums[i];

            int rem = ((sum % k)+k)%k;

            if(map.containsKey(rem)){
                if(i-map.get(rem)>=2){

                    return true;
                }
            }else{
                map.put(rem, i);
            }
        }
        return false;
    }
}
