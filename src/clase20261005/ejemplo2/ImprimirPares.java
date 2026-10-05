package clase20261005.ejemplo2;

public class ImprimirPares extends Thread{
    private Imprimir imprimir;

    public ImprimirPares(Imprimir imprimir) {
        this.imprimir = imprimir;
    }

    @Override
    public void run() {
        for (int i = 0; i < Imprimir.MAX; i = i + 2) {
            imprimir.imprimePar(i);
        }
    }
}
