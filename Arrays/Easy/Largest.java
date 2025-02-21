import java.util.*;
public class Largest {
    public static int largestElement(int arr[]) {
        // int largest = Integer.MIN_VALUE;
        // for(int i = 0; i<arr.length; i++) {
        //     if(arr[i]>largest) {
        //         largest = arr[i];
        //     }
        // }
        // return largest;

        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,3,8,1};
        System.out.println(largestElement(arr));
    }
}
