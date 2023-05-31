
package aula15.poo.metodos;


public class Cao extends Animal {
    public Cao (){
      super ();
    }
    
    public Cao (int codigo, String nome){
      super (codigo, nome);
    }
    
    public String cacar(){
      return "Nhack! Gato abatido!";
    }

    @Override
    public String falar() {
	return "Au Au";
    }
}
