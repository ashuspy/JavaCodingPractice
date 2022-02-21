package InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;

public class ArraysDotSort {
    public static void main(String[] args) {
        Integer[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)  +" ascending Order");
        Arrays.sort(arr,1,5);
        System.out.println(Arrays.toString(arr) +
                           " sort Subarrayfrom 1 to 4");
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr) + " Sort in descending order");
    }
}
