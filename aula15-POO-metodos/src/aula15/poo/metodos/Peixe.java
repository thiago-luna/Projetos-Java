
package aula15.poo.metodos;


public class Peixe extends Animal {
    public Peixe() {
        super();
    }

    public Peixe(int codigo, String nome) {
        super(codigo, nome);
    }

    public String nadar () {
        return "Nadando!";
    }

    @Override
    public String falar() {
	return "Bloop";
    }
}