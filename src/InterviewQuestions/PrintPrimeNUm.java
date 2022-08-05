package InterviewQuestions;

public class PrintPrimeNUm {
    public static void main(String[] args) {
        int i, j, chk;
        System.out.println("--Prime NUmbers from 1 to 100---");

        for (i =2;i<=100; i++){
            chk =0;
            for (j=2; j<i; j++){
                if(i%j==0){
                    chk++;
                    break;
                }
            }
            if (chk==0)
                System.out.print(i + " ");
        }
    }
}
