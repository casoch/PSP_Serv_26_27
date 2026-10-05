package clase20260917.ejercicio2;


public class Control {
	//YA IMPLEMENTADO
	public static void main(String[] args) {
		Carrera carrera = new Carrera();
		carrera.start();
		
		try {
			carrera.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Finalizó la carrera");
	}

}
