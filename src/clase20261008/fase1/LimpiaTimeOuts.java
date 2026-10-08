package clase20261008.fase1;

public class LimpiaTimeOuts extends Thread {
    /**
     * Almacena los ms que deben transcurrir entre comprobaciones de timeout.
     */
    static final int MS_CHECK_TIMEOUT = 500;

    /**
     * Referencia al Lobby donde se guardarán los jugadores y partidas en curso
     */
    private Lobby lobby;

    /**
     * Flag que nos indica si tenemos que cerrar la ejecución de este thread.
     */
    private boolean stop;

    /**
     * Guardamos la referencia del lobby y ponemos stop a false.
     *
     * @param lobby
     */
    public LimpiaTimeOuts(Lobby lobby) {

    }

    /**
     * Hace lo necesario para parar la ejecución del thread.
     * Nada de interrupts ni cosas parecidas. Cerramos limpiamente.
     */
    public void stopExecution() {

    }

    /**
     * Mientras no se cierre el servidor se deben comprobar los timeouts de los jugadores
     * que están en espera dentro del lobby con el espacio de tiempo indicado.
     */
    @Override
    public void run() {

    }
}
