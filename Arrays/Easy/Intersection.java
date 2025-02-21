import java.util.ArrayList;

//for sorted arrays
public class Intersection {
    public static void interBrute(int arr1[], int arr2[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        int visited[] = new int[n2]; //to check the presence of elements
        for(int i = 0; i<n1; i++) {
            for(int j = 0; j<n2; j++) {
                if(arr1[i]==arr2[j] && visited[j]==0) {
                    list.add(arr1[i]);
                    visited[j] = 1;
                    break;
                }
                if(arr2[j]>arr1[i]) {
                    break;
                }
            }
        }
        printAL(list);
    } //TC-> O(n1*n2), SC-> O(n2)

    public static void interOpt(int arr1[], int arr2[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0;
        int j = 0;
        while(i<n1 && j<n2) {
            // if(arr1[i]<arr2[j]) { //if repetition is allowed
            //     i++;
            // }
            // else if(arr2[j]<arr1[i]) {
            //     j++;
            // }
            // else {
            //     list.add(arr1[i]);
            //     i++;
            //     j++;
            // }
            if(arr1[i]==arr2[j] && !list.contains(arr1[i])) { //if repetition is not allowed
                list.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]) {
                i++;
            }
            else {
                j++;
            }
        }
        printAL(list);
    } //TC-> O(n1+n2), SC->O(1)

    public static void printAL(ArrayList<Integer> list) {
        for(int i = 0; i<list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr1[] = {1,1,2,2,3,3,4,5,6};
        int arr2[] = {2,3,3,5,6,6,7};
        interBrute(arr1, arr2);
        interOpt(arr1, arr2);
    }
}                                  