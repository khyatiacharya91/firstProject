package HashMap;

import java.util.concurrent.atomic.AtomicInteger;

public class Account {
    int count;
    public int IncrementByOne()
    {
        return count;
    }

    void execute()
    {
        Thread t1 =new Thread(new Runnable(){
            @Override
            public void run()
            {
                IncrementByOne();
            }
        });
        Thread t2 =new Thread(new Runnable(){
            @Override
            public void run()
            {
                IncrementByOne();
            }
        });
        t1.start();
        t2.start();

//        t1.join();
//        t2.join();
    }

    public static void main(String[] args) {
        Account account =new Account();
        account.IncrementByOne();
    }
}




