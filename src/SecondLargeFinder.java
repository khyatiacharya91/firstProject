import java.lang.module.Configuration;

public class SecondLargeFinder {
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99, 99, 67};
        if(arr == null || arr.length < 2)
        {
            return;
        }
        int first = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>first)
            {
                sec =  first;
                first=arr[i];
            }
            if(arr[i] != first && sec < first)
            {
                sec= arr[i];
            }
        }
        System.out.println(sec);
    }
}

