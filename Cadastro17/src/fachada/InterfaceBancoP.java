package fachada;

import negocio.*;
import repositorio.*;
import dados.PessoaAbstrata;

public interface InterfaceBancoP {
    public void inserirPessoaAbstrata(PessoaAbstrata pessoa);
    public PessoaAbstrata consultarPessoaAbstrata(String nome);
    public void removerPessoaAbstrata(String nome);
    public void atualizarPessoaAbstrata(PessoaAbstrata pessoa);
    public PessoaAbstrata[] listarPessoaAbstrata();
}
