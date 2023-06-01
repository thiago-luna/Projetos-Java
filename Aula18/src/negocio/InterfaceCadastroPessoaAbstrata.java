
package negocio;

import dados.PessoaAbstrata;
import java.util.ArrayList;

public interface InterfaceCadastroPessoaAbstrata {
    public void inserir(PessoaAbstrata pessoa);
    public PessoaAbstrata consultar(String nome);
    public ArrayList<PessoaAbstrata> listar();
    public void remover (String nome);
    public void atualizar(PessoaAbstrata pessoa);
}
