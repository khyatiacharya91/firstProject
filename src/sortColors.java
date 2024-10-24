public class sortColors {
    public static void main(String[] args) {
        int[] nums = {0,1,0};
        sortColors.sortColors(nums);
    }
    public static int[] sortColors (int[] colors) {
        int start = 0;
        int end = colors.length-1;
        int curr = 0;

        for(int i=0;i<colors.length;i++)
        {
            if(colors[curr] == 0)
            {
                int temp = colors[start];
                colors[start] =colors[curr];
                colors[curr]=temp;
                start++;
                curr++;
            }
            else if(colors[curr] == 1)
            {
                curr++;
            }
            else if(colors[curr] ==2)
            {
                int temp = colors[curr];
                colors[curr] =colors[end];
                colors[end]=temp;
                curr++;
                end--;
            }
        }
        return colors;
    }
}
