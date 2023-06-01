
package negocio;

import repositorio.*;
import dados.PessoaAbstrata;

public interface InterfaceCadastroPessoaAbstrata {
    public void inserir(PessoaAbstrata pessoa);
    public PessoaAbstrata consultar(String nome);
    public PessoaAbstrata[] listar();
    public void remover (String nome);
    public void atualizar(PessoaAbstrata pessoa);
}
