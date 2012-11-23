package li.test.examples.threadsafe;

import java.util.List;
import java.util.Vector;

/**
 * TODO check the condition that when the count of producer is different from
 * consumer. Currently when consumer is more than producer, program may can't
 * stop wile when producer is more than consumer, the size will be 5000
 * 
 * @author Yongfeng LI
 * 
 */
public class ListTest {

    public static void main(String[] args) throws InterruptedException {
        List<String> list = new Vector<String>();
        // List<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            Thread p1 = new Thread(new Producer(list));
            p1.start();
        }

        for (int i = 0; i < 10; i++) {
            Thread p2 = new Thread(new Producer(list));
            p2.start();
        }

        for (int i = 0; i < 10; i++) {
            Thread c1 = new Thread(new Consumer(list));
            c1.start();
        }

        for (int i = 0; i < 10; i++) {
            Thread c2 = new Thread(new Consumer(list));
            c2.start();
        }
        Thread.yield();

        while (Thread.activeCount() > 1) {
            Thread.sleep(100);
        }

        System.out.println(list.size());

    }

}
