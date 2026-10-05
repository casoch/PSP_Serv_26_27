package clase20261001;

public class Temporizador extends Thread {
    /**
     * El tiempo de timeOut.
     * Cuando se llega a este tiempo, acaba el juego.
     */
    private final long MS_TIEMPO = 30000;

    /**
     * Cuando acabe este tiempo, si el usuario no ha escrito nada, se contabiliza un fallo
     * y se genera otra multiplicación.
     */
    private final long MS_TURNO = 5000;

    /**
     * Cada este tiempo revisaremos si el usuario ha escrito algo respecto a la operación
     * Si ha escrito algo, debo resetear el tiempoAcumulado.
     */
    private final long MS_INTERVALO = 500;

    /**
     * Aquí iremos sumando el tiempo de intervalo.
     * Cuando tiempoAcumulado == MS_TURNO, contabilizamos fallo
     */
    private long tiempoTurnoAcumulado;

    /**
     * Aquí iremos sumando el tiempo de intervalo.
     * Cuando tiempoAcumulado == MS_TIEMPO, marcaremos el fin de partida
     */
    private long tiempoPartidaAcumulado;

    private DatosCompartidos dc;

    public Temporizador(DatosCompartidos dc) {
        //this.dc = new DatosCompartidos();
        this.dc = dc;
        tiempoTurnoAcumulado = 0;
        tiempoPartidaAcumulado = 0;
    }

    @Override
    public void run() {
        try {
            //Mientras no se acabe el tiempo de la partida
            while (tiempoPartidaAcumulado < MS_TIEMPO) {
                //Me duermo un pequeño intervalo de tiempo.
                Thread.sleep(MS_INTERVALO);
                //Incremento los tiempos de partida y de turno
                tiempoTurnoAcumulado += MS_INTERVALO;
                tiempoPartidaAcumulado += MS_INTERVALO;
                //Si hay respuesta, desmarco el hay respuesta porque ya lo he visto
                //y reseteo el acumulado
                if (dc.isHayRespuesta()) {
                    dc.setHayRespuesta(false);
                    tiempoTurnoAcumulado = 0;
                }
                //Si hemos sobre pasado el tiempo de turno, llamo al método de DatosCompartidos
                //que actualiza la puntuación, informa y genera una nueva multiplicación
                if (tiempoTurnoAcumulado >= MS_TURNO) {
                    dc.setTimeOutTurno();
                    tiempoTurnoAcumulado = 0;
                }
            }
            //Informo de que ha acabado el tiempo de partida.
            dc.setTimeOut();
            System.out.println("Fin de simulación. Tienes un: "+dc.getNota());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
