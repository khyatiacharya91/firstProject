import java.util.Stack;

public class IsValidBracket {
    public static void main(String[] args) {
        IsValidBracket.isValid("[{{}}]");
    }
    public static boolean isValid(String s) {
        Stack<Character> stack =new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(')
            {
                stack.push(s.charAt(i));
            }
            if(s.charAt(i) == ']')
            {
                if(stack.peek() == '[')
                {
                    stack.pop();
                }
            }
            if(s.charAt(i) == '}')
            {
                if(stack.peek() == '{')
                {
                    stack.pop();
                }
            }
            if(s.charAt(i) == ')')
            {
                if(stack.peek() == '(')
                {
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty())
        { return true; }
        return false;
    }
}
