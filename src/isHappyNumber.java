public class isHappyNumber {
    public static boolean isHappyNumber(int n) {
        int slow = n;
        int fast = sumOfSquare(n);

        while(fast != 1 && fast != slow)
        {
            slow = sumOfSquare(slow);
            fast = sumOfSquare(sumOfSquare(fast));
        }
        return fast ==1;
    }
    public static int sumOfSquare(int n)
    {
        int total=0;
        while(n>0)
        {
            int lastDigit = n%10;
            n = n/10;
            total += Math.pow(lastDigit,2);
        }
        return total;
    }
}
