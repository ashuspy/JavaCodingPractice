package InterviewQuestions;

public class StringContainsVowels {
    public static void main(String[] args) {
        System.out.println(stringContainsVowel("Hello"));
        System.out.println(stringContainsVowel("TV"));
    }

    public  static  boolean stringContainsVowel(String input){
        return input.toLowerCase().matches(".*[aeiou].*");
    }
}
