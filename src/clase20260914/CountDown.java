package clase20260914;

public class CountDown extends Thread {
    private boolean end;

    public CountDown() {
        end = false;
    }

    public boolean isEnd() {
        return end;
    }

    @Override
    public void run() {
        try {
            sleep(2000);
            end = true;
            System.out.println("GAME OVER!!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
