
package aula15.poo.metodos;


public class Gato extends Animal {
    public Gato (){
      super ();
    }
    
    public Gato (int codigo, String nome){
      super (codigo, nome);
    }
    
    public String cacar (){
      return "Nhack! Rato abatido!!";
    }

    @Override
    public String falar() {
	return "Miau";
    }
}
