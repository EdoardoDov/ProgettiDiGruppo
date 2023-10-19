public class Monopattino extends Veicolo {
    private int livelloBatteria;

    public Monopattino(){
        super();
        this.livelloBatteria = 100;
    }

    public void setLivelloBatteria(int livelloBatteria) {
        this.livelloBatteria = livelloBatteria;
    }

    public int getLivelloBatteria() {
        return livelloBatteria;
    }

    public void ricarica(int percentualeCarica){
        if(livelloBatteria >= 100){
            System.out.println("Batteria Carica!");
        } else {
            if (livelloBatteria + percentualeCarica > 100){
                this.livelloBatteria = 100;
                System.out.println("Batteria ricaricata");
            } else {
                this.livelloBatteria += percentualeCarica;
            }
        }
    }

    public void scarica(int consumoCarica){
        if(livelloBatteria - consumoCarica < 0){
            System.out.println("Batteria scarica.. ricaricare veicolo!");
        } else {
            livelloBatteria -= consumoCarica;
        }
    }

    @Override
    public String toString() {
        return "Monopattino{" +
                "livelloBatteria=" + livelloBatteria +
                '}';
    }
}
