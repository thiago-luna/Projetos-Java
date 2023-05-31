
package aula14.herançapoo;


public class Mendigo extends Pessoa {
    public Mendigo (){
        super();
    }
    
    public Mendigo(String nome, String codigo, int idade){
        super(nome, codigo, idade);
    }
    
    public String Verificar (){
        return "SIM!";
    }
}