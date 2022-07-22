package SDE_SHeet;

public class InsertAtPosition {
    static void insertAtPosition(int[] arr, int n, int value, int pos){
        for (int i = n; i>=pos; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[pos - 1] = value;
    }

    public static void main(String[] args) {
        int n =8;
        int pos = 5;
        int arr[] = {10,9,14,8,20,48,16,9,0};
        int value=40;
        insertAtPosition(arr,n,value,pos);
        for(int element: arr){
            System.out.print(element + " ");
        }
    }
}
