package gui;

import dados.PessoaAbstrata;
import dados.PessoaFísica;
import dados.PessoaJurídica;
import java.util.Scanner;
import fachada.BancoP;
import java.util.ArrayList;

public class Cadastro17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op, op1;
        String nome, endereço, telefone, cpf, cnpj;
        BancoP bancop = new BancoP();
        PessoaAbstrata pessoaabstrata;
        PessoaFísica pf;
        PessoaJurídica pj;
        do {
            System.out.println("-------------------------------------");
            System.out.println("0 - Sair.");
            System.out.println("1 - Cadastrar Pessoa Física.");
            System.out.println("2 - Cadastrar Pessoa Jurídica.");
            System.out.println("3 - Consultar.");
            System.out.println("4 - Remover.");
            System.out.println("5 - Alterar.");
            System.out.println("6 - Listar.");
            System.out.print("Digite uma opção: ");
            op = input.nextInt();
            System.out.println("-------------------------------------");

            switch (op) {
                case 0:
                    System.out.println("Até logo!");
                    break;
                case 1:
                    System.out.print("Nome: ");
                    nome = input.next();
                    System.out.print("Endereço: ");
                    endereço = input.next();
                    System.out.print("Telefone: ");
                    telefone = input.next();
                    System.out.print("CPF: ");
                    cpf = input.next();
                    pf = new PessoaFísica(nome, endereço, telefone, cpf);
                    bancop.inserirPessoaAbstrata(pf);
                    break;
                case 2:
                    System.out.print("Nome: ");
                    nome = input.next();
                    System.out.print("Endereço: ");
                    endereço = input.next();
                    System.out.print("Telefone: ");
                    telefone = input.next();
                    System.out.print("CNPJ: ");
                    cnpj = input.next();
                    pj = new PessoaJurídica(nome, endereço, telefone, cnpj);
                    bancop.inserirPessoaAbstrata(pj);
                    break;
                case 3:
                    System.out.print("Nome: ");
                    nome = input.next();
                    pessoaabstrata = bancop.consultarPessoaAbstrata(nome);
                    System.out.println("Endereço: " + pessoaabstrata.getEndereço());
                    System.out.println("Telefone: " + pessoaabstrata.getTelefone());
                    if (pessoaabstrata instanceof PessoaFísica) {
                        System.out.println("CPF: " + ((PessoaFísica) pessoaabstrata).getCpf());
                    } else {
                        if (pessoaabstrata instanceof PessoaJurídica) {
                            System.out.println("CNPJ: " + ((PessoaJurídica) pessoaabstrata).getCnpj());
                        }
                    }
                    break;
                case 4:
                    System.out.print("Nome: ");
                    nome = input.next();
                    bancop.removerPessoaAbstrata(nome);
                    break;
                case 5:
                    System.out.print("Nome: ");
                    nome = input.next();
                    pessoaabstrata = bancop.consultarPessoaAbstrata(nome);
                    do {
                        System.out.println("--------------------------------");
                        System.out.println("0 - Sair.");
                        System.out.println("1 -  Atualizar nome.");
                        System.out.println("2 - Atualizar endereço.");
                        System.out.println("3 - Atualizar telefone.");
                        System.out.print("Digite sua opção: ");
                        op1 = input.nextInt();
                        System.out.println("--------------------------------");
                        switch (op1) {
                            case 0:
                                System.out.println("Até logo!");
                                break;
                            case 1:
                                System.out.print("Novo nome: ");
                                nome = input.next();
                                pessoaabstrata.setNome(nome);
                                bancop.atualizarPessoaAbstrata(pessoaabstrata);
                                break;
                            case 2:
                                System.out.print("Novo endereço: ");
                                endereço = input.next();
                                pessoaabstrata.setEndereço(endereço);
                                bancop.atualizarPessoaAbstrata(pessoaabstrata);
                                break;
                            case 3:
                                System.out.print("Novo telefone: ");
                                telefone = input.next();
                                pessoaabstrata.setTelefone(telefone);
                                bancop.atualizarPessoaAbstrata(pessoaabstrata);
                                break;
                            default:
                                System.out.println("Opcao invalida. Tente novamente...");
                        }
                    } while (op1 != 0);
                    break;
                case 6:
                    ArrayList<PessoaAbstrata> pas = bancop.listarPessoaAbstrata();
                    for (PessoaAbstrata pessoaAbstrata : pas) {
                        System.out.println("");
                        if (pessoaAbstrata instanceof PessoaFísica) {
                            System.out.println("Pessoa Física");
                        } else {
                            if (pessoaAbstrata instanceof PessoaJurídica) {
                                System.out.println("Pessoa Jurídica");
                            }
                        }
                        System.out.println("Nome: " + pessoaAbstrata.getNome());
                        System.out.println("Endereço: " + pessoaAbstrata.getEndereço());
                        System.out.println("Telefone: " + pessoaAbstrata.getTelefone());
                        if (pessoaAbstrata instanceof PessoaFísica) {
                            System.out.println("CPF: " + ((PessoaFísica) pessoaAbstrata).getCpf());
                        } else {
                            if (pessoaAbstrata instanceof PessoaJurídica) {
                                System.out.println("CNPJ: " + ((PessoaJurídica) pessoaAbstrata).getCnpj());
                            }
                        }
                        System.out.println("");
                    }
                    break;
                default:
                    System.out.println("");
                    System.out.println("Opcao invalida! Tente novamente...");
                    System.out.println("");
            }
        } while (op != 0);
    }
}
