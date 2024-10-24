import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CloneGraph {
    public static Node clone(Node root) {
        if(root == null) return null;
        HashMap<Node,Node> hashMap =  new HashMap<>();
        return cloneGraph(root,hashMap);
    }
    public static Node cloneGraph(Node node,HashMap<Node,Node> hashMap)
    {
        Node newNode = new Node(node.data);
        hashMap.put(node,newNode);
        for (Node val: node.neighbors)
        {
            if(hashMap.containsKey(val))
            {
                newNode.neighbors.add(hashMap.get(val));
            }else {
                newNode.neighbors.add(cloneGraph(val,hashMap));
            }
        }
        return newNode;
    }
}

class Node {
    int data;
    List<Node> neighbors;

    public Node(int data) {
        this.data = data;
        this.neighbors = new ArrayList<Node>();
    }
}