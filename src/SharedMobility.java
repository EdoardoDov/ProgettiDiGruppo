package CompagniaSharedMobility;

import java.util.Scanner;

public class SharedMobility {

    Scanner scanner = new Scanner(System.in);

    DatabaseFake d = new DatabaseFake();
    Automobile auto1 = new Automobile(); Automobile auto2 = new Automobile(); Automobile auto3 = new Automobile();
    Monopattino mono1 = new Monopattino(); Monopattino mono2 = new Monopattino(); Monopattino mono3 = new Monopattino();
    Furgoncino fur1 = new Furgoncino(); Furgoncino fur2 = new Furgoncino(); Furgoncino fur3 = new Furgoncino();
    Bicicletta bici1 = new Bicicletta(); Bicicletta bici2 = new Bicicletta(); Bicicletta bici3 = new Bicicletta();
    Scooter sc1 = new Scooter(); Scooter sc2 = new Scooter(); Scooter sc3 = new Scooter();

    public SharedMobility(){aggiungi();}

    public void registraUtente(Utente u){
        if(u.getNome() == null){
            credenziali(u);
            d.aggiungiUtente(u);
        }
        else d.aggiungiUtente(u);

    }

    public void aggiungi(){
        d.aggiungiVeicolo(auto1); d.aggiungiVeicolo(auto2); d.aggiungiVeicolo(auto3);

        d.aggiungiVeicolo(mono1); d.aggiungiVeicolo(mono2); d.aggiungiVeicolo(mono3);

        d.aggiungiVeicolo(bici1); d.aggiungiVeicolo(bici2); d.aggiungiVeicolo(bici3);

        d.aggiungiVeicolo(sc1); d.aggiungiVeicolo(sc2); d.aggiungiVeicolo(sc3);

        d.aggiungiVeicolo(fur1); d.aggiungiVeicolo(fur2); d.aggiungiVeicolo(fur3);
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
        rispostaCasco = rispostaCasco.toLowerCase();

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

    public void aggiungiCredito(Utente u){
        double credito;
        System.out.println("Il tuo credito è: " + u.getCredito());
        System.out.println("Quanto vuoi aggiungere? ");
        credito = scanner.nextDouble();
        u.setCredito(credito);


    }

    public void affittaVeicolo(Utente u){

        int minuti; //mi serve per moltiplicare la tariffa al minuto con il tempo di utilizzo

        Veicolo v = d.searchVeicolo();

        if (v.getTariffa() == fur1.getTariffa()){
            if(u.getPatente() == fur1.patente){
                System.out.println("Per quanto tempo devi affittare il veicolo? ");
                minuti = scanner.nextInt();
                if(minuti < 5){
                    System.out.println("Il tempo minimo di utilizzo è di 5 minuti, prego inserire un nuovo tempo di utilizzo: ");
                    minuti = scanner.nextInt();
                }

                if(u.getVeicolo() == null){

                    if(u.getCredito()<(v.getTariffa()*minuti)){
                        System.out.println("Credito insufficiente per l'affitto");
                        System.out.println("Il costo per l'affitto è: " + (v.getTariffa()*minuti));
                        while (u.getCredito()<v.getTariffa()*minuti){
                            aggiungiCredito(u);
                        }
                    }
                    u.setVeicolo(v);
                    u.setCredito(-(v.getTariffa()*minuti));
                    d.aggiungiNoleggiato(v);
                }
                else System.out.println("Non è possibile affittare il veicolo!");

            }
            else System.out.println("Non possiedi la patente adeguata per questo veicolo");
        }
        if (v.getTariffa() == auto1.getTariffa()){
            if(u.getPatente() == auto1.patente){
                System.out.println("Per quanto tempo devi affittare il veicolo? ");
                minuti = scanner.nextInt();
                if(minuti < 5){
                    System.out.println("Il tempo minimo di utilizzo è di 5 minuti, prego inserire un nuovo tempo di utilizzo: ");
                    minuti = scanner.nextInt();
                }

                if(u.getVeicolo() == null){

                    if(u.getCredito()<(v.getTariffa()*minuti)){
                        System.out.println("Credito insufficiente per l'affitto");
                        System.out.println("Il costo per l'affitto è: " + (v.getTariffa()*minuti));
                        while (u.getCredito()<v.getTariffa()*minuti){
                            aggiungiCredito(u);
                        }
                    }
                    u.setVeicolo(v);
                    u.setCredito(-(v.getTariffa()*minuti));
                    d.aggiungiNoleggiato(v);
                }
                else System.out.println("Non è possibile affittare il veicolo!");

            }
            else System.out.println("Non possiedi la patente adeguata per questo veicolo");
        }
        if (v.getTariffa() == mono1.getTariffa()){
                System.out.println("Per quanto tempo devi affittare il veicolo? ");
                minuti = scanner.nextInt();
                if(minuti < 5){
                    System.out.println("Il tempo minimo di utilizzo è di 5 minuti, prego inserire un nuovo tempo di utilizzo: ");
                    minuti = scanner.nextInt();
                }

                if(u.getVeicolo() == null){

                    if(u.getCredito()<(v.getTariffa()*minuti)){
                        System.out.println("Credito insufficiente per l'affitto");
                        System.out.println("Il costo per l'affitto è: " + (v.getTariffa()*minuti));
                        while (u.getCredito()<v.getTariffa()*minuti){
                            aggiungiCredito(u);
                        }
                    }
                    u.setVeicolo(v);
                    u.setCredito(-(v.getTariffa()*minuti));
                    d.aggiungiNoleggiato(v);
                }
                else System.out.println("Non è possibile affittare il veicolo!");



        }
        if (v.getTariffa() == bici1.getTariffa()){
            if(u.isCasco()){
                System.out.println("Per quanto tempo devi affittare il veicolo? ");
                minuti = scanner.nextInt();
                if(minuti < 5){
                    System.out.println("Il tempo minimo di utilizzo è di 5 minuti, prego inserire un nuovo tempo di utilizzo: ");
                    minuti = scanner.nextInt();
                }

                if(u.getVeicolo() == null){

                    if(u.getCredito()<(v.getTariffa()*minuti)){
                        System.out.println("Credito insufficiente per l'affitto");
                        System.out.println("Il costo per l'affitto è: " + (v.getTariffa()*minuti));
                        while (u.getCredito()<v.getTariffa()*minuti){
                            aggiungiCredito(u);
                        }
                    }
                    u.setVeicolo(v);
                    u.setCredito(-(v.getTariffa()*minuti));
                    d.aggiungiNoleggiato(v);
                }
                else System.out.println("Non è possibile affittare il veicolo!");

            }
            else System.out.println("Casco necessario per noleggiare il mezzo");
        }
        if (v.getTariffa() == sc1.getTariffa()){
            if(u.getPatente() == sc1.patente || u.getPatente() == 'B') {
                if (u.isCasco()) {
                    System.out.println("Per quanto tempo devi affittare il veicolo? ");
                    minuti = scanner.nextInt();
                    if (minuti < 5) {
                        System.out.println("Il tempo minimo di utilizzo è di 5 minuti, prego inserire un nuovo tempo di utilizzo: ");
                        minuti = scanner.nextInt();
                    }

                    if (u.getVeicolo() == null) {

                        if (u.getCredito() < (v.getTariffa() * minuti)) {
                            System.out.println("Credito insufficiente per l'affitto");
                            System.out.println("Il costo per l'affitto è: " + (v.getTariffa() * minuti));
                            while (u.getCredito() < v.getTariffa()*minuti) {
                                aggiungiCredito(u);
                            }
                        }
                        u.setVeicolo(v);
                        u.setCredito(-(v.getTariffa() * minuti));
                        d.aggiungiNoleggiato(v);
                    } else System.out.println("Non è possibile affittare il veicolo!");

                }
                else System.out.println("Casco necessario per il noleggio del veicolo");
            }
            else System.out.println("Non possiedi la patente adeguata per questo veicolo");
            }


    }

    public void restituisciVeicolo(Utente u){
        
            if(u.getVeicolo() != null) {
                d.aggiungiDisponibili(u.getVeicolo());
                u.setVeicolo(null);
                System.out.println("Veicolo restituito!");
                System.out.println("---------------");
                System.out.println("I veicoli disponibili ora sono: " + d.veicoliDisponibili);
                
            }
        else System.out.println("Nessun veicolo da restituire");
        


    }

}





