public class Pousada implements Hospedagem {

    private Hospeda hospeda;

    public Pousada(){
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
