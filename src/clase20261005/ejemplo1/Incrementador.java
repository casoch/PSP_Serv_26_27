package clase20261005.ejemplo1;

public class Incrementador extends Thread {
    private final long MAX = 100000000l;
    private DatosCompartidos dc;

    public Incrementador(DatosCompartidos dc) {
        this.dc = dc;
    }

    @Override
    public void run() {
        for (long i = 0; i < MAX; i++) {
            dc.incrementa();
        }
    }
}
