package SDE_SHeet;

public class Extract_words {
    public static void main(String[] args) {
        String sentence = "He said, \"Hello, How \tare you?!\"";
        String word[] =sentence.split("[ \t\n,?.!\"]+");
        System.out.println("No. of words : "+word.length);
        for (int i =0; i<word.length;i++) {
            System.out.println("word[" + i + "] = " + word[i]);
        }
        int middle = word.length/2;

        System.out.println( "Midlle word in a sentence is - "+word[middle]);

    }

}
