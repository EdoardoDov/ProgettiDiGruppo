import java.util.Random;

public class Veicolo {
    private int id;
    private String posizione;
    private boolean affittato;
    private static int count =0;
    private double tariffa;
    private boolean servePatente ;

    public Veicolo(){
        this.id = count;
        count++;
        this.affittato = false;
    }


    public int getId() {
        return id;
    }

    public String getPosizione() {
        return posizione;
    }

    public void setPosizione(String posizione) {
        this.posizione = posizione;
    }

    public double getTariffa(){
    return tariffa;
    }

    public void setTariffa(double tar){
    this.tariffa = tar;
    }

    public boolean isAffittato() {
        return affittato;
    }

    public void setAffittato(boolean affittato) {
        this.affittato = affittato;
    }

    //il veicolo è stato noleggiato da un utente
    public void affitoVeicolo() {
        affittato = true;
    }

    //il veicolo è stato restituito ed è ora disponibile per il noleggio
    public void returnVeicolo() {
        affittato = false;
    }



    @Override
    public String toString() {
        return "Veicolo{" +
                "id=" + id +
                ", posizione='" + posizione + '\'' +
                ", affittato=" + affittato +
                ", tariffa=" + tariffa +
                '}';
    }
}

