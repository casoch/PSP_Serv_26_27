package clase20260917.ejercicio1;

public class StormThread extends EventThread{

    @Override
    public void displayEvent() {
        System.out.println("Se aproxima una tormenta...");
    }

    @Override
    public long getInterval() {
        return 10000;
    }
}
