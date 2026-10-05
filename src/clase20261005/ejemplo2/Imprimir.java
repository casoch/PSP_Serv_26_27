package clase20261005.ejemplo2;

import java.util.concurrent.atomic.AtomicBoolean;

public class Imprimir {
    final static int MAX = 1000000000;
    private AtomicBoolean tocaPares;

    public Imprimir() {
        tocaPares = new AtomicBoolean(true);
    }

    public synchronized void imprimePar(int num) {
        while (!tocaPares.get()) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println("Error en wait imprime par");
            }
        }

        System.out.println(num);
        tocaPares.set(false);
        notify();

    }

    public synchronized void imprimeImpar(int num) {
        while (tocaPares.get()) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println("Error en wait imprime impar");
            }
        }
        System.out.println(num);
        tocaPares.set(true);
        notify();

    }

}
