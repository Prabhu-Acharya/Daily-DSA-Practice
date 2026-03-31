import java.util.*;
public class MoveZeros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter element:");
        for(int i =0;i<n;i++){
            nums[i] = sc.nextInt();;

        }
        moveZero(nums);

        System.out.println("After moving zeros:");
        for(int num:nums){
            System.out.print(num+ " ");
        }
    }
    static int moveZero(int[] nums){
        int j =0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i]= nums[j];
                nums[j] = temp;
                j++;   
            }
        }
        return 0;
    }
}
