package negocio;

import dados.PessoaAbstrata;
import dados.PessoaFísica;
import dados.PessoaJurídica;
import repositorio.RepositorioPessoaAbstrataArray;

public class CadastroPessoaAbstrata implements InterfaceCadastroPessoaAbstrata {
    RepositorioPessoaAbstrataArray repositorio;
    
    public CadastroPessoaAbstrata(int MAX){
        this.repositorio = new RepositorioPessoaAbstrataArray(MAX);
    }

    @Override
    public void inserir(PessoaAbstrata pessoa) {
        this.repositorio.inserir(pessoa);
    }

    @Override
    public PessoaAbstrata consultar(String nome) {
        return this.repositorio.consultar(nome);
    }

    @Override
    public void remover(String nome) {
        this.repositorio.remover(nome);
    }

    @Override
    public void atualizar(PessoaAbstrata pessoa){
        this.repositorio.atualizar(pessoa);
    }
    
    @Override
    public PessoaAbstrata[] listar() {
        return this.repositorio.listar();
    }
    
}
