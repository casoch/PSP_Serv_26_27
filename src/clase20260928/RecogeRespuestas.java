package clase20260928;

import java.util.Scanner;

public class RecogeRespuestas extends Thread{
    private DatosCompartidos dc;
    private Scanner scann;

    public RecogeRespuestas(DatosCompartidos dc) {
        this.dc = dc;
        this.scann = new Scanner(System.in);
    }

    @Override
    public void run() {
        while(!dc.isTimeOut() && !dc.isEncontrado()) {
            System.out.println("Introduce un número:");
            int num = Integer.parseInt(scann.nextLine());
            if (!dc.isTimeOut()) {
                int comparacion = dc.comparaNum(num);
                if (comparacion == -1)
                    System.out.println("El número que debes adivinar es mayor");
                else if (comparacion == 1)
                    System.out.println("El número que debes adivinar es menor");
                else {
                    System.out.println("Has adivinado el número");
                    dc.setEncontrado(true);
                }
            }
        }
    }
}
