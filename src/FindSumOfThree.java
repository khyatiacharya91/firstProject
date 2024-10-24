import java.util.concurrent.atomic.AtomicInteger;

public class FindSumOfThree {
    public static void main(String[] args) {
        int[]  nums = {1,2,3};
        int target =6;

        int first = 0;
        int sec =0;
        int third=0;

         first = nums[0];
         sec = nums[1];
         third = nums[nums.length-1];
        while(third != sec)
        {
            int sum = first+sec+third;
            if(sum == target) return;
            else if(sum < target)
            {
                first++;
                sec++;
            }else{
                third--;
            }
        }
    }
}