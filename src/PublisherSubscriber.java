import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class PublisherSubscriber {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(10);
        Publisher publisher =new Publisher(blockingQueue);
        Subscriber subscriber =new Subscriber(blockingQueue);

        Thread t1 =new Thread(publisher);
        Thread t2= new Thread(subscriber);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("done the process");
    }
}
class Publisher implements Runnable
{
    private final BlockingQueue<String> queue;
    public Publisher(BlockingQueue<String> queue)
    {
        this.queue=queue;
    }

    @Override
    public void run()
    {
        try {
            for (int i = 0; i < 5; i++) {
                String message ="Message "+i;
                System.out.println("Publishing: " + message);
                queue.put(message);
                Thread.sleep(100);

            }
            queue.put("DONE");
        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Subscriber implements Runnable
{
    private final BlockingQueue<String> queue;
    public Subscriber(BlockingQueue<String> queue)
    {
        this.queue=queue;
    }

    @Override
    public void run()
    {
        try {
            while (true) {
                String message = queue.take();
                if ("DONE".equals(message)) {
                    break;
                }
                System.out.println("consumer"+message);
            }
        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
