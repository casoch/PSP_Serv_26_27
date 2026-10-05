package clase20261005.ejemplo2;

public class ImprimirImpares extends Thread{
    private Imprimir imprimir;

    public ImprimirImpares(Imprimir imprimir) {
        this.imprimir = imprimir;
    }

    @Override
    public void run() {
        for (int i = 1; i < Imprimir.MAX; i = i + 2) {
            imprimir.imprimeImpar(i);
        }
    }
}
