package clase20260914;

import java.util.Scanner;

public class Ejemplo1 {
    public static void getNumLogicalProcessors() {
        int numProcLog = Runtime.getRuntime().availableProcessors();
        System.out.println("Num Proc Lógicos: "+numProcLog);
    }

    public static void main(String[] args) {
        //getNumLogicalProcessors();
        Scanner scann = new Scanner(System.in);
        try {
            CountDown countDown = new CountDown();
            countDown.start();
            
            while(!countDown.isEnd()) {
                System.out.println("Escribe algo...");
                String algo = scann.nextLine();
            }

            countDown.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
