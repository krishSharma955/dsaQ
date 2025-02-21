public class MaxConsOnes {
    public static int maxOnes(int arr[]) {
        int maxCount = 0;
        int count = 0;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i]==1) {
                count++;
                maxCount = Math.max(maxCount, count);
            }
            else {
                count = 0;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1};
        System.out.println(maxOnes(arr));
    }
}
