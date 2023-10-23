package CompagniaSharedMobility;

import java.util.Scanner;

public class Testing {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Utente u = new Utente("Davide", "Kappa", "KPPDVD", "21/03/95", false, 'B');
        Utente u2 = new Utente("Dito", "Mano", "DMTP", "21/03/95", true, 'A');
        Utente u3 = new Utente();
        SharedMobility sharedMobility = new SharedMobility();
        sharedMobility.registraUtente(u);
        sharedMobility.affittaVeicolo(u);
        sharedMobility.registraUtente(u2);
        sharedMobility.registraUtente(u3);
        sharedMobility.affittaVeicolo(u2);
        System.out.println("----------------------");
        System.out.println(u.toString());
        System.out.println("----------------------");
        sharedMobility.restituisciVeicolo(u);
        System.out.println("----------------------");
        System.out.println(u.toString());



    }

}
