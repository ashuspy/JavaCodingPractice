package SDE_SHeet;

public class BinarySearch { // recursive binary search
    int binarySearch(int arr[], int low, int high, int key){
        if (high>=low){
            int mid = low + (high-low)/2;

            if (arr[mid] == key)
                return mid;

            if (arr[mid] > key)
                return binarySearch(arr,low,mid-1,key);

            return binarySearch(arr,mid+1,high,key);
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int arr[] = {2,3,4,10,40};
        int n = arr.length;
        int key = 10;
        int result = ob.binarySearch(arr,0,n-1,key);
        if (result == -1) {
            System.out.println("element not Present");
        }else
            System.out.println("Element found at index " + result);

    }
}
