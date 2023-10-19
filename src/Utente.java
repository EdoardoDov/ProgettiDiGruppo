
package CompagniaSharedMobility;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.UUID;

public class Utente {

    private int id;
    static int count = 0;
    
    private String nome, cognome,codfisc ;

    private String dataDiNascita;
    private boolean casco;

    private double credito;
    private char patente;

    public Utente(String N, String C, String CF, String DN, boolean Cas, char patente){
        this.nome = N;
        this.cognome = C;
        this.codfisc = CF;
        this.dataDiNascita = DN;
        this.patente = patente;
        this.casco = Cas;
        this.id = count;    
        count++;
        this.credito = 0;
    }

    public Utente(){
        this.id = count;
        count++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public char getPatente() {
        return patente;
    }

    public void setPatente(char patente) {
        this.patente = patente;
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

    public boolean isCasco() {
        return casco;
    }

    public void setCasco(boolean casco) {
        this.casco = casco;
    }

    public int getId() {
        return id;
    }
    /*public static void main(String[] args) {
        Utente utente1 = new Utente();
        utente1.setNome("Marco");
        utente1.setCognome("Marco");
        utente1.setCodfisc("BCCFGH11");
        utente1.setCasco(false);
        utente1.setPatente(true);
        utente1.setDataDiNascita("10-10-2001");
        System.out.println(utente1.toString());

        Utente utente2 = new Utente("Marco", "bucceri", "BCCC","10-11-2001",true, true);
        System.out.println(utente2.toString());
    } */ //era solo un test

    @Override
    public String toString(){

        return "Nome:" + getNome() + "\n" + "Cognome: "+ getCognome() + "\n" +
                "Codice Fiscale: "+getCodfisc() + "\n" +"Data di nascita: "+ getDataDiNascita() +
                "\n" + "Identificativo utente: "+getId();

    }
}


