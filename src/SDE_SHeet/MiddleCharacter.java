package SDE_SHeet;

public class MiddleCharacter {
   public  static void middle_Character(String arr){
       int len = arr.length();

       int middle = len/2;
       System.out.println(arr.charAt(middle));
   }
    public static void
    main(String args[])
    {
        String str = "GeeksForGeeks";

       middle_Character(str);
    }
}
