package InterviewQuestions;

public class CheckPalindromeString {

    public static void main(String[] args) {
       String str = "aabbaa";
        System.out.println(checkPalindrome(str));
    }
    static int checkPalindrome(String str){
        int n = str.length();
        int i = 0, j = n-1;
        while(i<n/2 && j>0){
            if (str.charAt(i) != str.charAt(j))
                return  0;
                i++;
                j--;
        }
        return 1;
    }
}
