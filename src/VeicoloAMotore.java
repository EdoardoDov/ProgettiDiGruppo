public class VeicoloAMotore{

    private String  targa;
    private int livelloCarburante;

    public VeicoloAMotore() {
        this.targa = "GR" + (int) (Math.random() * 10) +
                (int) (Math.random() * 10) + (int) (Math.random() * 10)
                + (int) (Math.random() * 10) + "ZZ";
        this.livelloCarburante = 100;
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
            if (litriCarburante + litriCarburante > 100){
                livelloCarburante = 100;
                System.out.println("hai fatto il pieno!");
            } else {
                livelloCarburante += litriCarburante;
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
        return "VeicoloAMotore{" +
                "targa='" + targa + '\'' +
                ", livelloCarburante=" + livelloCarburante +
                '}';
    }
}
