package InterviewQuestions;

import java.util.Scanner;

public class capitalize {
    public static String capitalize(String str)
    {
        if(str == null) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1) + " ";
    }

    public static void main(String [] args) {
//
        String name;

        System.out.print("INPUT: ");
        Scanner scan = new Scanner(System.in);
        name  = scan.next();

        String upperCase = name.substring(0, 1).toUpperCase() + name.substring(1) + " ";
        System.out.println("OUTPUT: " + upperCase);

    }
}
