package Arrays;

import java.util.Arrays;

public class MergeTwoSortedArr {
    public static void merge(int arr1[],int arr2[], int n, int m){
        int i=n-1;
        int j= 0;
        while(i>=0 && j<m){
            if (arr1[i]>arr2[j]){
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] =temp;
                j++;
                i--;
            }else {
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
    public static void main(String[] args)
    {

        int ar1[] = { 1, 5, 9, 10, 15, 20 };
        int ar2[] = { 2, 3, 8, 13 };
        int m = ar1.length;
        int n =ar2.length;
        merge(ar1, ar2, m, n);

        System.out.print("After Merging \nFirst Array: ");
        for (int i = 0; i < m; i++)
            System.out.print(ar1[i]+ " ");
        System.out.print("\nSecond Array: ");
        for (int i = 0; i < n; i++)
            System.out.print(ar2[i]+ " ");

        }
}
