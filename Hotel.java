public class Hotel implements Hospedagem {

    private Hospeda hospedador;

    public Hotel(){
        this.hospedador = new Hospeda();
    }

    @Override
    public void setQuarto(int quarto) {
        this.hospedador.setQuarto(quarto);
        
    }

    @Override
    public int getQuarto() {
        return this.hospedador.getQuarto();
    }
    
}
