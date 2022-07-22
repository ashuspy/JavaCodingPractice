package SDE_SHeet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromUnsortedArray {
    public static void removeDuplicates(int[] arr){
        HashSet<Integer> set = new LinkedHashSet<Integer>();
        for (int i= 0; i< arr.length;i++)
            set.add(arr[i]);
        System.out.println(set);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 9, 2, 4, 1, 10, 89, 34 };
        removeDuplicates(arr);
    }
}
