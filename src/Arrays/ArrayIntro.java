package Arrays;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
       // int marks[] = new int[5];
       //  int rollno[],student[];
//        int[] marks = new int[5];
        int[] age = {90,12,23,34,32,34,56};
//         age[0]= 5;//set the value
//        System.out.println(age[0]=6);
        Arrays.sort(age);
//        for(int i=0; i< age.length;i++ ){
//            System.out.print(age[i] + " ");
//
//        }

        System.out.println(Arrays.toString(age));
    }
}
