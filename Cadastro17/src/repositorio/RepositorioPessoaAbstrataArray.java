package repositorio;

import dados.PessoaAbstrata;
import dados.PessoaFísica;
import dados.PessoaJurídica;

public class RepositorioPessoaAbstrataArray implements InterfaceRepositorioPessoaAbstrata {

    private PessoaAbstrata[] pessoas;
    private int indice;

    public RepositorioPessoaAbstrataArray(int MAX) {
        this.pessoas = new PessoaAbstrata[MAX];
        this.indice = -1;
    }

    @Override
    public void inserir(PessoaAbstrata pessoa) {
        this.indice = this.indice + 1;
        if (this.indice < this.pessoas.length) {
            this.pessoas[indice] = pessoa;
            System.out.println("operacao realizada com sucesso.");
        } else {
            System.out.println("vetor cheio.");
        }
    }

    @Override
    public PessoaAbstrata consultar(String nome) {
        PessoaAbstrata pa = null;
        if (this.indice >= 0) {
            boolean achou = false;
            int indiceachou = -1;
            for (int i = 0; i <= this.indice; i++) {
                if (nome.equals(this.pessoas[i].getNome())) {
                    achou = true;
                    indiceachou = i;
                    break;
                }
            }
            if (achou == true) {
                pa = pessoas[indiceachou];
            } else {
                System.out.println("conta nao encontrada.");
            }
        } else {
            System.out.println("vetor vazio.");
        }
        return pa;
    }

    @Override
    public void remover(String nome) {
        if (this.indice >= 0) {
            boolean achou = false;
            int indiceachou = -1;
            for (int i = 0; i <= this.indice; i++) {
                if (nome.equals(this.pessoas[i].getNome())) {
                    achou = true;
                    indiceachou = i;
                    break;
                }
            }
            if (achou == true) {
                for (int i = indiceachou; i < this.indice; i++) {
                    this.pessoas[i] = this.pessoas[i + 1];
                }
                this.pessoas[this.indice] = null;
                this.indice = this.indice - 1;
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
    public PessoaAbstrata[] listar() {
        PessoaAbstrata[] pas = null;
        if (this.indice >= 0) {
            pas = new PessoaAbstrata[this.indice + 1];
            for (int i = 0; i <= this.indice; i++) {
                pas[i] = this.pessoas[i];
            }
        } else {
            System.out.println("vetor vazio.");
        }
        return pas;
    }
}
