package SDE_SHeet;

import java.util.Arrays;

public class MaxiSubArraySum {
    public static  int maxSubarray(int arr[]){
        int sum = 0;
        int max = arr[0];
        for (int i=0;i<arr.length;i++){
            sum += arr[i];
            if (sum>max) max = sum;
            if (sum < 0) sum = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(MaxiSubArraySum.maxSubarray(arr));
    }
}
