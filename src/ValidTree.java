import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ValidTree {
    public static boolean validTree(int n, int[][] edges) {
        System.out.println(edges[0]);
        if(n-1 != edges.length) return false;
        HashMap<Integer, List<Integer>> hashMap = new HashMap<>();
        for (int i = 0; i < edges.length; i++) {
            if(hashMap.containsValue(edges[i][0]))
            {
                return false;
            }else {
                hashMap.put(edges[i][0],new ArrayList<>());
                if(hashMap.containsKey(edges[i][0]))
                {
                    List<Integer> list = hashMap.get(edges[i][0]);
                    list.add(edges[i][1]);
                    hashMap.put(edges[i][0],list);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [][] arr = {{0,1},{0,2},{0,3},{3,4}};
        ValidTree.validTree(5,arr);
    }
}
