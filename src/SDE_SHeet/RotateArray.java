package SDE_SHeet;

import java.util.Arrays;

public class RotateArray {
    public static void reverse(int[] num, int low, int high){
        while(low < high) {
            int temp = num[low];
            num[low] = num[high];
            num[high] = temp;
            low++;
            high--;
        }
    }
    public  static void rotate(int[] nums, int k){
        int n = nums.length;
        k = k%n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k, n-1);
        reverse(nums,0,n-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        RotateArray.rotate(arr,3);

    }
}
