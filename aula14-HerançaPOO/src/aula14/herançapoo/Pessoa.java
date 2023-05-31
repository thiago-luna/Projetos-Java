
package aula14.herançapoo;


public class Pessoa {
    private String codigo;
    private String nome;
    private int idade;
    
    public Pessoa (){
        this.codigo = "";
        this.nome = "";
        this.idade = 0;
    }
    
    public Pessoa (String codigo, String nome, int idade){
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome (){
        return this.nome;
    }
    
    public void setNome (String nome){
        this.nome = nome;
    }
    
    public String getCodigo (){
        return this.codigo;
    }
    
    public void setCodigo (String codigo){
        this.codigo = codigo;
    }
    
    public int getIdade (){
        return this.idade;
    }
    
    public void setIdade (int idade){
        this.idade = idade;
    }
}
