package SDE_SHeet;

public class InsertAtEndInArray {
    static  void insertatEnd(int[] arr,int n, int value){
        arr[n] = value;
    }

    public static void main(String[] args) {
        int n = 8;
        int arr[] = {10,9,14,8,20,48,16,9,0};
        int value = 40;
        insertatEnd(arr,n,value);
        for (int i = 0; i<=n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
