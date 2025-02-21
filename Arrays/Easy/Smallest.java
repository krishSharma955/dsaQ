public class Smallest {
    public static int smallest(int arr[]) {
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i]<smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static int secSmallest(int arr[]) {
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;
        for(int i = 1; i<arr.length-1; i++) {
            if(arr[i]<smallest) {
                ssmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i]!=smallest && arr[i]<ssmallest) {
                ssmallest = arr[i];
            }
        }
        return ssmallest;
    }
    //TC - O(N)
    public static void main(String[] args) {
        int arr[] = {4,5,6,2,7,9};
        System.out.println("Smallest: " +smallest(arr));
        System.out.println("Second Smallest: " +secSmallest(arr));
    }
}