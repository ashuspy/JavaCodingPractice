package SDE_SHeet;

public class LinearSearch {
    public  static  int search(int arr[], int key){
        int n = arr.length;
        for (int i = 0; i<n; i++){ // O(N)
                                   //space O(1)
            if (arr[i] == key)
                return  i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,10,40};
        int x = 10;
        int result = search(arr,x);
        if (result==-1){
            System.out.println("element Not present");
        }else System.out.println(" element is present at the index "+
                                 result);
    }
}
