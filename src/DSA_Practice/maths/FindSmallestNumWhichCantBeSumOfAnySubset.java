package DSA_Practice.maths;

import java.util.Arrays;

public class FindSmallestNumWhichCantBeSumOfAnySubset {
    static  long findSmallest(int arr[], int n){
        long res =1;
        Arrays.sort(arr);

        for(int i =0; i<n && arr[i] <= res; i++){
                res += arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int n= arr.length;
        System.out.println(FindSmallestNumWhichCantBeSumOfAnySubset
                .findSmallest(arr,n));
    }
}
