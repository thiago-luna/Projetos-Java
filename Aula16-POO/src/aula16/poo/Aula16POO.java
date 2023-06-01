package aula16.poo;

import java.util.Scanner;

public class Aula16POO {

    static final int MAX = 10;
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int indice, op, op1, indiceachou;
        String nome, endereço, telefone, cpf, cnpj;
        boolean achou;
        Pessoa[] pessoas = new Pessoa[MAX];
        PessoaFísica pf;
        PessoaJurídica pj;
        indice = -1;
        do {
            System.out.println("0 - Sair.");
            System.out.println("1 - Cadastrar Pessoa Física.");
            System.out.println("2 - Cadastrar Pessoa Jurídica.");
            System.out.println("3 - Consultar.");
            System.out.println("4 - Remover.");
            System.out.println("5 - Alterar.");
            System.out.println("6 - Listar.");
            System.out.print("Digite uma opção: ");
            op = teclado.nextInt();

            switch (op) {
                case 0:
                    System.out.println("Até logo!");
                    break;
                case 1:
                    indice++;
                    if (indice < MAX) {
                        System.out.print("Nome: ");
                        nome = teclado.next();
                        System.out.print("Endereço: ");
                        endereço = teclado.next();
                        System.out.print("Telefone: ");
                        telefone = teclado.next();
                        System.out.print("CPF: ");
                        cpf = teclado.next();
                        pf = new PessoaFísica(nome, endereço, telefone, cpf);
                        pessoas[indice] = pf;
                        System.out.println("Operacao realizada com sucesso!");
                    } else {
                        System.out.println("Vetor cheio!");
                    }
                    break;
                case 2:
                    indice++;
                    if (indice < MAX) {
                        System.out.print("Nome: ");
                        nome = teclado.next();
                        System.out.print("Endereço: ");
                        endereço = teclado.next();
                        System.out.print("Telefone: ");
                        telefone = teclado.next();
                        System.out.print("CNPJ: ");
                        cnpj = teclado.next();
                        pj = new PessoaJurídica(nome, endereço, telefone, cnpj);
                        pessoas[indice] = pj;
                        System.out.println("Operacao realizada com sucesso!!");
                    } else {
                        System.out.println("Vetor cheio!");
                    }
                    break;
                case 3:
                    if (indice >= 0) {
                        System.out.println("");
                        System.out.print("Nome: ");
                        nome = teclado.next();
                        achou = false;
                        indiceachou = -1;
                        for (int i = 0; i <= indice; i++) {
                            if (nome.equals(pessoas[i].getNome())) {
                                achou = true;
                                indiceachou = i;
                                break;
                            }
                        }
                        if (achou == true) {
                            System.out.println("Endereço: " + pessoas[indiceachou].getEndereço());
                            System.out.println("Endereço: " + pessoas[indiceachou].getTelefone());
                            if (pessoas[indiceachou] instanceof PessoaFísica & !(pessoas[indiceachou] instanceof PessoaJurídica)) {
                                System.out.println("CPF: " + ((PessoaFísica) pessoas[indiceachou]).getCpf());
                                System.out.println("Pessoa Física");
                            } else {
                                if (pessoas[indiceachou] instanceof PessoaJurídica) {
                                    System.out.println("CNPJ: " + ((PessoaJurídica) pessoas[indiceachou]).getCnpj());
                                    System.out.println("Pessoa Jurídica");
                                }
                            }

                        } else {
                            System.out.println("Pessoa não encontrada.");
                        }
                    } else {
                        System.out.println("vetor vazio!");
                    }
                    break;
                case 4:
                    if (indice >= 0) {
                        System.out.print("Nome: ");
                        nome = teclado.next();
                        achou = false;
                        indiceachou = -1;
                        for (int i = 0; i <= indice; i++) {
                            if (nome.equals(pessoas[i].getNome())) {
                                achou = true;
                                indiceachou = i;
                                break;
                            }
                        }
                        if (achou == true) {
                            for (int i = indiceachou; i < indice; i++) {
                                pessoas[i] = pessoas[i + 1];
                            }
                            pessoas[indice] = null;
                            indice = indice - 1;
                            System.out.println("Operação realizada com sucesso!");
                        } else {
                            System.out.println("Pessoa não encontrada!");
                        }
                    } else {
                        System.out.println("Vetor vazio!");
                    }
                    break;
                case 5:
                    if (indice >= 0) {
                        System.out.print("Nome: ");
                        nome = teclado.next();
                        achou = false;
                        indiceachou = -1;
                        for (int i = 0; i <= indice; i++) {
                            if (nome.equals(pessoas[i].getNome())) {
                                achou = true;
                                indiceachou = i;
                                break;
                            }
                        }
                        if (achou == true) {
                            do {
                                System.out.println("0 - Sair");
                                System.out.println("1 - Alterar nome.");
                                System.out.println("2 - Alterar endereço.");
                                System.out.println("3 - Alterar telefone.");
                                System.out.print("Digite sua opção: ");
                                op1 = teclado.nextInt();

                                switch (op1) {
                                    case 0:
                                        System.out.println("Até logo!");
                                        break;
                                    case 1:
                                        System.out.print("Nome: ");
                                        nome = teclado.next();
                                        pessoas[indiceachou].setNome(nome);
                                        System.out.println("Operação realizada com sucesso!");
                                        break;
                                    case 2:
                                        System.out.print("Endereço: ");
                                        endereço = teclado.next();
                                        pessoas[indiceachou].setEndereço(endereço);
                                        System.out.println("Operação realizada com sucesso!");
                                        break;
                                    case 3:
                                        System.out.print("Telefone: ");
                                        telefone = teclado.next();
                                        pessoas[indiceachou].setTelefone(telefone);
                                        System.out.println("Operação realizada com sucesso!");
                                        break;
                                    default:
                                        System.out.println("Opção inválida! Tente novamente...");
                                }
                            } while (op1 != 0);
                        } else {
                            System.out.println("Pessoa não encontrada.");
                        }
                    } else {
                        System.out.println("Vetor vazio!");
                    }
                    break;
                case 6:
                    if (indice >= 0) {
                        for (int i = 0; i <= indice; i++) {
                            System.out.println("");
                            if (pessoas[i] instanceof PessoaFísica & !(pessoas[i] instanceof PessoaJurídica)) {
                                System.out.println("Pessoa Física " + i);
                            } else {
                                if (pessoas[i] instanceof PessoaJurídica) {
                                    System.out.println("Pessoa Jurídica " + i);
                                }
                            }
                            System.out.println("Nome: " + pessoas[i].getNome());
                            System.out.println("Endereço: " + pessoas[i].getEndereço());
                            System.out.println("Telefone: " + pessoas[i].getTelefone());
                            if (pessoas[i] instanceof PessoaFísica & !(pessoas[i] instanceof PessoaJurídica)) {
                                System.out.println("CPF: " + ((PessoaFísica) pessoas[i]).getCpf());
                            } else {
                                System.out.println("CNPJ: "+((PessoaJurídica)pessoas[i]).getCnpj());
                            }
                            System.out.println("");
                        }
                    } else {
                        System.out.println("Vetor vazio.");
                    }
                    break;
                default:
                    System.out.println("");
                    System.out.println("Opcao invalida!");
                    System.out.println("");
            }

        } while (op != 0);
    }

}