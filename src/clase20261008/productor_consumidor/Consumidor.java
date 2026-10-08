package clase20261008.productor_consumidor;

public class Consumidor extends Thread {
    private DatosCompartidos dc;

    public Consumidor(DatosCompartidos dc) {
        this.dc = dc;
    }

    @Override
    public void run() {
        while (true) {
            dc.getItem();
//            try {
//                sleep(Utils.getNumRandom(100,500));
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}
