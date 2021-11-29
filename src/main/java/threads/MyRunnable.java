package threads;

public class MyRunnable implements Runnable {

    public void run() {
        go();
    }

    public void go() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex){
            ex.printStackTrace();
        }

        goMore();
    }

    public void goMore() {
        System.out.println("Вершина стека");
    }
}

class ThreadTester {

    public static void main(String[] args) {
        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);

        myThread.start();

        System.out.println("Возвращаемся в метод main");
    }
}
