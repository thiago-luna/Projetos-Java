package aula16.poo;

public abstract class  Pessoa {

    private String nome;
    private String endereço;
    private String telefone;

    public Pessoa() {
        this.nome = "";
        this.endereço = "";
        this.telefone = "";
    }

    public Pessoa(String nome, String endereço, String telefone) {
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return this.endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
