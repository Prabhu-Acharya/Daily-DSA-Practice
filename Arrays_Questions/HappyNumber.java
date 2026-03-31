import java.util.*;
public class HappyNumber {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number:");
    int n = sc.nextInt();

    System.out.println(isHappy(n));

   }
   static boolean isHappy(int n){
    HashSet<Integer> set = new HashSet<>();

    while(n != 1){
        if(set.contains(n)){
            return false;
        }
        set.add(n);
        n = getNext(n);
    }
    return true;
   }
   public static int getNext(int n){
    int sum = 0;

    while(n>0){
        int digit = n%10;
        sum += digit*digit;
        n /=10;
    }
    return sum;
   }
}
