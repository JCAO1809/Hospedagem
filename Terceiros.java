public class Terceiros implements Pessoas {
    
    private CadPessoa cadPessoa;

    public Terceiros(){
        this.cadPessoa = new CadPessoa();
    }

    @Override
    public void setNome(String nome) {
        this.cadPessoa.setNome(nome);
        
    }

    @Override
    public String getNome() {
        return this.cadPessoa.getNome();
    }
}
