package clase20261005.ejemplo1;

import java.util.concurrent.atomic.AtomicLong;

public class DatosCompartidos {
    private AtomicLong numero;

    public DatosCompartidos() {
        this.numero = new AtomicLong(0);
    }

    public void incrementa() {
        this.numero.incrementAndGet();
    }

    public long getNumero() {
        return numero.get();
    }
}
