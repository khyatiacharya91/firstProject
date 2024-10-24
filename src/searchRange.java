import java.util.ArrayList;

public class searchRange {
    public static void main(String[] args) {
        searchRange searchRange = new searchRange();
        int [] nums = {2,2};
        int target = 2;
        searchRange.searchRange(nums,target);
    }

    public int[] searchRange(int[] nums, int target) {
        int[] arr = {-1,-1};
        searchRange searchRange = new searchRange();
        arr[0] = searchRange.searchStartingPoint(nums,target);
        arr[1] = searchRange.searchEndingPoint(nums,target);
        return arr;
    }
    public int searchStartingPoint(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
                if(nums[i] == target)
                {
                    return i;
                }
            }
        return -1;
    }
    public int searchEndingPoint(int[] nums, int target) {
        for (int i = nums.length-1; i >= 0; i--) {
            if(nums[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
}
