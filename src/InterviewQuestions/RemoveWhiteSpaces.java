package InterviewQuestions;
import java.util.*;
public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str = "         Geeks       for      Geeks    ";
        str = str.replaceAll("\\s","");


        System.out.println(str);
    }

    }
//        System.out.println(checkWhiteSpaces("h ello"+"hiiii"));
//    }

//    public static String checkWhiteSpaces(String input){
//        StringBuilder output = new StringBuilder();
//        char[] charArray = input.toCharArray();
//
//        for (char c: charArray){
//            if (!Character.isWhitespace(c));
//            output.append(c);
//        }
//        return output.toString();
//    }
//}

