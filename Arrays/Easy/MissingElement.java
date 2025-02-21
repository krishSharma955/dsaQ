import java.util.HashMap;

public class MissingElement {
    public static int missBrute(int arr[]) {
        for(int i = 1; i<arr.length; i++) {
            int flag = 0;
            for(int j = 0; j<arr.length-1; j++) {
                if(arr[j]==i) {
                    flag = 1;
                    break;
                }
            }
            if(flag==0) {
                return i;
            }
        }
        return -1;
    } //TC-> O(N*N), SC-> O(1)

    public static int missBetter(int arr[]) { // no idea
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for(int i = 0; i<arr.length; i++) {
            hashmap.put(arr[i], 1);
        }
        for(int i = 1; i<arr.length; i++) {
            if(hashmap.get(i) == 0) {
                return i;
            }
        }
        return -1;
    } // TC-> O(N)+O(N), SC-> O(N)

    public static int missOptI(int arr[]) { //sum
        int n = arr.length;
        int sum1 = (n*(n+1))/2;
        int sum2 = 0;
        for(int i = 0; i<n; i++) {
            sum2 += arr[i];
        }
        if(sum1==sum2) {
            return -1;
        }
        return sum1-sum2;
    } //TC-> O(N), SC-> O(1)

    public static int missOptII(int arr[]) { //XOR
        int n = arr.length;
        int xor1 = 0;
        int xor2 = 0;
        for(int i = 0; i<n; i++) {
            xor1 = xor1^(i+1);
            xor2 = xor2^arr[i];
        }
        // xor1 = xor1^n;
        return xor1^xor2;
    } //TC-> O(N), SC-> O(1) {this method is better than sum one, for big inputs also}

    public static void main(String[] args) {
        int arr[] = {3,0,1};
        // System.out.println(missBrute(arr));
        // System.out.println(missBetter(arr));
        System.out.println(missOptI(arr));
        System.out.println(missOptII(arr));
    }
}
