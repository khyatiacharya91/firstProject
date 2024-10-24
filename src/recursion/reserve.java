package recursion;

public class reserve {
    public static void main(String[] args) {
        String s= "khyati";
        System.out.println(reserve.rev(s));
    }

    public static String rev(String s)
    {
        if(s.isEmpty()) return "";

        return rev(s.substring(1)) + s.charAt(0) ;
    }
}
