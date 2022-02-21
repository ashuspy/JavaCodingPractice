import java.sql.SQLOutput;
import java.util.Arrays;

public class Zigzag {
    static void zigz(int arr[], int n) {
        int temp=0;

        for(int i=0; i<n-2; i++) {
            if(i%2==0) {
                if(arr[i+1]<arr[i]){
                    temp=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                }
            }
            else {
                if (arr[i + 1] > arr[i]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                  }
                }
        }
    }

    public static void main(String[] args) {
        int arr[]= {4, 3, 7, 8, 6, 2, 1};
        System.out.println("Given Array : " + Arrays.toString(arr));
        zigz(arr, arr.length);
        System.out.println( "Sort Array in Zig-zag fashion \n" + Arrays.toString(arr));
    }

}
