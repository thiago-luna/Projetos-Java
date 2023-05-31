
package aula15.poo.metodos;


public class Animal {
    private int codigo;
    private String nome;
    
    public Animal (){
      this.codigo = 0;
      this.nome = "";
    }
    
    public Animal (int codigo, String nome){
      this.codigo = codigo;
      this.nome = nome;
    }
    
    public int getCodigo (){
      return this.codigo;
    }
    
    public void setCodigo (int codigo){
      this.codigo=codigo;
    }
    
    public String getNome (){
      return this.nome;
    }
    
    public void setNome (String nome){
      this.nome = nome;
    }
    
    public String falar() {
	return "Animal falando";
    }

}
