public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {6,9,2,7,3,4,1};
        divide(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void divide(int[] arr,int start,int end)
    {
        if(start >= end) return;
        int mid = start+(end-start)/2;
        divide(arr,start,mid);
        divide(arr,mid+1,end);

        conquar(arr,start,mid,end);

    }
    public static void conquar(int[] arr, int start, int mid, int end)
    {
        int merge[] = new int[end-start+1];

        int first = start;
        int sec = mid+1;
        int index=0;

        while(first<= mid && sec<=end)
        {
            if(arr[first]<= arr[sec])
            {
                merge[index++]=arr[first++];
            }else {
                merge[index++]=arr[sec++];
            }
        }
        while(first<= mid)
        {
            merge[index++]=arr[first++];
        }

        while(sec<=end)
        {
            merge[index++]=arr[sec++];
        }
        for (int i = 0,j=start; i < merge.length; i++,j++) {
            arr[j] =merge[i];
        }
    }
}
