package CompagniaSharedMobility;

public class Scooter extends Veicolo {

    private final String targa;
    private int livelloCarburante;

    public Scooter(){
        super();
        this.targa = generaTarga();
        this.livelloCarburante = 100;
    }

    public  String generaTarga(){
        return "GR" + (int) (Math.random() * 10) + (int) (Math.random() * 10) + (int) (Math.random() * 10) + "ZZ";
    }

    public String getTarga() {
        return targa;
    }

    public int getLivelloCarburante() {
        return livelloCarburante;
    }

    public void setLivelloCarburante(int livelloCarburante) {
        this.livelloCarburante = livelloCarburante;
    }
    public void rifornimento(int litriCarburante){
        if(livelloCarburante >= 100){
            System.out.println("serbatoio pieno!");
        } else {
            if (livelloCarburante + litriCarburante > 100){
                this.livelloCarburante = 100;
                System.out.println("hai fatto il pieno!");
            } else {
                this.livelloCarburante += litriCarburante;
            }
        }
    }
    public void consuma(int consumoLitri){
        if(livelloCarburante - consumoLitri < 0){
            System.out.println("carburante esaurito... fai rifornimento");
        } else {
            livelloCarburante -= consumoLitri;
        }
    }

    @Override
    public String toString() {
        return "Scooter{" +
                "targa='" + targa + '\'' +
                ", livelloCarburante=" + livelloCarburante +
                '}';
    }


}
