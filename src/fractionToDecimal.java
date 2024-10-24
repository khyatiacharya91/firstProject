import java.util.HashMap;

public class fractionToDecimal {
    public static void main(String[] args) {
        int num =2;
        int deno=4;
        fractionToDecimalfun(2,4);
    }
    public static String fractionToDecimalfun (int numerator, int denominator) {
        String result = "";
        HashMap<Long, Integer> remainderMap = new HashMap<>();

        if (numerator == 0) {
            return "0";
        }

        if ((numerator < 0) ^ (denominator < 0)) {
            result += '-';
        }

        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

        long quotient = num / den;
        long remainder = (num % den) * 10;
        result += quotient;

        if (remainder == 0) {
            return result;
        } else {
            result += ".";
            while (remainder != 0) {
                if (remainderMap.containsKey(remainder)) {
                    int beginning = remainderMap.get(remainder);
                    result = result.substring(0, beginning) + "(" + result.substring(beginning) + ")";
                    return result;
                } else {
                    remainderMap.put(remainder, result.length());
                    quotient = remainder / den;
                    remainder = (remainder % den) * 10;
                    result += quotient;
                }
            }
        }
        return result;
    }
}
