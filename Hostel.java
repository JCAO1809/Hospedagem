public class Hostel implements Hospedagem {

    private Hospeda hospeda;

    public Hostel(){
        this.hospeda = new Hospeda();
    }

    @Override
    public void setQuarto(int quarto) {
        this.hospeda.setQuarto(quarto);
        
    }

    @Override
    public int getQuarto() {
        
        return this.hospeda.getQuarto();
    }
    
}
