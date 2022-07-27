package SDE_SHeet;

import java.util.HashMap;
import java.util.Map;

public class Non_Repeating_elements {
    static void findNonRepeatingElement(int nums[]) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i:nums) {
            if(hashMap.get(i) == null) hashMap.put(i,1);
            else hashMap.put(i,hashMap.get(i)+1);
        }

        for(Map.Entry<Integer,Integer> entry:hashMap.entrySet()) {
            if(entry.getValue()==1)
                System.out.print(entry.getKey()+" ");
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,2,-1,1,3,1};
        System.out.println("Non-repeating numbers are: ");
        findNonRepeatingElement(nums);
    }
}
