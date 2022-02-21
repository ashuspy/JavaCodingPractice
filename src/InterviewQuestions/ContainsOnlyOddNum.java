package InterviewQuestions;

import java.util.List;
import java.util.*;
public class ContainsOnlyOddNum {
    public static void main(String[] args) {

      List l = new ArrayList();
      l.add(4);
        System.out.println(onlyOddNums(l));
    }



    public static boolean onlyOddNums(List<Integer> list){
        for(int i : list){
            if(i%2==0)
                return false;
        }
        return true;
    }
}
