package clase20260917.ejercicio2;

public class Caballo extends Thread {
    public static final double META = 100;
    static final double MIN_AVANCE = 0;
    static final double MAX_AVANCE = 10;
    static final long MS_REFRESCO = 1000;
    private double progreso;
    private int puesto;
 private boolean haLlegado;

    /**
     * YA IMPLEMENTADO
     * Inicializaciones por defecto
     */
    public Caballo() {
        progreso = 0;
        puesto = 0;
        haLlegado = false;
    }

    /**
     * YA IMPLEMENTADO
     * Permite asignar un nombre al caballo
     */
    public Caballo(String nombre) {
        this();
        setName(nombre);
    }

    public boolean isHaLlegado() {
        return haLlegado;
    }

    /**
     * YA IMPLEMENTADO
     * Permite asignar al caballo la posición en la que ha quedado
     * en la carrera
     *
     * @param puesto Puesto en el que ha quedado el caballo
     */
    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    /**
     * YA IMPLEMENTADO
     * Genera un número aleatorio entre MIN_AVANCE y MAX_AVANCE (ambos incluidos)
     *
     * @return Retorna el número generado.
     */
    public double GeneraAvance() {
        return (double) Math.floor(Math.random() * (MAX_AVANCE - MIN_AVANCE + 1) + MIN_AVANCE);
    }

    /**
     * Cada segundo hace que el caballo avance en su posición un valor entre 0 y 10
     * Cuando el caballo llega a meta, la función debe acabar.
     */
    @Override
    public void run() {
        while (!haLlegado) {
            try {
                sleep(MS_REFRESCO);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            progreso += GeneraAvance();
            if (progreso >= META) {
                progreso = META;
                haLlegado = true;
            }
        }

    }

    /**
     * Retorna un String que contiene el nombre del caballo y
     * su progreso en la carrera en forma de porcentaje o bien
     * la posición en la que ha llegado, si ya ha finalizado la carrera
     */
    @Override
    public String toString() {
        String str = "Caballo "+getName()+": "+progreso+"% - ";
        if (!haLlegado)
            str+= "En carrera";
        else
            str+= "Puesto "+puesto;
        return str+"\n";
    }

}
