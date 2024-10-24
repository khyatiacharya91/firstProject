package recursion;

import java.util.ArrayList;
import java.util.List;

public class validStrings {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        validStrings.validStrings(3);

    }

    public static List<String> validStrings(int n) {
        List<String> list =new ArrayList<>();
        validString(n-1,list);
        return list;
    }

    public static void validString(int n, List<String> list) {
        if(n==0)  return;
        String s = Integer.toBinaryString(n);
        if(s.length() == 3 && s.contains("1"))
        {
            list.add(s);
        }
    }
}
