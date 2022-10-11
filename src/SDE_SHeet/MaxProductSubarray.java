package SDE_SHeet;
import  java.util.*;
public class MaxProductSubarray {
    static  int maxProduct(int arr[]){
        int result = arr[0];
        for (int i =0; i< arr.length; i++){
            int p = arr[i];
            for (int j = i+1; j< arr.length;j++) {
                result = Math.max(result,p);
                p *= arr[j];
            }
            result = Math.max(result,p);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,-3,0,-4,-5};
        int result = maxProduct(arr);
        System.out.println("the maximum product subarray is: "+ result);
    }
}
