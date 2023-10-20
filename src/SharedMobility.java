package CompagniaSharedMobility;

import java.util.Scanner;

public class SharedMobility {

    public Scanner scanner = new Scanner(System.in);

    DatabaseFake d = new DatabaseFake();
    Automobile a = new Automobile();
    Automobile b = new Automobile();
    Automobile c = new Automobile();

    public SharedMobility(){
        aggiungi();
    }

    public void registraUtente(Utente u){
        if(u.getNome() == null){
        credenziali(u);
        d.aggiungiUtente(u);
        }
        else d.aggiungiUtente(u);

    }

    public void aggiungi(){
        d.aggiungiVeicolo(a);
        d.aggiungiVeicolo(b);
        d.aggiungiVeicolo(c);
    }

    //Metodo per la compilazione delle credenziali dell'utente
     public void credenziali(Utente u){
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

    public void aggiungiCredito(){
        double credito;
        int idRicerca;
        System.out.println("Inserisci l'importo da aggiungere: ");
        credito = scanner.nextDouble();
        System.out.println("Inserisci il tuo id: ");
        idRicerca = scanner.nextInt();

    }

    public void affittaVeicolo(Utente u){


        Veicolo v = d.searchVeicolo();
        if(u.getVeicolo() == null && u.getCredito()>v.getTariffa()){
            u.setVeicolo(v);
            d.aggiungiNoleggiato(v);
        }
        else System.out.println("Non è possibile affittare più di un veicolo alla volta!");

    }

    public void restituisciVeicolo(Utente u){

        d.aggiungiDisponibili(u.getVeicolo());
        u.setVeicolo(null);

    }




}



