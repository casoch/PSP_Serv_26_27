package clase20261005.ejemplo2;

public class Principal {
    public static void main(String[] args) {
        Imprimir imprimir = new Imprimir();
        ImprimirPares ip = new ImprimirPares(imprimir);
        ImprimirImpares ii = new ImprimirImpares(imprimir);

        ip.start();
        ii.start();
        try {
            ip.join();
            ii.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
