package Arrays;

import java.util.Arrays;
import java.util.Collections;
public class KthElement {
    public  static int kSmallest(Integer[] arr, int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static int kthLargest(Integer[] arr, int k){
        Arrays.sort(arr,Collections.reverseOrder());
        return arr[k-1];
    }
    public static void main(String[] args) {
        Integer arr[] = new Integer[]{12,3,5,7,10,19};
        int k= 2;

        System.out.println("Kth Smallest element is " +
                            kSmallest(arr,k) );
        System.out.println("Kth Largest element is " +
                           kthLargest(arr,k));
    }
}
