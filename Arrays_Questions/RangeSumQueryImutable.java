import java.util.*;

public class RangeSumQueryImutable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        if(n <= 0){
            System.out.println("Invalid size!");
            return;
        }

        int nums[] = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        long prefix[] = new long[n];
        prefix[0] = nums[0];

        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        System.out.println("Enter queries (left right):");

        while(q-- > 0){
            int left = sc.nextInt();
            int right = sc.nextInt();

            long sum = (left == 0) ? prefix[right] : prefix[right] - prefix[left-1];

            System.out.println("Sum = " + sum);
        }
    }
}