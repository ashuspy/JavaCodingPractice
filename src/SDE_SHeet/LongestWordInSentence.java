package SDE_SHeet;

import java.util.Scanner;

public class LongestWordInSentence {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the string :");
//        String sen= sc.nextLine();
        String sen = "Hey yo looking good";
        sen += " ";
        String word = "",longest = "";

        for (int i =0; i<sen.length(); i++){
            char ch = sen.charAt(i);

            if (ch != ' '){
                word +=ch;
            }else {
                if (word.length()>longest.length())
                    longest = word;

                word = "";
            }
        }
        System.out.println("Longest word is : " +longest);
    }

}
