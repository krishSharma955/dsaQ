public class LeftRotate {
    public static void leftRotateOnePlace(int arr[]) {
        int temp = arr[0];
        for(int i = 1; i<arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        printArr(arr);
    } //TC - O(N), SC - O(1) {extra space}, SC - O(N) {for the Algo bcz of array}

    public static void bruteForce(int arr[], int d) {
        int n = arr.length;
        d = d%n;
        int temp[] = new int[d];
        for(int i = 0; i<d; i++) { //creating temp[]
            temp[i] = arr[i];
        }
        for(int i = d; i<n; i++) { //shifting
            arr[i-d] = arr[i];
        }
        for(int i = n-d; i<n; i++) { //putting temp back
            arr[i] = temp[i-(n-d)];
        }
        printArr(arr);
    } //TC-> O(d)+O(n-d)+O(d) = O(n+d), extra Space SC-> O(d) {temp[]}

    public static void reverseArr(int arr[], int start, int end) {
        while(start<=end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void optimized(int arr[], int d) {
        d = d % arr.length; //IMP
        int n = arr.length;
        reverseArr(arr, 0, d-1);
        reverseArr(arr, d, n-1);
        reverseArr(arr, 0, n-1);
        printArr(arr);
    }
    
    public static void printArr(int arr[]) {
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5};
        // leftRotateOnePlace(arr);

        int arr[] = {1,2,3,4,5,6,7};
        // bruteForce(arr, 3);
        optimized(arr, 4);

    }
}
