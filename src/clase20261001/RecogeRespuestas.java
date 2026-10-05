package clase20261001;

import java.util.Scanner;

public class RecogeRespuestas extends Thread {
    private DatosCompartidos dc;
    private Scanner scann;

    public RecogeRespuestas(DatosCompartidos dc) {
        this.dc = dc;
        scann = new Scanner(System.in);
    }

    @Override
    public void run() {
        //Mientras no se acabe el tiempo de la partida
        while (!dc.isTimeOut()) {
            //Pido al usuario un número
            //Desde aquí no sé a qué multiplicación corresponde, eso está en DatosCompartidos
            System.out.println(dc);
            int num = Integer.parseInt(scann.nextLine());
            //Es posible que mientras estaba escribiendo, si tardo mucho, se me acabe el tiempo de partida
            //por eso se comprueba antes de decir si la mult es correcta.
            if (!dc.isTimeOut()) {
                //Si no se había acabado el tiempo, miro si coincide con la multiplicación que hay ahora mismo
                //en DatosCompartidos
                //Desde esAcierto se actualiza la puntuación.
                boolean acierto = dc.esAcierto(num);
                //Informo de si se ha acertado o no
                if (acierto) System.out.println("Has acertado");
                else System.out.println("Has fallado");
                //Marco que hay respuesta, para que el temporizador lo sepa y resetee el tiempo de respuesta
                //Eso es independiente de si acierto o no
                dc.setHayRespuesta(true);
            }
        }
    }
}