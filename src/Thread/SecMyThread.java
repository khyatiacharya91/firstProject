package Thread;

public class SecMyThread implements Runnable{
    public static void main(String[] args) {
        SecMyThread secMyThread = new SecMyThread();
        Thread thread = new Thread(secMyThread);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("run is running");
    }
}
