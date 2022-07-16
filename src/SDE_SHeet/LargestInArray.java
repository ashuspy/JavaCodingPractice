package SDE_SHeet;
import java.util.Arrays;
public class LargestInArray {
    public static void main(String[] args) {
        //  1st Approach
//        int arr[] = {2,5,1,3,0};
//        Arrays.sort(arr);
//        System.out.println("largest element in array is : " + arr[arr.length-1]);

        //2nd Approach
        int arr[] = {1,2,3,49,4,0};
        System.out.println("largest element in array is : " + LargestInArray.largest(arr));
    }
    static  int largest(int arr[]){
        int max = arr[0];
        for (int i = 0; i< arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
