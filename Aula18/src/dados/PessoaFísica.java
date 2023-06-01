package dados;


public class PessoaFísica extends PessoaAbstrata{
    private String cpf;
    
    public PessoaFísica(){
        super();
        this.cpf = "";
    }
    
    public PessoaFísica(String nome, String endereço, String telefone, String cpf){
        super(nome, endereço, telefone);
        this.cpf = cpf;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
}

