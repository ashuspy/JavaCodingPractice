package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;
//o(n) time complexity using sets
public class SubarraywithZeroSum {
    public static void main(String[] args) {

        int[] a  = {2,1,3,-4,-2};
        boolean found = false;

        Set<Integer> set = new HashSet<>();
        int sum =0;

        for(int elements: a){
            set.add(sum);
            sum += elements;
            if (set.contains(sum)){
                found = true;
                break;
            }
        }
        System.out.println("found " + found);
    }
}
