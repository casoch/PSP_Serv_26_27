package clase20261005.ejemplo1;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Incrementador> incrementadores = new ArrayList<>();

        DatosCompartidos dc = new DatosCompartidos();
        for (int i = 0; i < 4; i++) {
            Incrementador inc = new Incrementador(dc);
            incrementadores.add(inc);
            inc.start();
        }

        try {
            for (int i = 0; i < 4; i++) {
                incrementadores.get(i).join();
            }
        } catch (InterruptedException e) {
            System.err.println("Error en un join");
        }

        System.out.println("El número final: "+dc.getNumero());
    }
}
