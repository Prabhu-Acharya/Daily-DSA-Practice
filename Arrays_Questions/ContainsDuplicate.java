import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        boolean result = containsDuplicate(nums);
        System.out.println("containsDuplicate:" + result);
    }

    // ******************************BRUTE FORCE APPROACH
    // *********************************** */
    // TIME LIMIT EXCEED
    // COMPLEXITY -- O(n2)

    // static boolean containsDuplicate(int[] nums){
    // for(int i =0;i<nums.length;i++){
    // for(int j = i+1;j<nums.length;j++){
    // if(nums[i]==nums[j]){
    // return true;
    // }
    // }
    // }
    // return false;

    // ********************** No TIME LIMIT EXCEPTION ****************************/
    // COMPLEXITY -- O(n.logn)

    // static boolean containsDuplicate(int[] nums) {
    // Arrays.sort(nums);
    // for (int i = 0; i < nums.length - 1; i++) {
    // if (nums[i] == nums[i + 1]) {
    // return true;
    // }
    // }
    // return false;

    // *********************** OPTIMIZED APPROACH ***************** */

    static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num:nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
