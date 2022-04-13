package Arrays;

import java.util.ArrayList;

public class SubarraySum {
    static  ArrayList<Integer> subarrSum(int arr[], int n, int sum){
        int start=0;
        int last=0;
        boolean flag= false;
        int currSum = 0;

        ArrayList<Integer> res = new ArrayList<Integer>();

        for (int i =0; i<n;i++){
            currSum += arr[i];
            if (currSum>=sum){
                last=i;
                while(sum<currSum && start<last){
                 currSum -= arr[start];
                    ++start;
                }
                if (currSum==sum){
                    res.add(start+1);
                    res.add(last+1);
                    flag=true;
                    break;
                }
            }
        }
        if (flag==false){
            res.add(-1);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 20, 3, 10, 5};
        int n = arr.length;
        int sum=33;
       // SubarraySum.subarrSum(arr,n,sum);
        System.out.println(SubarraySum.subarrSum(arr,n,sum));
    }
}
