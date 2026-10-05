package clase20260917.ejercicio2;

public class Carrera extends Thread {

	public static final int NUM_CABALLOS = 4;

	private Caballo[] aCaballos;
	private boolean[] flagsLlegada;
	private int posicionLlegada;

	/**
	 * Inicializaciones por defecto.
	 * Se deben inicializar en aCaballos NUM_CABALLOS, asignando un nombre a cada uno.
	 * Ojo, que aquí no empiezan los threads todavía.
	 * Se deben poner los flagsLlegada de cada caballo a false (inicialmente ninguno ha llegado)
	 * Se debe poner posicionLlegada a 0. 
	 * Cada vez que un caballo llegue a meta se debería hacer posicionLlegada++ y
	 * asignar a ese caballo esa posicionLlegada.
	 */
	public Carrera() {
		aCaballos = new Caballo[NUM_CABALLOS];
		flagsLlegada = new boolean[NUM_CABALLOS];
		for (int i = 0; i < NUM_CABALLOS; i++) {
			aCaballos[i] = new Caballo("Caballo "+(i+1));
			flagsLlegada[i] = false;
		}
		posicionLlegada = 0;
	}

	/**
	 * Simula el comportamiento de la carrera en sí.
	 * Se muestra el progreso o la posición de llegada de cada caballo cada 1 segundo
	 * Si se detecta que un caballo ha llegado a meta, se le debe asignar la posición
	 *  de llegada.
	 * Acaba la función cuando todos los caballos han llegado a meta.
	 */
	@Override
	public void run() {
		for(Caballo c: aCaballos) {
			c.start();
		}
//		for (int i = 0; i < NUM_CABALLOS; i++) {
//			aCaballos[i].start();
//		}

		while(posicionLlegada < NUM_CABALLOS) {
            try {
                sleep(1000); //Dar tiempo para ver lo que está pasando
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

			//Comprobar si cada caballo ha llegado y que el flag de llegada sea false
			for (int i = 0; i < NUM_CABALLOS; i++) {
				if (aCaballos[i].isHaLlegado() && !flagsLlegada[i]) {
					flagsLlegada[i] = true;
					posicionLlegada++;
					aCaballos[i].setPuesto(posicionLlegada);
				}

				//Mostrar por consola el estado
				System.out.println(aCaballos[i]);
			}
        }
	}

}
