public class isPalindrome {
    public static void main(String[] args) {
        isPalindrome.isPalindromea("kayak");
    }
    public static boolean isPalindromea(String s) {
        int p1=0;
        int p2=s.length()-1;

        for (int i = 0; i < s.length(); i++) {
            if(p1==p2)
            {
                return true;
            }
            if(s.charAt(p1) != s.charAt(p2))
            {
                return false;
            }
            p1++;
            p2--;
        }
        return true;
    }
}
