package Arrays;

public class EvenSubarraysum {
    public static String solve(int N, int[] arr) {
        for(int i=0; i<N-1; i++){
            if(arr[i] + arr[i+1] != 0)
                return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        int arr[] = {8, -8, 7, 9};
        int N = arr.length;
        EvenSubarraysum.solve(N, arr);
    }
}
