import java.util.*;
public class SubarraySumEqualsK {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = sc.nextInt();

        int nums[] = new int[n];
        System.out.println("Enter element:");
        for(int i =0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter value of K:");
        int k = sc.nextInt();

        System.out.println("Maximum subarry sum is " +subarraySum(nums, k));
    }
    public static int subarraySum(int[] nums, int k){
        HashMap<Integer, Integer> map= new HashMap<>();
        map.put(0,1 );

        int count =  0;
        int sum = 0;

        for(int num:nums){
            sum += num;

            if(map.containsKey(sum - k)){
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;

    }

}
