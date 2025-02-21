public class LongestSubArrSumK {
    public static int longestSubarray(int arr[], int k) { //Brute
        int len = 0;
        for(int i = 0; i<arr.length; i++) {
            int sum = 0;
            for(int j = i; j<arr.length; j++) {
                sum += arr[j];
                if(sum == k) {
                    len = Math.max(len, j-i+1);
                }
            }
        }
        return len;
    } //TC-> O(N^2), SC-> O(1)
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,1,1,4,2,3};
        int k = 3;
        System.out.println(longestSubarray(arr, k));
    }
}
