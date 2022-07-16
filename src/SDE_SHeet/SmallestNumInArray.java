package SDE_SHeet;

import java.util.Arrays;
public class SmallestNumInArray {
    public static void main(String[] args) {

    /*  1st Approach - TC- O(nlogn)
        int arr[] = {2,5,1,3,0};
        Arrays.sort(arr);
        System.out.println("Smallest element in array is : " + arr[0]);
     */

        //2nd Approch - O(n)
        int arr[] = {8,10,5,7,9,2};
        System.out.println("Smallest element in array is : " + SmallestNumInArray.smallest(arr));
    }
    static int smallest(int arr[]){
        int min = arr[0];
        for (int i = 0; i< arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
