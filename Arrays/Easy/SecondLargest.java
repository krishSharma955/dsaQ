import java.util.*;
public class SecondLargest {
    public static int secondLargest(int arr[]) { //Brute
        Arrays.sort(arr); //TC- O(nlogn)
        int secLargest = 0;
        for(int i = arr.length-2; i>=0; i--) {
            if(arr[i] != arr[arr.length-1]) {
                secLargest = arr[i];
                break;
            }
            else { //if all the elements are same
                secLargest = -1;
            }
        }
        return secLargest;
    }
    //Worst case TC - (nlogn + n)

    public static int secondLargestII(int arr[]) { //Better
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++) { //O(N)
            if(arr[i]>largest) {
                largest = arr[i];
            }
        }
        for(int i = 0; i<arr.length; i++) { //O(N)
            if(arr[i]>secLargest && arr[i]!=largest) {
                secLargest = arr[i];
            }
        }
        return secLargest;
    } //TC - O(2N)

    public static int secondLargestIII(int arr[]) { //Optimized
        int largest = arr[0];
        int secLargest = Integer.MIN_VALUE;
        for(int i = 1; i<arr.length-1; i++) {
            if(arr[i]>largest) {
                secLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>secLargest) {
                secLargest = arr[i];
            }
            else {
                secLargest = -1;
            }
        }
        return secLargest;
    }
    //TC - O(N)
    public static void main(String[] args) {
        int arr[] = {5,7,9,9,2,1};
        System.out.println(secondLargest(arr));
        System.out.println(secondLargestII(arr));
        System.out.println(secondLargestIII(arr));
    }
}
