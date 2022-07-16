package SDE_SHeet;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
//    public static void countFrequency(int arr[], int n){
//        boolean Visited[] = new boolean[n];
//
//        for (int i = 0; i<n; i++){
//            if (Visited[i] == true)
//                continue;
//
//            int count = 1;
//            for (int j = i+1; j<n; j++){
//                if (arr[i] == arr[j]){
//                    Visited[j] = true;
//                    count++;
//                }
//            }
//            System.out.println(arr[i] + " " + count);
//        }
//    }

    public static void main(String[] args) {
        int arr[] = {10,5,10,15,10,5};
        int n = arr.length;
        countFrequency(arr, n);
    }
     public static void countFrequency(int arr[], int n){
         Map<Integer,Integer> map = new HashMap<>();
         for (int i = 0 ; i < n ; i++){
             if (map.containsKey(arr[i])){
                 map.put(arr[i],map.get(arr[i]) + 1);
             }else{
                 map.put(arr[i], 1);
             }
         }
         for (Map.Entry<Integer, Integer> entry : map.entrySet()){
             System.out.println(entry.getKey() + " " + entry.getValue());
         }
     }
}
