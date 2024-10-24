package Thread.SynExample;

public class DeadLock {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        // Create two threads to simulate concurrent access
        Thread t1 = new Thread(() -> a.safeGet(b));
        Thread t2 = new Thread(() -> b.safeGet(a));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class A {
    public void safeGet(B b) {
        synchronized (A.class) {
            System.out.println("Locked A");
            synchronized (B.class) {
                System.out.println("Locked B inside A");
                System.out.println("hello world from A");
            }
        }
    }
}

class B {
    public void safeGet(A a) {
        synchronized (A.class) {
            System.out.println("Locked A inside B");
            synchronized (B.class) {
                System.out.println("Locked B");
                System.out.println("hello world from B");
            }
        }
    }
}
