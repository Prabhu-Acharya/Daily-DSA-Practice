import java.util.*;
public class FrequencyCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter element:");
        for(int i = 0; i< n;i++){
            nums[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map  = new HashMap<>();

        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequency Count:");
        for(int key : map.keySet()){
            System.out.println(key+ "->" +map.get(key));
        }
        sc.close();
    }
   
}
