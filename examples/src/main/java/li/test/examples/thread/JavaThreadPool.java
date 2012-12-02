package li.test.examples.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JavaThreadPool {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ExecutorService pool1 = Executors.newFixedThreadPool(2);
        ExecutorService pool2 = Executors.newFixedThreadPool(2);
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        MyThread t4 = new MyThread();
        MyThread t5 = new MyThread();
        
        pool1.execute(t1);
        pool1.execute(t2);
        pool1.execute(t3);
        pool1.execute(t4);
        pool2.execute(t5);
        
        pool1.shutdown();
        pool2.shutdown();
    }

    private static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
