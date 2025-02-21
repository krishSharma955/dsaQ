import java.util.ArrayList;

public class Union {
    public static void union(int arr1[], int arr2[]) {
        ArrayList<Integer> set = new ArrayList<>();
        for(int i = 0; i<arr1.length; i++) {
            if(!set.contains(arr1[i])) {
                set.add(arr1[i]);
            }
        }
        for(int i = 0; i<arr2.length; i++) {
            if(!set.contains(arr2[i])) {
                set.add(arr2[i]);
            }
        }
        printAL(set);
    }

    public static void unionOpt(int arr1[], int arr2[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0;
        int j = 0;
        while(i<n1 && j<n2) {
            if(arr1[i]<arr2[j]) {
                if(list.size() == 0 || !list.contains(arr1[i])) {
                    list.add(arr1[i]);
                }
                i++;
            }
            else {
                if(list.size() == 0 || !list.contains(arr2[j])) {
                    list.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<n1) {
            if(list.size() == 0 || !list.contains(arr1[i])) {
                list.add(arr1[i]);
            }
            i++;
        }
        while(j<n2) {
            if(list.size() == 0 || !list.contains(arr2[j])) {
                list.add(arr2[j]);
            }
            j++;
        }
        printAL(list);
    } //TC-> O(n1+n2), SC->O(n1+n2) {but for returning the ans}

    public static void printAL(ArrayList<Integer> set) {
        for(int i = 0; i<set.size(); i++) {
            System.out.print(set.get(i));
        }
        System.out.println();
    }

    public static void printArr(int arr[]) {
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr1[] = {-5, -4, -1, 1, 7};
        int arr2[] = {-3, 0, 1, 8};
        union(arr1, arr2);
        unionOpt(arr1, arr2);
    }
}
