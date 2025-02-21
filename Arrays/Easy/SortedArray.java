public class SortedArray {
    public static boolean isSorted(int arr[]) {
        for(int i = 0; i<arr.length-1; i++) {
            if(arr[i]>arr[i+1]) {
                return false;
            }
        }
        return true;
    } //TC - O(N)
    public static void main(String[] args) {
        int arr[] = {1,7,3,4,4,5};
        System.out.println(isSorted(arr));
    }
}
