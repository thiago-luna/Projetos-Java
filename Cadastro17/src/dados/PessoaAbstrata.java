package dados;


public class PessoaAbstrata {
    private String nome;
    private String endereço;
    private String telefone;
    
    public PessoaAbstrata (){
        this.nome = "";
        this.endereço = "";
        this.telefone = "";
    }
    
    public PessoaAbstrata (String nome, String endereço, String telefone){
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getEndereço(){
        return this.endereço;
    }
    
    public void setEndereço(String endereço){
        this.endereço = endereço;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
}

