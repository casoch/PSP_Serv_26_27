package clase20261008.productor_consumidor;

public class Productor extends Thread {
    private DatosCompartidos dc;

    public Productor(DatosCompartidos dc) {
        this.dc = dc;
    }

    @Override
    public void run() {
        while (true) {
            dc.addItem(Utils.getItemRandom());
//            try {
//                sleep(Utils.getNumRandom(100,500));
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}
