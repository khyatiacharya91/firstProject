public class PrintThread implements Runnable {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    @Override
    public void run() {
        System.out.println("sajdhsajh");
    }
}
