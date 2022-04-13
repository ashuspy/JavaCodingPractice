package Arrays;

public class PeakElement {
    public static int peakElement(int[] arr,int n){
        return peakthElemnt(arr,0,n-1,n);
    }
    public static int peakthElemnt(int[] arr, int low,int high, int n){
        int mid = (low+high)/2;

        if ((mid==0 || arr[mid-1] <= arr[mid]) &&
                (mid==n-1 || arr[mid+1]<= arr[mid]))
            return mid;
        else if (mid>0 && arr[mid-1]>arr[mid])
            return peakthElemnt(arr, low, mid-1, n);
        else
            return peakthElemnt(arr, mid+1, high, n);
    }

    public static void main(String[] args) {
        int arr[]= {1,2,3,4,6,10};
        int n= arr.length;
        System.out.println(PeakElement.peakElement(arr,n));
    }
}
