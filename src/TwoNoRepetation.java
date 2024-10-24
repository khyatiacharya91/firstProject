public class TwoNoRepetation {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,3,4,4,4,4,5,6};
        int n = removeDuplicate(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int removeDuplicate(int[] arr)
    {
        if(arr.length <= 2) return arr.length;
        int j=1;
        int count =1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i-1])
            {
                count=count+1;
            }else {
                count=1;
            }
            if(count <= 2)
            {
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }
}
