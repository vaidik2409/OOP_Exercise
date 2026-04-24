class Table {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread extends Thread {
    Table t;
    int number;

    MyThread(Table t, int number) {
        this.t = t;
        this.number = number;
    }

    public void run() {
        t.printTable(number);
    }
}

public class pra25 {
    public static void main(String[] args) {
        Table obj = new Table();

        MyThread t1 = new MyThread(obj, 5);
        MyThread t2 = new MyThread(obj, 7);

        t1.setName("Table-5");
        t2.setName("Table-7");

        t1.start();
        t2.start();
    }
}