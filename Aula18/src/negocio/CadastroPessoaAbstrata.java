package negocio;

import dados.PessoaAbstrata;
import java.util.ArrayList;
import repositorio.RepositorioPessoaAbstrataArrayList;

public class CadastroPessoaAbstrata implements InterfaceCadastroPessoaAbstrata {
    RepositorioPessoaAbstrataArrayList repositorio;
    
    public CadastroPessoaAbstrata(){
        this.repositorio = new RepositorioPessoaAbstrataArrayList();
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
    public ArrayList<PessoaAbstrata> listar() {
        return this.repositorio.listar();
    }
    
}
