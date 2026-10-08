package clase20261008.productor_consumidor;

public class Principal {
    public static void main(String[] args) {
        DatosCompartidos dc = new DatosCompartidos();
        Productor prod = new Productor(dc);
        Consumidor cons = new Consumidor(dc);

        prod.start();
        cons.start();
    }
}
