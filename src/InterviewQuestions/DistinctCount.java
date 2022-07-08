package InterviewQuestions;

import java.util.Arrays;
import java.util.HashSet;

public class DistinctCount {
//    1st approch
//    public static int countDistinct(int arr[], int n){
//        int res = 1;
//        for(int i =1;i<n;i++){
//            int j =0;
//            for (j=0; j<n;j++)
//                if (arr[i] == arr[j])
//                    break;
//                if (i==j)
//                    res++;
//
//        }
//        return res;
//    }
//
//    public static void main(String[] args) {
//        int arr[] = { 12,10,9,45,2,10,10,45};
//        int n = arr.length;
//        System.out.println(countDistinct(arr,n));
//    }

    //2nd approach//
//    static int countDistinct(int arr[], int n){
//        Arrays.sort(arr);
//        int res =0;
//        for(int i =0; i<n;i++){
//            while (i<n-1 && arr[i] == arr[i+1]){
//                i++;
//            }
//            res++;
//        }
//        return res;
//    }
//
//    public static void main(String[] args) {
//        int arr[] = { 12,10,9,45,2,10,10,6,45};
//        int n = arr.length;
//        System.out.println(countDistinct(arr,n));
//    }

    //3rd efficient approach//

    public static int countDistinct(int arr[], int n){
        HashSet<Integer> count = new HashSet<Integer>();
        for (int i =0; i<n; i++){
            count.add(arr[i]);
        }
        return count.size();
    }

    public static void main(String[] args) {
        int arr[] = { 12,10,9,45,2,10,10,1,6,45};
        int n = arr.length;
        System.out.println(countDistinct(arr,n));
    }

}

