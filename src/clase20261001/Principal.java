package clase20261001;

public class Principal
{
    public static void main(String[] args) throws InterruptedException {
        DatosCompartidos dc = new DatosCompartidos();
        Temporizador temp = new Temporizador(dc);
        RecogeRespuestas resp = new RecogeRespuestas(dc);

        temp.start();
        resp.start();

        temp.join();
        resp.join();


    }
}
