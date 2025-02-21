public class MoveZerostoEnd {
    public static void moveZerosOpt(int arr[]) {
        int j = -1;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] == 0) {
                j = i;
                break;
            }
        }
        if(j == -1) {
            printArr(arr);
        }
        for(int i = j+1; i<arr.length; i++) {
            if(arr[i]!=0) {
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        printArr(arr);
    }
    
    public static void printArr(int arr[]) {
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,0,2,3,2,0,0,4,5,1};
        moveZerosOpt(arr);
    }
}
