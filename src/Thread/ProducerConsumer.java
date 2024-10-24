package Thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer extends Thread{

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

        Thread producer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    String message = "Producer" + i;
                    System.out.println(message);
                    queue.put(message);
                    Thread.sleep(100);
                }
                queue.put("DONE");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread consumer = new Thread(()->{
            try {
                while (true) {
                    String message = queue.take();
                    System.out.println("Consumer" + message);
                    if ("DONE".equals(message)) {
                        break;
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        producer.start();
        consumer.start();
        producer.join();
        consumer.join();
    }
}
