public class SortArrZeroOneTwo {
    public static void better(int arr[]) {
        int cntZ = 0, cntO = 0, cntT = 0;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i]==0) {
                cntZ++;
            }
            else if(arr[i]==1) {
                cntO++;
            }
            else {
                cntT++;
            }
        }
        for(int i = 0; i<cntZ; i++) {
            arr[i] = 0;
        }
        for(int i = cntZ; i<cntO+cntZ; i++) {
            arr[i] = 1;
        }
        for(int i = cntO+cntZ; i<arr.length; i++) {
            arr[i] = 2;
        }
        printArr(arr);
    } //TC-> O(2N), SC-> O(1)

    public static void optimized(int arr[]) { //DNF Algo {Dutch National Flag}
        int low = 0, mid = 0, high = arr.length-1;
        while(mid<=high) {
            if(arr[mid]==0) {
                //swap a[low] & arr[mid]
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1) {
                mid++;
            }
            else { //2
                //swap arr[mid] & arr[high]
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        printArr(arr);
    } //TC-> O(N) {each sort +1 and n elem sorted}, SC-> O(1)

    public static void printArr(int arr[]) {
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,0,1,2,1,2,0,0,0,1};
        // better(arr);
        optimized(arr);
    }
}
