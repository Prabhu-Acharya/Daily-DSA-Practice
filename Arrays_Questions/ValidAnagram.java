import java.util.*;

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String 1:");
        String s = sc.nextLine();

        System.out.println("Enter String 2:");
        String t = sc.nextLine();

        boolean result = isAnagram(s, t);

        if (result) {
            System.out.println("Valid Anagram..");
        } else {
            System.out.println("Not a Valid Anagram...");
        }
    }

    static boolean isAnagram(String s, String t) {

        // FREQUENCY ARRAY
        // COMPLEXITY--- O(n)


        // int f1[] = new int[26];
        // for (char ch : s.toCharArray()) {                   
        //     f1[ch - 'a']++;                                  
        // }

        // int f2[] = new int[26];
        // for (char ch : t.toCharArray()) {
        //     f2[ch - 'a']++;
        // }

        // return Arrays.equals(f1, f2);


        // SORTING METHOD
        // COMPLEXITY -- O(n.LOGn)

        if(s.length()!= t.length()){
            return false;
        }

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }

}
