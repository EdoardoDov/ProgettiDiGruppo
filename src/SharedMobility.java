
import java.util.Scanner;

public class SharedMobility {

    public Scanner scanner = new Scanner(System.in);
    /*public void menu(){

        System.out.println("--------------");
        System.out.println("Benvenuto");
        System.out.println("--------------");
        System.out.println("Premi: \n1.Per registrarti\n2.Per visionare i veicoli\n3.Per Affittare un veicolo\n4.Per restituire un veicolo\n5.Per chiudere la schermata");
        int n = scanner.nextInt();
        boolean flag = false;

        while(!flag){
            switch (n){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    flag = true;
                    break;
            }
        }


    }*/ // NON USARE

    DatabaseFake d = new DatabaseFake();
    public static void main(String[] args) {
        SharedMobility s = new SharedMobility();
        s.registraUtente();

    }

    public void registraUtente(){

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
        }

    public void aggiungiCredito(){
        double credito;
        System.out.println("Inserisci l'importo da aggiungere: ");
        credito = scanner.nextDouble();



    }




    }










