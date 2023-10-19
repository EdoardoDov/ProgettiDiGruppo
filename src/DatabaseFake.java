import java.util.*;

public class DatabaseFake {
    List<Veicolo> flotta;
    List<Veicolo> veicoliNoleggiati;
    List<Veicolo> veicoliDisponibili;
    Map<Integer, Utente> utenti;
    public DatabaseFake(){
        this.flotta = new ArrayList<>();
        this.veicoliDisponibili = new ArrayList<>();
        this.veicoliNoleggiati = new ArrayList<>();
        this.utenti = new HashMap<>();
    }
    //Metodi relativi ai veicoli
    public void aggiungiVeicolo(Veicolo v){
        flotta.add(v);
        veicoliDisponibili.add(v);
    }

    public void aggiungiNoleggiato(Veicolo v){
        veicoliNoleggiati.add(flotta.get(flotta.indexOf(v)));
        veicoliDisponibili.remove(v);
    }

    public void aggiungiDisponibili(Veicolo v){
        veicoliDisponibili.add(veicoliNoleggiati.remove(veicoliNoleggiati.indexOf(v)));
    }

    public void aggiungiUtente(Utente utente){
        utenti.put(utente.getId(), utente);
    }

    public List<Veicolo> getListaVeicoliDisponibili(){
        return veicoliDisponibili;
    }
    //ricerca il veicolo secondo il tag di ricerca (tipo di veicolo);
    public Veicolo searchVeicolo(){
        List<Veicolo> listraFiltrata = new ArrayList<>();
        int tmp;
        Scanner sc = new Scanner(System.in);
        System.out.println("- inserisci 1 per automobile \n- inserisci 2 per furgoncini \n- inserisci 3 per scooter" +
                            "\n- inserisci 4 per monopattino \n- inserisci 5 per bicicletta");
        tmp = sc.nextInt();
        if(tmp ==1 ) {
            for (Veicolo v : veicoliDisponibili) {
                if (v instanceof Automobile) {
                    listraFiltrata.add(v);
                }
            }
        } else if (tmp == 2 ) {
            for (Veicolo v : veicoliDisponibili) {
                if (v instanceof Furgoncino) {
                    listraFiltrata.add(v);
                }
            }
        } else if (tmp == 3) {
            for (Veicolo v : veicoliDisponibili) {
                if (v instanceof Scooter) {
                    listraFiltrata.add(v);
                }
            }
        }else if (tmp == 4) {
            for (Veicolo v : veicoliDisponibili) {
                if (v instanceof Monopattino) {
                    listraFiltrata.add(v);
                }
            }
        }else if (tmp == 5) {
            for (Veicolo v : veicoliDisponibili) {
                if (v instanceof Bicicletta) {
                    listraFiltrata.add(v);
                }
            }
        } else {
            System.out.println("Input errato!");
        }
        System.out.println(listraFiltrata);
        return selezionaMezzo(listraFiltrata,sc);
        //dopo che ha visualizzato la lista dei veicoli desiderati chiama il metodo seleziona mezzo che ritorna il veicolo desiderato
    }

    public Veicolo selezionaMezzo(List<Veicolo> listaFiltrata, Scanner s){
        int index;
        System.out.println("inserisci un indice da 0 a n-1");
        index = s.nextInt();
        return listaFiltrata.get(index);
    } //implementare try catch per evitare di andare fuori indice


    public List<Utente> getUtenti() {
        return new ArrayList<>(utenti.values());
    }

    public Utente getUtente(){
        return null;
    }

    @Override
    public String toString() {
        return "DatabaseFake{" +
                "flotta=" + flotta + "\n"+
                ", veicoliNoleggiati=" + veicoliNoleggiati + "\n" +
                ", veicoliDisponibili=" + veicoliDisponibili + "\n" +
                ", utenti= " + utenti + "\n" +
                '}';
    }
}
