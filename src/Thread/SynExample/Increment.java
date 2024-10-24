package Thread.SynExample;

import java.util.concurrent.atomic.AtomicInteger;

public class Increment
{

    public int count;
//    1st synchronized or we can use AtomicInteger as well
    public synchronized int incrmentByone()
    {
        return count++;
    }

    public void execute() throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    incrmentByone();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    incrmentByone();
                }
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }

    public static void main(String[] args) throws InterruptedException {
        Increment increment=new Increment();
        increment.execute();
    }

}