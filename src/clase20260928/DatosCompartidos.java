package clase20260928;

public class DatosCompartidos {
    private boolean timeOut;
    private boolean encontrado;
    private int numAdivinar;
    private int numIntentos;
    private final int MAX = 100;
    private final int MIN = 1;

    public DatosCompartidos() {
        timeOut = false;
        encontrado = false;
        numIntentos=0;
        numAdivinar = (int)(Math.random()*(MAX-MIN+1)+MIN);
    }

    public boolean isTimeOut() {
        return timeOut;
    }

    public void setTimeOut(boolean timeOut) {
        this.timeOut = timeOut;
    }

    public boolean isEncontrado() {
        return encontrado;
    }

    public void setEncontrado(boolean encontrado) {
        this.encontrado = encontrado;
    }

    /**
     *
     * @param numUsuario
     * @return 0 --> Si son iguales
     * -1 --> +grande el num interno (atributo)
     * 1 --> +grande el parámetro
     */
    public int comparaNum(int numUsuario) {
        if  (numUsuario == numAdivinar) return 0;
        if (this.numAdivinar > numUsuario) return -1;
        return 1;
    }

    public int getNumIntentos() {
        return numIntentos;
    }

    public void incrementarIntentos() {
        numIntentos++;
    }
}
