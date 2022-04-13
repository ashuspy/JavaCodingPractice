package Arrays;
import java.util.*;

public class NumOfTriangle {
    public static  int noOftri(int arr[], int n){
        Arrays.sort(arr);
        int count=0;

        for (int i= arr.length-1; i>=2;i--){
            int left=0;
            int right=i-1;

            while (left<right){
                if (arr[left]+arr[right]>arr[i]){
                    count+=(right-left);
                    right--;
                }else {
                    left++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,1,2};
        int n = arr.length;
        System.out.println(NumOfTriangle.noOftri(arr,n));
    }
}
