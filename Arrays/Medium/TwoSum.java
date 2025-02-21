import java.util.*;

public class TwoSum {
    public static boolean twoSumBrute(int arr[], int target) {
        for(int i = 0; i<arr.length; i++) {
            for(int j = i+1; j<arr.length; j++) {
                if(arr[i]+arr[j]==target) {
                    return true;
                }
            }
        }
        return false;
    } //TC-> O(N^2)

    public static boolean twoSumOpt(int arr[], int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        while(left<right) {
            if(arr[left]+arr[right]==target) {
                return true;
            }
            else if(arr[left]+arr[right]<target) {
                left++;
            }
            else {
                right--;
            }
        }
        return false;
    } //TC-> O(N)+O(NlogN), SC-> O(1)

    //Best method could be using hashing.
    public static void main(String[] args) {
        int arr[] = {2,6,5,8,11};
        int target = 14;
        System.out.println(twoSumBrute(arr, target));
        System.out.println(twoSumOpt(arr, target));
    }
}