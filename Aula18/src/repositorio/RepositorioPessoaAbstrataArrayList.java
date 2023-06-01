package repositorio;

import dados.PessoaAbstrata;
import java.util.ArrayList;

public class RepositorioPessoaAbstrataArrayList implements InterfaceRepositorioPessoaAbstrata {

    private ArrayList<PessoaAbstrata> pessoas;

    public RepositorioPessoaAbstrataArrayList() {
        this.pessoas = new ArrayList();
    }

    @Override
    public void inserir(PessoaAbstrata pessoa) {
        pessoas.add(pessoa);
        System.out.println("Operacao realizada com sucesso!");
    }

    @Override
    public PessoaAbstrata consultar(String nome) {
        PessoaAbstrata pa = null;
        if (this.pessoas.size() > 0) {
            boolean achou = false;
            int indiceachou = -1;
            for (int i = 0; i <= this.pessoas.size(); i++) {
                if (nome.equals(this.pessoas.get(i).getNome())) {
                    achou = true;
                    indiceachou = i;
                    break;
                }
            }
            if (achou == true) {
                pa = pessoas.get(indiceachou);
            } else {
                System.out.println("pessoa nao encontrada.");
            }
        } else {
            System.out.println("vetor vazio.");
        }
        return pa;
    }

    @Override
    public void remover(String nome) {
        if (this.pessoas.size() > 0) {
            boolean achou = false;
            int indiceachou = -1;
            for (int i = 0; i <= this.pessoas.size(); i++) {
                if (nome.equals(this.pessoas.get(i).getNome())) {
                    achou = true;
                    indiceachou = i;
                    break;
                }
            }
            if (achou == true) {
                this.pessoas.remove(this.pessoas.get(indiceachou));
                System.out.println("operacao realizada com sucesso.");
            } else {
                System.out.println("conta nao encontrada.");
            }
        } else {
            System.out.println("vetor vazio.");
        }
    }

    @Override
    public void atualizar(PessoaAbstrata pessoa) {
        PessoaAbstrata pa = this.consultar(pessoa.getNome());
        pessoa = pa;
        System.out.println("operacao realizada com sucesso.");
    }

    @Override
    public ArrayList<PessoaAbstrata> listar() {
        if (this.pessoas.size() > 0) {
            return this.pessoas;
        } else {
            System.out.println("vetor vazio.");
            return null;
        }
    }
}
