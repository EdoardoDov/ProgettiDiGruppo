package CompagniaSharedMobility;

import java.util.Scanner;

public class SharedMobility {

    public Scanner scanner = new Scanner(System.in);
    
    DatabaseFake d = new DatabaseFake();
    public void registraUtente(Utente u){ //NUOVA VERSIONE CHE SI COLLEGA AL TESTING
        d.aggiungiUtente(u);
    }

   /* public void registraUtente(){ //VERSIONE PRECEDENTE


        String nome, cognome, cf, dataN, rispostaCasco;
        char patente;
        boolean casco = false;

        System.out.println("-------------");
        System.out.println("Benvenuto");
        System.out.println("-------------");

        System.out.println("Inserisci nome: ");
        nome = scanner.nextLine();

        System.out.println("Inserisci cognome: ");
        cognome = scanner.nextLine();

        System.out.println("Inserisci Codice fiscale: ");
        cf = scanner.nextLine();

        System.out.println("Inserisci Data di nascita: ");
        dataN = scanner.nextLine();

        System.out.println("Inserisci il tipo di patente che possiedi (A o B): ");
        patente = scanner.next().toUpperCase().charAt(0);

        System.out.println("Hai un casco? (si/no) ");
        rispostaCasco = scanner.next();
        rispostaCasco.toLowerCase();

        if (rispostaCasco.equals("si") || rispostaCasco.equals("s") ){
                casco = true;

        }

        else if(rispostaCasco.equals("no") || rispostaCasco.equals("n")){
                casco = false;

        }

        else System.out.println("Comando errato");

        Utente utente = new Utente(nome, cognome, cf, dataN, casco, patente);
        d.aggiungiUtente(utente);
        } */

    public void aggiungiCredito(){
        double credito;
        int idRicerca;
        System.out.println("Inserisci l'importo da aggiungere: ");
        credito = scanner.nextDouble();
        System.out.println("Inserisci il tuo id: ");
        idRicerca = scanner.nextInt();




    }




    }




