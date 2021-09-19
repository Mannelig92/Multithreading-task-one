public class MyThread extends Thread {

    public MyThread(ThreadGroup mt, String name){
        super(mt,name);
    }
    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2500);
                System.out.printf("Я %s. Всем привет!\n", getName());
            }
        } catch (InterruptedException err) {

        } finally {
            System.out.printf("%s завершен\n", getName());
        }
    }
}
