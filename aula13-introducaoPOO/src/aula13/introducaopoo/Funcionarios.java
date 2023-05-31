
package aula13.introducaopoo;


public class Funcionarios {
    public String nome;
    public String cpf;
    public int idade;
    public double salario;
    public String endereço;
    public String telefone;
    
    public Funcionarios (){
        this.nome = "";
        this.cpf = "";
        this.idade = 0;
        this.salario = 0;
        this.endereço = "";
        this.telefone = "";
    }
    
    public Funcionarios (String nome,String cpf, int idade, double salario, String endereço, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.salario = salario;
        this.endereço = endereço;
        this.telefone = telefone;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome (String nome){
        this.nome = nome;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade (int idade){
        this.idade = idade;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public String getEndereço(){
        return this.endereço;
    }
    
    public void setEndereço(String endereço){
        this.cpf = endereço;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    public void setTelefone(String telefone){
        this.cpf = telefone;
    }
}
   
