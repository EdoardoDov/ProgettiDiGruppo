
public class Bicicletta extends Veicolo{

    private boolean casco;
    
    public Bicicletta(){
    super();
    }

    public boolean isCasco() {
        return casco;
    }


    public void setCasco(boolean casco) {
        this.casco = casco;
    }

    @Override
    public String toString() {
        return super.toString() + "Bicicletta{" + "casco=" + casco + '}';
    }
}
