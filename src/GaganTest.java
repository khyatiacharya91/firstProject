public class GaganTest {
    public static void main(String[] args) {
        int x= 3;
        int y= 4;
        int z= 9;
        GaganTest gaganEx = new GaganTest();
        gaganEx.getMinBack(17,x,y,z);
    }

    public int getMinBack(int n,int x,int y,int z)
    {
        if (n ==0) return 0;
        int count =0;
        for (int i = 0; i < n && n > 0; i++) {
            if(n != 0 && n >= z)
            {
                n=n-z;
                count++;
            }
            if(n != 0 && n >=y)
            {
                n= n-y;
                count++;
            }
            if(n != 0 && n >=x)
            {
                n= n-x;
                count++;
            }
        }
        return count;
    }
}
