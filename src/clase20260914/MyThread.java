package clase20260914;

public class MyThread extends Thread {
    @Override
    public void run() {
        long idThread = currentThread().threadId();
        //try {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Thread: "+idThread+" --> "+i);
                //sleep(100);
            }
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }
}
