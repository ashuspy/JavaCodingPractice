package InterviewQuestions;

public class ReverseString {
    public static void main(String[] args) {
//        String str = "Reverse the String";
//        System.out.println(reverse(str));

        //    1st approach
        StringBuilder sb = new StringBuilder("hi Aashu");
        System.out.println(sb.reverse());

        String str = "Reverse.the.String";
        System.out.println(reverseWords(str));
    }

     /*   //2nd Approch

        String str = "Hello.ashu.you.can.do.it.keep.it.up.bro";
        String rev = "";
        for(int i = str.length()-1; i>=0; i--){
            rev +=str.charAt(i);
        }
        System.out.println(rev);

    }*/


       public static String reverseWords(String s) {
            //initially reversing individual words of the given
            //string one by one and storing it in a list.
            String words[] = s.split("\\.");
            String result = "";

            //now reversing the whole modified string by adding all
            //the elements of list in a single string in reverse order.
            for (int i = words.length - 1; i >= 0; i--) {
                result += words[i];
                if (i != 0)
                    result += '.';
            }
            //returning the result.
            return result;
        }
    }



/*
    public  static  String reverse(String input){
        if(input == null)
            throw  new IllegalArgumentException("Null is not a valid input");

        StringBuilder output = new StringBuilder();
        char[] chars = input.toCharArray();

        for (int i=chars.length - 1; i>=0; i--)
            output.append(chars[i]);

        return  output.toString();
        }
  }
*/


