package clase20261008.productor_consumidor;

import java.util.LinkedList;
import java.util.Queue;

public class DatosCompartidos {
    final int MAX = 15;

    private Queue<Long> items;

    public DatosCompartidos() {
        items = new LinkedList<>();
    }

    public synchronized void addItem(long valor) {
        while (items.size()>= MAX) {
            //dormir
            try {
                wait(); //Si no hay espacio, se duermme
            } catch (InterruptedException e) {
                System.err.println("Error en wait productor");
            }
        }
        items.add(valor);
        System.out.println(items);
        notify(); //Avisa al que consume de que ya tiene algo
    }

    public synchronized long getItem() {
        while (items.isEmpty()) {
            try {
                wait(); //Si no hay nada que consumir, se duerme
            } catch (InterruptedException e) {
                System.err.println("Error en wait consumidor");
            }
        }
        long item = items.poll();
        System.out.println(items);
        notify(); //Ya hay espacio, despierto al productor
        return item;
    }

}
