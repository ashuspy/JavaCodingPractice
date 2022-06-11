package InterviewQuestions;

import java.util.HashSet;

public class Union {
    public static int doUnion(int a[], int n, int b[], int m){
        HashSet<Integer> s = new HashSet<>();
        for (int i=0; i<n;i++){
            s.add(a[i]);
        }
        for (int i=0; i<m;i++){
            s.add(b[i]);
        }
        return s.size();
    }

    public static void main(String[] args) {
        int a[] = { 12,10,9,45,2,10,10,6,45};
        int n = a.length;
        int b[] = { 1,10,9,5,2,10,10,6,4};
        int m = b.length;

        System.out.println(doUnion(a,n,b,m));
    }
}
