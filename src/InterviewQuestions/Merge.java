package InterviewQuestions;

import java.util.Arrays;

public class Merge {
    void mergeSort(int arr[], int l, int r){
        if (l<r){
            int m = (l+r)/2;
        // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
    // Merge two sub arrays L and M into array
     void merge(int[] arr, int l, int m, int r) {
         int n1= m-l+1;
         int n2= r-m;
         /* Create temp arrays */
         int L[] = new int[n1];
         int R[] = new int[n2];
         // /*Copy data to temp arrays*/
         for (int i =0; i<n1; i++)
             L[i]=arr[l + i];
         for (int j =0; j<n2; j++)
             R[j]=arr[m + 1 + j];

         /* Merge the temp arrays */
         // Initial indexes of first and second subarrays
         int i=0, j=0;
         // Initial index of merged subarray array
         int k=l;
         /* Copy remaining elements of L[] if any */
         while(i<n1){
             arr[k] = L[i];
             i++;k++;
         }
         /* Copy remaining elements of R[] if any */
         while(i<n2){
             arr[k] = R[j];
             j++;k++;
         }
    }

    public static void main(String[] args) {
        int[] arr = { 6, 5, 12, 10, 9, 1 };
        Merge obj = new Merge();
        obj.mergeSort(arr,0, args.length-1);
        System.out.println("Sorted Array" );
        System.out.println(Arrays.toString(arr));

    }
}
