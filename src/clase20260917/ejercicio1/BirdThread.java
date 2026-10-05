package clase20260917.ejercicio1;

public class BirdThread extends EventThread{

    @Override
    public void displayEvent() {
        System.out.println("Aparece un pájaro volando...");
    }

    @Override
    public long getInterval() {
        return 2000;
    }
}
