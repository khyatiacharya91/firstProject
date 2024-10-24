package recursion;

public class sumOfLastDigit {
    public static void main(String[] args) {
        int n  = 1234;
        System.out.println(sumOfNum(n));
    }

    public static int sumOfNum(int n)
    {
        if(n == 0) return 0;
        else {
            return (n % 10) + sumOfNum(n/10);
        }
    }
}
