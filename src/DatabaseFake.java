import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public void aggiungiUtente(Utente utente){
        utenti.put(utente.getId(), utente);
    }

    public List<Veicolo> getListaVeicoliDisponibili(){
        return veicoliDisponibili;
    }

    public List<Utente> getUtenti() {

        return null;
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
                ", utenti= "+"\n" + utenti + "\n" +
                '}';
    }
}
