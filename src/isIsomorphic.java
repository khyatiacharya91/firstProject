import java.util.HashMap;

public class isIsomorphic {
    public static void main(String[] args) {
        isIsomorphic.isIsomorphics("bcdc","baba");
    }
    public static boolean isIsomorphics(String string1, String string2) {
        if(string1.length() != string2.length())
        {
            return false;
        }
        HashMap<Character,Character> hashMap1 = new HashMap<>();
        HashMap<Character,Character> hashMap2 = new HashMap<>();

        for (int i = 0; i < string1.length(); i++) {
            char a = string1.charAt(i);
            char b = string2.charAt(i);

            if(hashMap1.containsKey(b) && hashMap1.get(b) != b)
                return false;
            if(hashMap2.containsKey(a) && hashMap2.get(b) != a)
                return false;

            hashMap1.put(a,b);
            hashMap2.put(b,a);
        }
        return true;
    }
}
