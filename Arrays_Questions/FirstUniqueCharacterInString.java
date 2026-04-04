import java.util.*;
public class FirstUniqueCharacterInString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String s = sc.nextLine();

        int result = firstUnqChar(s);

        System.out.println("First Unique Character Index:" +result);
    }
    public static int firstUnqChar(String s){
        int freq[] = new int[26];

        for(int i =0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }

        for(int i =0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}