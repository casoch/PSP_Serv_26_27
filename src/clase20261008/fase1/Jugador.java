package clase20261008.fase1;

import java.time.LocalDateTime;

public class Jugador {
	/**
	 * Lo usaremos para generar nombres de jugadores automáticos
	 */
	private static int numJugador;

	/**
	 * Lo pondremos a "user"
	 */
	private String nombre;

	/**
	 * Será un número aleatorio entre 1 y 10
	 */
	private int nivel;

	/**
	 * Guardará la marca temporal a la que se ha conectado el jugador
	 */
	private LocalDateTime marcaTemporalConexion;

	static{
		numJugador = 0;
	}

	/**
	 * Debe inicializar el nombre del jugador a "user_NN" siendo NN un número que
	 * siempre se irá incrementando. Usa numJugador.
	 * El nivel se debe poner a un número aleatorio entre 1 y 10. Usa el método numRandom
	 * Pon la marcaTemporalConexion al momento actual.
	 */
	public Jugador() {

	}

	public int getNivel() {
		return nivel;
	}

	private int numRandom(int min, int max) {
		return (int) Math.floor(Math.random() * (max - min + 1) + min);
	}

	/**
	 * Calcula el tiempo que lleva esperando el jugador en ms.
 	 * @return Retorna este tiempo
	 */
	private long getTiempoEspera()
	{
		//Esto está puesto para que compile
		return -1;
	}

	/**
	 * Comprueba si se ha excedido el tiempo de espera del jugador.
	 * Es necesario utilizar la constante MS_TIME_OUT de Lobby.
	 * @return True, si se ha excedido el tiempo de espera. False, en caso contrario.
	 */
	public boolean inTimeOut()
	{
		//Esto está puesto para que compile
		return false;
	}

	/**
	 * Prepara un String que contiene el nombre del jugador, su nivel y el tiempo
	 * que lleva esperando en ms.
	 * @return El String construido.
	 */
	@Override
	public String toString() {
		//Esto está puesto para que compile.
		return super.toString();
	}
}
