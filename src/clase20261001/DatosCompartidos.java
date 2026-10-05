package clase20261001;

public class DatosCompartidos {
    private final int MIN = 0;
    private final int MAX = 10;
    private int numAciertos;
    private int mult1;
    private int mult2;
    private boolean timeOut;
    private boolean hayRespuesta;
    private int numMult;

    public DatosCompartidos() {
        numAciertos = 0;
        numMult = 0;
        timeOut = false;
        hayRespuesta = false;
        generarMult();
    }

    public void generarMult() {
        numMult++;
        mult1 = (int) Math.floor(Math.random() * (MAX - MIN + 1) + MIN);
        mult2 = (int) Math.floor(Math.random() * (MAX - MIN + 1) + MIN);
        System.out.println("Se genera " + toString());

    }

    public boolean esAcierto(int resultado) {
        boolean ok = (mult1 * mult2 == resultado);
        if (ok) numAciertos++;
        else numAciertos--;
        return ok;
    }

    public String toString() {
        return mult1 + " * " + mult2 + " = ";
    }

    public double getNota() {
        return numAciertos*10.0/numMult;
    }

    public void setTimeOutTurno() {
        numAciertos--;
        System.out.println("Se te ha acabado el tiempo de turno.");
        generarMult();
        System.out.println(toString());
    }

    public boolean isTimeOut() {
        return timeOut;
    }

    public void setTimeOut() {
        this.timeOut = true;
    }

    public boolean isHayRespuesta() {
        return hayRespuesta;
    }

    public void setHayRespuesta(boolean hayRespuesta) {
        this.hayRespuesta = hayRespuesta;
        if (hayRespuesta) generarMult();
    }
}
