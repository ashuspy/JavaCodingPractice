package InterviewQuestions;

public class FibonacciNumbers {
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String args[]) {
        int a = 10;
        for (int i = 0; i<a; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}

