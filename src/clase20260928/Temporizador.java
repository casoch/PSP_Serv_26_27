package clase20260928;

public class Temporizador extends Thread {
    private final long MS_TIEMPO = 15000; // 15 seg
    private final long MS_INTERVALO = 1000; // 1 seg
    private DatosCompartidos dc;

    public Temporizador(DatosCompartidos dc) {
        this.dc = dc;
    }

    @Override
    public void run() {
        long tiempoAcumulado = 0;
        try {
            while (tiempoAcumulado < MS_TIEMPO && !dc.isEncontrado()) {
                sleep(MS_INTERVALO);
                tiempoAcumulado += MS_INTERVALO;
                System.out.println("Te quedan "+((MS_TIEMPO- tiempoAcumulado)/1000)+" segundos");
            }
            dc.setTimeOut(true);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
