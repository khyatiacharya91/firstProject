package Thread;

class NameThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <=10; i++) {
            System.out.println(i);
        }
    }
}

public class NameRunnnable
{
    public static void main(String[] args) {
        NameThread nameThread = new NameThread();

        Thread t = new Thread(nameThread);
        t.setPriority(1);
        Thread t1 = new Thread(nameThread);
        t.setPriority(2);
        Thread t2 = new Thread(nameThread);
        t.setPriority(3);
        var t3 = new Thread(nameThread);
        var s = "khyati";
        var in = 1;
        var arr = new int[]{1, 2, 3, 4};

        var mythread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
            }
        });




        //        t.setPriority(4);
        //nameThread.run();
//        t.start();
//        t1.start();
//        t2.start();
//        t3.start();
        //t.start();

    }

}
