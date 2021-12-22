public class Funcionario implements Pessoas {

    private CadPessoa cadPessoa;

    public Funcionario(){
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
