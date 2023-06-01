package fachada;

import dados.PessoaAbstrata;
import negocio.CadastroPessoaAbstrata;

import dados.PessoaAbstrata;


public class BancoP implements InterfaceBancoP{
    
    private CadastroPessoaAbstrata cadastroPessoaAbstrata;

    public BancoP(int MAX) {
        this.cadastroPessoaAbstrata = new CadastroPessoaAbstrata(MAX);
    }

    @Override
    public void inserirPessoaAbstrata(PessoaAbstrata pessoa) {
        this.cadastroPessoaAbstrata.inserir(pessoa);
    }

    @Override
    public PessoaAbstrata consultarPessoaAbstrata(String nome) {
        return this.cadastroPessoaAbstrata.consultar(nome);
    }

    @Override
    public void removerPessoaAbstrata(String nome) {
        this.cadastroPessoaAbstrata.remover(nome);
    }

    @Override
    public void atualizarPessoaAbstrata(PessoaAbstrata pessoa) {
        this.cadastroPessoaAbstrata.atualizar(pessoa);
    }

    @Override
    public PessoaAbstrata[] listarPessoaAbstrata() {
        return this.cadastroPessoaAbstrata.listar();
    }
    
}
