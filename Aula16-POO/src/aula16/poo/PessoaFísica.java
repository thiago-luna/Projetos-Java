
package aula16.poo;


public class PessoaFísica extends Pessoa{
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
