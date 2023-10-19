import java.util.ArrayList;
import java.util.List;

public class DatabaseFake {
    List<Veicolo> flotta;
    List<Veicolo> veicoliNoleggiati;
    List<Veicolo> veicoliDisponibili;
    List<Utente> utenti;

    public DatabaseFake(){
        this.flotta = new ArrayList<>();
        this.veicoliDisponibili = new ArrayList<>();
        this.veicoliNoleggiati = new ArrayList<>();
        this.utenti = new ArrayList<>();
    }

    public void aggiungi(Veicolo v){
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

    public void aggiungiUtente(Utente u){
        utenti.add(u);
    }

    public List<Veicolo> getListaVeicoliDisponibili(){
        return veicoliDisponibili;
    }

    @Override
    public String toString() {
        return "DatabaseFake{" +
                "flotta=" + flotta + "\n"+
                ", veicoliNoleggiati=" + veicoliNoleggiati + "\n" +
                ", veicoliDisponibili=" + veicoliDisponibili + "\n" +
                ", utenti=" + utenti + "\n" +
                '}';
    }
}
