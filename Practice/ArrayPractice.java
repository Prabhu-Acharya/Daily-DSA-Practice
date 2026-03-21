import java.util.*;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // maxMin(arr);
        // reverse(arr);
       

        // System.out.println("Reversed Array:");
        // for (int num : arr) {
        //     System.out.print(num + " ");
        // }

    }

    // ******************* MAX AND MIN ELEMENT ***************************

    // static void maxMin(int[] arr){
    // int max = arr[0];
    // int min =arr[0];

    // for(int i =1;i<arr.length;i++){
    // if(arr[i]> max){
    // max= arr[i];
    // }
    // if(arr[i]<min){
    // min = arr[i];
    // }
    // }
    // System.out.println("Max element:" +max);
    // System.out.println("Min element:" +min);

    // }

// #################################### REVERSE  **********************
    // static void reverse(int[] arr) {
    //     int left = 0;
    //     int right = arr.length - 1;

    //     while (left < right) {
    //         int temp = arr[right];
    //         arr[right] = arr[left];
    //         arr[left] = temp;

    //         left++;
    //         right--;
    //     }
       
    // }

    
}
