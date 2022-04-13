package Arrays;

public class KthIndex {
    static int binarySearch(int[] arr, int n, int k){
        int start=0, last=n-1,mid=0;
        while (start<=last){
            mid=(start+last)/2;
            if (arr[mid] == k){
                return mid;
            }else if (k>arr[mid]){
                start=mid+1;
            }else last = mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int n = arr.length;
        int k =5;
        System.out.println(KthIndex.binarySearch(arr,n,k));
    }
}
