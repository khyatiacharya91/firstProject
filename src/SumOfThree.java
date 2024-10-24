import java.util.Arrays;

public class SumOfThree {
    public static void main(String[] args) {
        int[] nums = {3,7,1,2,8,4,5};
        int target = 10;
        SumOfThree.findSumOfThree(nums,target);
    }
    public static boolean findSumOfThree(int[] nums, int target) {
        int p1=1;
        int p2=2;
        nums = Arrays.stream(nums).sorted().toArray();
        for (int i = 0; i < nums.length && p2 < nums.length; i++) {
            if(nums[i] + nums[p1] + nums[p2] == target )
            {
                return true;
            }
            p1++;
            p2++;
        }
        return false;
    }
}
