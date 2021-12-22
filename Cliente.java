public class Cliente implements Pessoas {

    private CadPessoa cadPessoa;

    public Cliente(){
        this.cadPessoa = new CadPessoa();
    }
    
    @Override
    public void setNome(String nome) {
    cadPessoa.setNome(nome);
    }

    @Override
    public String getNome() {
        return cadPessoa.getNome();
    }
            
    
}
