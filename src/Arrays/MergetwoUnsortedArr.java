package Arrays;

import java.util.Arrays;

public class MergetwoUnsortedArr {
    static void sortedmerge(int a[],int b[], int res[], int n,int m){
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0,j=0,k=0;

        while(i<n && j<m){
            if (a[i]>=b[j])
                res[k++]=b[j++];
            else
                res[k++] =a[i++];
        }
        while(i<n){
            res[k++]=a[i++];
        }
        while (j<m){
            res[k++]=b[j++];
        }
    }
    public static void main(String[] args)
    {
        int a[] = { 10, 5, 15 };
        int b[] = { 20, 3, 2, 12 };
        int n = a.length;
        int m = b.length;

        // Final merge list
        int res[] = new int[n + m];
        sortedmerge(a, b, res, n, m);

        System.out.print( "Sorted merged list :");
        for (int i = 0; i < n + m; i++)
            System.out.print(" " + res[i]);
    }
}


