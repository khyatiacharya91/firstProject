import java.util.ArrayList;
import java.util.List;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int w =3;
        SlidingWindowMaximum.findMaxSlidingWindow(nums,w);
    }
    public static int[] findMaxSlidingWindow(int[] nums, int w) {

        int[] arr = new int[nums.length-w+1];
        for (int i = 0; i < nums.length-w+1; i++) {
            int temp=nums[i];
            for (int j = i; j < i+w; j++) {
                if(temp < nums[j]) {
                    temp = nums[j];
                }
            }
            arr[i] =temp;
        }
        return arr;
    }
}
