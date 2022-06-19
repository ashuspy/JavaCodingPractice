package InterviewQuestions;

import java.util.Arrays;
// Move -ve no. to end
public class MoveNegNoToEnd {
    public static void segrateElements(int[] arr, int n){
        if(n==0 || n==1){
            return ;
        }
        int[] a = new int[n];
        int i = 0;

        for (int x=0; x<n; x++){
            if(arr[x] >= 0){  // for +ve No.
                a[i] = arr[x];
                i++;
            }
        }
        for (int x=0; x<n; x++){
            if(arr[x] < 0){      // for -ve No.
                a[i] = arr[x];
                i++;
            }
        }
        for (int x=0; x<n; x++){
           arr[x] = a[x];   // copy to original  array
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = {-1,0,-2,4,-5,9,1,2,3};
        int n = arr.length;
        MoveNegNoToEnd.segrateElements(arr,n);
    }
}
