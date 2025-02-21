public class RemoveDupSortedArray {
    public static int removeDuplicates(int arr[]) {
        int i = 0;
        for(int j = 0; j<arr.length; j++) {
            if(arr[i]!=arr[j]) {
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    } //TC - O(N)
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        System.out.println(removeDuplicates(arr));
    }
}
