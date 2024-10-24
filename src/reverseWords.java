public class reverseWords {
    public static void main(String[] args) {
        reverseWords.reverseWords("hello world");
    }
    public static String reverseWords(String sentence) {
        int start=0;
        String[] temp = sentence.trim().split("\\s+");
        int end=temp.length-1;
        while (start < end) {
            String str = temp[start] ;
            temp[start] = temp[end];
            temp[end]=str;
            start++;
            end--;
        }
        return String.join(" ",temp);
    }
}
