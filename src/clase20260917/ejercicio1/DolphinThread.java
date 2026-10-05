package clase20260917.ejercicio1;

public class DolphinThread extends EventThread{

    @Override
    public void displayEvent() {
        System.out.println("Aparece un delfín saltando...");
    }

    @Override
    public long getInterval() {
        return 5000;
    }
}
