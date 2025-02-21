public class MaxSubarraySum {
    public static int brute(int arr[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++) {
            currsum = arr[i];
            for(int j = 0; j<arr.length; j++) {
                currsum += arr[j];
                maxsum = Math.max(maxsum, currsum);
            }
        }
        return maxsum;
    } //TC- O(N^2)

    public static int optimized(int arr[]) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        int start = -1;
        // int ansStart = -1, ansEnd = -1;
        for(int i = 0; i<arr.length; i++) {
            if(currsum==0) start = i; 
            currsum += arr[i];
            maxsum = Math.max(maxsum, currsum);
            // ansStart = start;
            // ansEnd = i;
            if(currsum<0) currsum = 0;
        }
        return maxsum;
    } //TC-> O(N), SC-> O(1)
    //printing the max subarray
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        // System.out.println(brute(arr));
        System.out.println(optimized(arr));
    }
}
