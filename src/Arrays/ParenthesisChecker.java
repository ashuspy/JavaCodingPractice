package Arrays;

import java.util.Stack;

public class ParenthesisChecker {
    static boolean ispar(String str){
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<str.length();i++){
            char x=str.charAt(i);
            if(x=='[' || x=='{' || x=='('){
                stack.push(x);
            }else {
                if (stack.isEmpty())
                    return  false;
                else if(!isMatching(stack.peek(),x))
                    return false;
                else stack.pop();
            }
        }
        return stack.isEmpty();
    }
    static boolean isMatching(char a, char b){
        if(a=='{' && b=='}')
            return  true;
        if(a=='[' && b==']')
            return true;
        if(a=='(' && b== ')' )
            return true;
        return false;
    }

    public static void main(String[] args) {
        String str = "{([])}";
        if( ispar(str))
            System.out.println("Balanced");
        else
            System.out.println("not Balanced");
    }
}
