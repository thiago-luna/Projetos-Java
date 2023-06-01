
package aula16.poo;


public class PessoaJurídica extends Pessoa {
    private String cnpj;
    
    public  PessoaJurídica (){
        super();
        this.cnpj = "";
    }
    
    public PessoaJurídica(String nome, String endereço, String telefone, String cnpj){
        super(nome, endereço, telefone);
        this.cnpj = cnpj;
    }
    
    public String getCnpj(){
        return this.cnpj;
    }
    
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
}
