package fachada;

import dados.PessoaAbstrata;
import java.util.ArrayList;

public interface InterfaceBancoP {
    public void inserirPessoaAbstrata(PessoaAbstrata pessoa);
    public PessoaAbstrata consultarPessoaAbstrata(String nome);
    public void removerPessoaAbstrata(String nome);
    public void atualizarPessoaAbstrata(PessoaAbstrata pessoa);
    public ArrayList<PessoaAbstrata> listarPessoaAbstrata();
}
