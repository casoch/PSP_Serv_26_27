package clase20260917.ejercicio1;

public abstract class EventThread extends Thread{
    static boolean endSimulation;
    private boolean running;

    static {
        endSimulation = false;
    }

    public EventThread(){
        running = true;
    }

    public abstract void displayEvent();
    public abstract long getInterval();

//    public boolean isRunning() {
//        return running;
//    }
//
//    public void setRunning(boolean running) {
//        this.running = running;
//    }
    public void toggle() {
        running = !running;
    }

    @Override
    public void run() {
        while (!endSimulation) {
            if (running) displayEvent();
            try {
                sleep(getInterval());
            } catch (InterruptedException e) {
                System.err.println("Error en sleep");
            }
        }
    }

}
