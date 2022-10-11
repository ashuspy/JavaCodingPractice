package SDE_SHeet;

//https://takeuforward.org/data-structure/search-an-element-in-an-array-program--java/

public class SearchArray_elemnt {
    public static void main(String[] args) {
        int arr[] = {6,7,9,5,3,10};
        int n = arr.length;
        int k =10;
        int low =0, high = n-1;
        int ans = -1;

        while(low <= high){
        int mid = (low+high)/2;
        if(arr[mid] > k){
            high  = mid -1;
        }else if (arr[mid] < k){
            low = mid+1;
        }else {
            ans = mid ;
            break;
        }
        }
        System.out.println("the element is present in "+ans+ " index");
    }


//    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,5};
//        int n = arr.length;
//        int K = 3;
//        int index = -1;
//        for (int i =0; i<n; i++){
//            if(arr[i] == K) {
//                index=i;
//                break;
//            }
//        }
//        System.out.println("The element is present  in " + index+ " index");
//
//    }
}
