package SDE_SHeet;

public class IterativeBinarySearch {
    int binarySearch(int arr[],int key){
        int low = 0, high = arr.length-1;
        while (low <= high){
            int mid  = low + (high-low)/2;

            if (arr[mid] == key)
                return  mid;

            if (arr[mid] > key)
                high = mid -1;

            else low = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        IterativeBinarySearch ob = new IterativeBinarySearch();
        int arr[] = {2,3,4,10,40};
        int n = arr.length;
        int x= 40;
        int result = ob.binarySearch(arr,x);
        if (result==-1){
            System.out.println("Element not present");
        }else System.out.println("elemnt found at index "+
                                  result);
    }
}
