package li.test.examples.threadsafe;

import java.util.List;

class Consumer implements Runnable {
    private List<String> list;

    public Consumer(List<String> pList) {
      list = pList;
    }

    public void run() {
      System.out.println("Consumer started");
      for (int i = 0; i < 5000; i++) {
        while (!list.remove(Integer.toString(i))) {
          // Just iterating till an element is removed
        }

      }
      System.out.println("Consumer completed");
    }
  }
