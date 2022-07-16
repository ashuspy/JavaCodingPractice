package SDE_SHeet;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = 5;
        int sum = 0;
        for (int i =0; i<n; i++){
            sum += arr[i];
        }
        System.out.println("Sum of all the elements in array is "
                           + sum);
    }
}
