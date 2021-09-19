public class Main {
    public static void main(String[] args) {
        ThreadGroup mainGroup = new ThreadGroup("main group");

        MyThread myThread1 = new MyThread(mainGroup, "Поток №1");
        myThread1.setName("Поток №1");
        MyThread myThread2 = new MyThread(mainGroup, "Поток №2");
        myThread2.setName("Поток №2");
        MyThread myThread3 = new MyThread(mainGroup, "Поток №3");
        myThread3.setName("Поток №3");
        MyThread myThread4 = new MyThread(mainGroup, "Поток №4");
        myThread4.setName("Поток №4");
        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        stopThread(mainGroup);
    }

    public static void stopThread(ThreadGroup mainGroup) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mainGroup.interrupt();
    }
}
