import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Train {
    public static void main(String[] args) {
        int[] x = { 900 ,940, 950, 1100, 1500, 1800};
        int[] y= {910, 1200 ,1120, 1130, 1900, 2000};
        int n=6;
        System.out.println(Train.calculateStation(x,y,n));

    }
    public static int calculateStation(int[] x,int[] y,int n)
    {
        if(x.length < 0 && y.length < 0) return 0;
        int platform=1;int res=1;
        for (int i = 0; i < n; i++) {
            platform=1;
            for (int j = 0; j < n; j++) {
                if(x[i] != x[j])
                {
                    if(x[i] >= x[j] && y[j] > x[i])
                    {
                        platform++;
                    }
                }
            }
            res = Math.max(res,platform);
        }
        return res;
    }
}
