public class LinearSearch {
    public static boolean linearSearch(int arr[], int k) {
        for(int i = 0; i<arr.length; i++) {
            if(arr[i]==k) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,6};
        int k = 1;
        System.out.println(linearSearch(arr, k));
    }
}
