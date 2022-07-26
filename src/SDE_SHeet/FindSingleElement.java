package SDE_SHeet;

import java.util.Arrays;

public class FindSingleElement {
    static int findSingle(int[] arr, int n){
        int res = arr[0];
        for (int i=1; i<n; i++)
            res = res ^ arr[i];
        return res;
    }

    public static void main(String[] args) {
        int ar[] = {2, 2,3,1, 5, 4, 5, 3, 4};
        int n = ar.length;
        System.out.println("Element occurring once is " +
                findSingle(ar, n) + " ");
    }
}
//    static int singleElement(int arr[], int n){
//        int low = 0, high = n-2;
//        int mid;
//
//        while (low<=high){
//            mid = (low+high)/2;
//            if (arr[mid] == arr[mid ^ 1]){
//                low= mid+1;
//            }else high = mid -1;
//        }
//        return arr[low];
//    }
//
//    public static void main(String[] args) {
//        int arr[] = { 2, 3, 5, 4, 5, 3, 4 };
//        int size = 7;
//        Arrays.sort(arr);
//
//        System.out.println(singleElement(arr, size));
//    }
//}