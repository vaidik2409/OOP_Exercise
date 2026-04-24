class NumberThread extends Thread {
    int start, end;

    NumberThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

public class pra24 {
    public static void main(String[] args) {
        NumberThread t1 = new NumberThread(1, 100);
        NumberThread t2 = new NumberThread(101, 200);
        NumberThread t3 = new NumberThread(201, 300);

        t1.setName("T1");
        t2.setName("T2");
        t3.setName("T3");

        try {
            t1.start();
            t1.join();

            t2.start();
            t2.join();

            t3.start();
            t3.join();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}