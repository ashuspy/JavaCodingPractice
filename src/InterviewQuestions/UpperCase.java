package InterviewQuestions;

public class UpperCase {
    public static String convert(String s){
        String[] arr = s.split(" ");
        String result = "";

        for(String str : arr){
            String first = str.substring(0,1);
            String rest = str.substring(1);
            result += first.toUpperCase()+rest+" ";
        }
        return result.trim();
    }

    public static void main(String[] args) {
        String s = "i am attractive unique with a strong personality";
        System.out.println(s);
        System.out.println(UpperCase.convert(s));
    }
}
