import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        int[] res = new int[2];
        int nums1[] = {2,4};
        int nums2[] = {1,2,3,4};

        res =  nextGreaterElements(nums1,nums2);
    }
    public static int[] nextGreaterElements(int[] nums1, int[] nums2) {

        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        int[] arr = new int[nums1.length];
        for (int i = 0; i < nums2.length; i++) {
            while(!stack.empty() && nums2[i] > stack.peek())
            {
                hashmap.put(stack.peek(),nums2[i]);
                stack.pop();
            }
            stack.push(nums2[i]);
        }

        while(!stack.isEmpty())
        {
            int val = stack.pop();
            hashmap.put(val,-1);
        }

        for (int i = 0; i < nums1.length; i++) {
            if(hashmap.containsKey(nums1[i]))
            {
                arr[i] = hashmap.get(nums1[i]);
            }
        }
        return arr;
    }
}
