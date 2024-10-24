package Thread;

public class MyThread extends Thread{
    public static void main(String[] args) {
        MyThread myThread =new MyThread();
        myThread.start();
        while (myThread.isAlive())
        {
            System.out.println("kkk");
        }
        System.out.println("in side");
    }

    @Override
    public void run() {
        System.out.println("abcd");
    }
}
