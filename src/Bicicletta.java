
public class Bicicletta extends Veicolo{

    private boolean casco;
    
    public Bicicletta(){
        super();
        super.setTariffa(0.5);
    }

    public boolean isCasco() {
        return casco;
    }


    public void setCasco(boolean casco) {
        this.casco = casco;
    }

    @Override
    public String toString() {
        return  "Bicicletta{" + "casco=" + casco + '}';
    }
}
