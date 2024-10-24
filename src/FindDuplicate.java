public class FindDuplicate {
    public static void main(String[] args) {
        int nums[] = {3,4,4,4,2};
        FindDuplicate.findDuplicate(nums);
    }

    public static int findDuplicate(int nums[])
    {
        int slow = nums[0];
        int fast = nums[0];

        while(true)
        {
            slow = nums[slow];
            fast = nums[nums[fast]];

            if(slow == fast)
            {
                break;
            }
        }
        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    }
}
