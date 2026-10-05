package clase20260928;

public class Principal {
    public static void main(String[] args) throws InterruptedException {
        DatosCompartidos dc = new DatosCompartidos();
        Temporizador temp = new Temporizador(dc);
        RecogeRespuestas rr = new RecogeRespuestas(dc);
        temp.start();
        rr.start();

        temp.join();
        rr.join();

        System.out.println("GAME OVER");

    }
}
