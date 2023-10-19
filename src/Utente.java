
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.UUID;

public class Utente {

    private UUID id;
    private String nome, cognome,codfisc ;
    private int credito;

    private String dataDiNascita;
    private boolean patente, casco;

    public Utente(String N, String C, String CF, String DN, boolean P, boolean Cas){
        this.nome = N;
        this.cognome = C;
        this.codfisc = CF;
        this.dataDiNascita = DN;
        this.patente = P;
        this.casco = Cas;
        this.id = UUID.randomUUID();
        this.credito = 0;
    }

    public Utente(){
        this.id = UUID.randomUUID();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodfisc() {
        return codfisc;
    }

    public void setCodfisc(String codfisc) {
        this.codfisc = codfisc;
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(String bithday) {

        this.dataDiNascita =  bithday;
    }

    public boolean isPatente() {
        return patente;
    }

    public void setPatente(boolean patente) {

        this.patente = patente;
    }

    public boolean isCasco() {
        return casco;
    }

    public void setCasco(boolean casco) {
        this.casco = casco;
    }

    public UUID getId() {
        return id;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }

    @Override
    public String toString(){

       return "Nome:" + getNome() + "\n" + "Cognome: "+ getCognome() + "\n" +
                "Codice Fiscale: "+getCodfisc() + "\n" +"Data di nascita: "+ getDataDiNascita() +
                "\n" + "Identificativo utente: "+getId();

    }
}

