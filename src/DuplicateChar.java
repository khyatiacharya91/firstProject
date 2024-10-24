import java.util.HashMap;

public class DuplicateChar {
    public static void main(String[] args) {
        String s ="goodmorniiiing";
        HashMap<Character,Integer> hashMap = new HashMap<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if(hashMap.containsKey(arr[i]))
            {
                int val = hashMap.get(arr[i]);
                val =val+1;
                hashMap.put(arr[i], val);
            }else {
                hashMap.put(arr[i], 1);
            }
        }
        for(char c : arr)
        {
            if(hashMap.get(c) < 2)
            {
                hashMap.remove(c);
            }
        }
        System.out.println(hashMap);
    }
}
