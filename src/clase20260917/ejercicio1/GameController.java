package clase20260917.ejercicio1;

import java.util.Scanner;

public class GameController {
    private EventThread birdThread, dolphinThread, stormThread;

    public GameController() {
        birdThread = new BirdThread();
        dolphinThread = new DolphinThread();
        stormThread = new StormThread();
    }

    public void startGame() throws InterruptedException {
        birdThread.start();
        dolphinThread.start();
        stormThread.start();

        Scanner scann = new Scanner(System.in);
        char opcion;

        do {
            System.out.println("Escoge...");
            System.out.println("'P' --> Activar/Desactivar el pájaro");
            System.out.println("'D' --> Activar/Desactivar el delfín");
            System.out.println("'S' --> Activar/Desactivar la tormenta");
            System.out.println("'E' --> Salir de la simulación");
            opcion = scann.nextLine().toUpperCase().charAt(0);
            switch (opcion) {
                case 'P':
                    birdThread.toggle();
                    break;
                case 'D':
                    dolphinThread.toggle();
                    break;
                case 'S':
                    stormThread.toggle();
                    break;
                case 'E':
                    EventThread.endSimulation = true;
                    break;
                default:
                    System.err.println("Opción incorrecta.");
            }
        }while(opcion != 'E');
        birdThread.join();
        dolphinThread.join();
        stormThread.join();
        System.out.println("La simulación ha finalizado");
    }

    public static void main(String[] args) throws InterruptedException {
        GameController gc = new GameController();
        gc.startGame();
    }

}
