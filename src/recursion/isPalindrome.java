package recursion;

public class isPalindrome {
    public static void main(String[] args) {
        String s ="abcd";
        char[] a = s.toCharArray();
        int p1=0;
        int p2=a.length-1;
        for (int i = 0; i < a.length/2; i++) {
            if(a[p1] != a[p2])
            {
                return;
            }else {
                p1++;
                p2--;
            }
        }
    }
}
