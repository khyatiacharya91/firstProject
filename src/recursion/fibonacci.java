package recursion;

public class fibonacci {
//    public static void main(String[] args) {
//        fibo(5);
//    }
//
//    public static void fibo(int n)
//    {
//        int f1=0;
//        int f2=1;
//        for (int i = 1; i < n; i++) {
//            int f3=f1+f2;
//            System.out.println(f3);
//            f1=f2;
//            f2=f3;
//        }
//    }
public static int fibonacci(int n) {
    if (n <= 1) {  // Base cases
        return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);  // Recursive case
}

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }
}
