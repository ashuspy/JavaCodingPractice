package InterviewQuestions;

public class CheckPalindromeString {

    public static void main(String[] args) {
        String str = "aabbaaq";

        String rev = "";
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println(rev + " is Palinrome");
        } else
            System.out.println(rev + " is not palindrome");
//    static int checkPalindrome(String str){
//        int n = str.length();
//        int i = 0, j = n-1;
//        while(i<n/2 && j>0){
//            if (str.charAt(i) != str.charAt(j))
//                return  0;
//                i++;
//                j--;
//        }
//        return 1;
//    }
    }
}
