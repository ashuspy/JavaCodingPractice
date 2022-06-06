package InterviewQuestions;

public class RemoveVowels {
    public static  String removeVowels(String str){
        StringBuilder result = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                    ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U'){
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "hello this is my new class ummmmahhhhhh";
        System.out.println(RemoveVowels.removeVowels(s));
    }
}
