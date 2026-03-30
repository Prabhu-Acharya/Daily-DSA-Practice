import java.util.*;
public class FirstUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter element:");
        for(int i =0;i<n;i++){
            nums[i] = sc.nextInt();

        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+ 1);

        }
        for(int num: nums){
            if(map.get(num)==1){
                System.out.println("first unique element:" +num);
                return;
            }
        }
        System.out.println("No unique element found...");
    }
    
}
