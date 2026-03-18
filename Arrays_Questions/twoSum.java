import java.util.*;

public class twoSum {

     /*
     * Brute Force Approach (O(n^2))
     * --------------------------------
     * Check every pair using two loops
     
     */

     
    // static int[] TwoSum(int[] nums, int target) {
    //     for (int i = 0; i < nums.length - 1; i++) {
    //         for (int j = i + 1; j < nums.length; j++) {
    //             if (nums[i] + nums[j] == target) {
    //                 return new int[] { i, j };
    //             }
    //         }
    //     }
    //     return new int[] {-1, -1};
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int[] nums = new int[n];
    //     for (int i = 0; i < n; i++) {
    //         nums[i] = sc.nextInt();
    //     }

    //     int target = sc.nextInt();

    //     int[] result = TwoSum(nums, target);

    //     System.out.println(result[0] + " " + result[1]);
    // }


   // ***************************** HASHMAP APPROACH ***********************************************

    /*
     * Optimal Approach (HashMap)
     * --------------------------------
     * Step 1: Traverse array
     * Step 2: Calculate complement (target - current element)
     * Step 3: Check if complement exists in map
     * Step 4: If yes → return indices
     * Step 5: Else → store element in map
     */

    static int[] TwoSum(int[] nums, int target){
    HashMap<Integer,Integer> n = new HashMap<>();

    int[] ans = new int[2];
    for(int i =0;i<nums.length;i++){
        int other = target - nums[i];
        if(n.containsKey(other)){
            ans[0] = n.get(other);
            ans[1] = i;
            break;

        }
        n.put(nums[i],i);
    }
    return ans;
   }
   public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);

    //Input Size
    System.out.println("Enter size of array:");
    int n = sc.nextInt();

    int[] nums = new int[n];

    //Input Elements
    System.out.println("Enter elements:");
    for(int i=0;i<n;i++){
        nums[i] = sc.nextInt();

    }

    //Target Input
    System.out.print("enter target:");
    int target = sc.nextInt();

    //Function call
    int[] result = TwoSum(nums, target);

    //Output
    System.out.println("Indices:" + result[0] + " " + result[1]);
   }
}
