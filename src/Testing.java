package CompagniaSharedMobility;

import java.util.Scanner;

public class Testing {

   
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) { 
        Utente u = new Utente;
        SharedMobility sharedMobility = new SharedMobility();
        sharedMobility.registraUtente(u);

    }

}
