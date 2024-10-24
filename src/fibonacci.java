public class fibonacci {
    public static void main(String[] args) {
        int f1 = 0;
        int f2 = 1;
        int n =5;
//        0 1  1 2 3 5 8

        fibonacci fibonacci = new fibonacci();
            fibonacci.factorial(5);
//        System.out.println(fibonacci.feb(f1,f2,n));
//

    }

//    public void feb(int f1,int f2,int n)
//    {
//        if(n <= 0 ) return;
//        int f3 = f1 + f2;
//        f1=f2;
//        f2=f3;
//        System.out.println(f3);
//    }

    public int factorial(int n)
    {
        if( n <= 0) return 0;
        n=n*n-1;
        n = factorial(n);
        System.out.println(n);
        return n;
    }

    public int fact(int n) {
        if ( n == 0){
            return 1;
        }
        return n * fact(n-1);
    }




}
