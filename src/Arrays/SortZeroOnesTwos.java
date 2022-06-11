package Arrays;

import java.util.Arrays;

public class SortZeroOnesTwos {
    public static void sort012(int a[], int n){
        int low = 0, high = n-1, mid = 0;

        while(mid<=high){
            if(a[mid] == 0){
                int temp = a[low];
                  a[low] = a[mid];
                  a[mid] = temp;
                  low++; mid++;
            }else if(a[mid] == 1){
                mid++;
            }else if(a[mid] == 2){
                int temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;
                high--;
            }
        }
    }
    static void printArray(int arr[], int ar_size){
        int i;
        for ( i =0; i<ar_size;i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    public static void main(String[] args) {
        int arr[] = {1,2,1,0,0,2,1};
        int ar_size = arr.length;
        sort012(arr,ar_size);
        printArray(arr,ar_size);

    }
}
