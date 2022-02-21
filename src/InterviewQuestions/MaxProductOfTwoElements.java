package InterviewQuestions;
import java.util.*;
public class MaxProductOfTwoElements {
    public static void main(String[] args) {
        int[] nums = {3,4,5,2};
        System.out.println(Arrays.toString(nums));
        System.out.print(max_product(nums));
    }
    static public int max_product(int[] nums){
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(nums.length-2);
        System.out.println(nums.length-1);
     //   num.lengh -1 just gives you the last accessible index
        //   of the array
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }
}
//class Solution {
//    public int maxProduct(int[] nums) {
//        int max1 = Integer.MIN_VALUE;
//        int max2 = max1;
//        int i = 0;
//        while (i < nums.length) {
//            if (nums[i] > max1) {
//                max2 = max1;
//                max1 = nums[i];
//            } else if (nums[i] > max2) {
//                max2 = nums[i];
//            }
//            i++;
//        }
//        return (max1 - 1)*(max2 - 1);
//    }
//}

//Input: nums = [3,4,5,2]
//        Output: 12
//        Explanation: If you choose the indices
//        i=1 and j=2 (indexed from 0),
//        you will get the maximum value, that is,
//        (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12.
