
package aula14.herançapoo;


public class Trabalhador extends Pessoa {
    public Trabalhador (){
        super();
    }
    
    public Trabalhador(String nome,String codigo, int idade){
        super(nome, codigo, idade);
    }
    
    public String Verificar (){
        return "SIM!";
    }
}