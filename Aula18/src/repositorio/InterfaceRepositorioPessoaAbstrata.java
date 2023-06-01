package repositorio;

import dados.PessoaAbstrata;
import java.util.ArrayList;

public interface InterfaceRepositorioPessoaAbstrata {
    public void inserir(PessoaAbstrata pessoa);
    public PessoaAbstrata consultar(String nome);
    public void remover(String nome);
    public void atualizar(PessoaAbstrata pessoa);  
    public ArrayList<PessoaAbstrata> listar();
}
