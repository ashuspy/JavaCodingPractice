package InterviewQuestions;
import java.util.Scanner;
public class CountCharacterInString {
    public static void main(String[] args) {
         String  str;
         int count =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string : ");
        str = input.nextLine();
        
        int i = 0;
        while(i<str.length()){
            if(str.charAt(i) != '\0'){ // with space
                count++;
            }
            i++;
        }
        System.out.println("Number of charcters in the given" +
                " String  are "+count);
    }
}
