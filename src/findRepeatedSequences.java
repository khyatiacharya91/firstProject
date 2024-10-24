import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class findRepeatedSequences {
    public static void main(String[] args) {
        findRepeatedSequences.findRepeatedSequences("AAAAACCCCCAAAAACCCCCC",8);
    }
    public static Set<String> findRepeatedSequences(String dna, int k) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        for (int i = 0; i <= dna.length()-k; i++) {
            int temp=k;
            String word="";
            for (int j = i; j < i+k; j++) {
                word = word+ "" +dna.charAt(j);
                temp--;
                if(temp == 0) break;
            }
            if(temp > 0) break;
            if(hashMap.containsKey(word))
            {
                hashMap.put(word, hashMap.get(word)+1);
            }else {
                hashMap.put(word,1);
            }
        }
        Set<String> set = new HashSet<>();
        for (Map.Entry<String,Integer> val  : hashMap.entrySet())
        {
            if(val.getValue() > 1) {
                set.add(val.getKey());
            }
        }
        return set;
    }
}
