package ExceptionHandling;

public class Mainclass {
    public static void main(String[] args) {
        try {
            int a =0;
            int b=5;
            int c = b/a;
            System.out.println(c);
            
        }catch (ArithmeticException e){
            System.out.println(e.getMessage() +
                    "occured, please check your Code.");
        }

        System.out.println("imp code");
        System.out.println("need to run");

    }
}
