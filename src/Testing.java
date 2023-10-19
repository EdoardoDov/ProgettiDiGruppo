package CompagniaSharedMobility;

import jdk.incubator.vector.VectorOperators;

import java.util.Scanner;

public class Testing {

    Utente u;
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SharedMobility sharedMobility = new SharedMobility();
        //Registriamo un utente
        Testing test1 = new Testing();
        test1.credenziali();
        //rimando le credenziali a sharedmobility
        sharedMobility.registraUtente(u);

    }

    public void credenziali(){
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

        u.setNome(nome);
        u.setCognome(cognome);
        u.setDataDiNascita(dataN);
        u.setCodfisc(cf);
        u.setPatente(patente);
        u.setCasco(casco);

    }


}
