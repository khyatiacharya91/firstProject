public class SumOfNumber {
    public static void main(String[] args) {
        String n = "123";
        char[] arr = n.toCharArray();
        int temp=0;
        for (int i = 0; i < n.length(); i++) {
            temp = temp+(arr[i] - '0');
        }
        System.out.println(temp);
    }
}
