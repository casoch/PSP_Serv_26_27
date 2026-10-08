package clase20261008.fase1;

import java.io.File;
import java.time.LocalDateTime;
import java.util.List;

public class Lobby {
	/**
	 * Marca cuántos jugadores pueden haber en espera en el lobby
	 */
	private static int MAX_CAPACITY_LOBBY = 50;
	/**
	 * Tiempo máximo que puede estar esperando un jugador sin que se le asigne partida
	 */
	public static int MS_TIME_OUT = 5000;
	/**
	 * Lo inicializaremos a la fecha y hora de arranque del servidor para poder
	 * calcular tiempos relativos al inicio de sesión.
	 */
	private static LocalDateTime marcaTemporalInicio;
	/**
	 * Guarda los jugadores que han llegado al servidor y están esperando partida
	 */
	private List<Jugador> listaJugadores;
	/**
	 * El fichero de log en el que iremos apuntando lo que pase.
	 * No lo mostraremos por pantalla.
	 */
	private File fLog;

	/**
	 * Pone la marcaTemporalInicio a la fecha y hora actual
	 * Pide memoria para el listado de jugadores en espera.
	 * Prepara el fichero, que se llamará "LogMatchmaking.txt"
	 */
	public Lobby() {

	}

	/**
	 * Este método se llamará desde FuenteConexiones cada vez que tenga que llegar
	 * un nuevo jugador.
	 * Este método debe controlar que la lista de jugadores no haya llegado a su máxima
	 * capacidad.
	 * Si es así, debe quedar a la espera hasta que la lista se vacíe.
	 */
	public void llegadaJugadores() {

	}

	/**
	 * Este método se llamará desde LimpiaTimeOuts cuando toque verificar si hay
	 * jugadores que deben ser desconectados.
	 * En caso de que se haya tenido que desconectar algún Jugador por timeout,
	 * se debe notificar para que la llegada de jugadores se pueda reactivar,
	 * en caso de que se hubiera quedado parada.
	 */
	public void detectaTimeOuts() {

	}

	/**
	 * Añade el texto indicado al fichero.
	 * Se debe añadir delante del texto los ms que han transcurrido desde el arranque
	 * del servidor.
	 * [5600ms] mensaje que se pasa como parámetro.
	 * Dentro de este método se debería:
	 * - Abrir el fichero en modo append
	 * - Escribir la info
	 * - Cerrar el fichero
	 * @param texto Texto que se tiene que escribir a fichero
	 */
	public void EscribeLog(String texto)
	{

	}

}
