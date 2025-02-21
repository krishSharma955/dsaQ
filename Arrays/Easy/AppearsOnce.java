public class AppearsOnce {
    public static int onceBrute(int arr[]) {
        int count = 0;
        int num = 0;
        for(int i = 0; i<arr.length; i++) {
            for(int j = 0; j<arr.length; j++) {
                if(arr[j]==arr[i]) {
                    count++;
                }
            }
            if(count==1) {
                num = arr[i];
            }
        }
        return num;
    } //TC-> O(N^2), SC-> O(1)

    public static int onceOpt(int arr[]) {
        int xor = 0;
        for(int i = 0; i<arr.length; i++) {
            xor = xor^arr[i];
        }
        return xor;
    } //TC-> O(N), SC-> O(1) {XOR of a number with itself is zero}
    
    public static void main(String[] args) {
        int arr[] = {4,1,2,1,2};
        // System.out.println(onceBrute(arr));
        System.out.println(onceOpt(arr));
    }
}
