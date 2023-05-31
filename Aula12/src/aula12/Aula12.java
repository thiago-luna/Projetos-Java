package aula12;

import java.util.Scanner;

public class Aula12 {

    static final int MAX = 5;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int indice, op, op1, indiceachou;
        String cpf;
        boolean achou;
        Funcionarios f[] = new Funcionarios[MAX];

        for (int i = 0; i < MAX; i++) {
            f[i] = new Funcionarios();
        }
        indice = -1;

        do {
            System.out.println("0 - Sair.");
            System.out.println("1 - Cadastrar funcionário.");
            System.out.println("2 - Consultar.");
            System.out.println("3 - Remover.");
            System.out.println("4 - Alterar.");
            System.out.println("5 - Listar.");
            System.out.print("Digite uma opção: ");
            op = teclado.nextInt();

            switch (op) {
                case 0:
                    System.out.println("Até logo!");
                    break;
                case 1:
                    indice++;
                    if (indice < MAX) {
                        System.out.print("Insira CPF (apenas números): ");
                        f[indice].cpf = teclado.next();
                        System.out.print("Insira o nome do Funcionário: ");
                        f[indice].nome = teclado.next();
                        System.out.print("Insira a idade: ");
                        f[indice].idade = teclado.nextInt();
                        System.out.print("Insira o salario: ");
                        f[indice].salario = teclado.nextDouble();
                        System.out.print("Insira o endereço: ");
                        f[indice].endereço = teclado.next();
                        System.out.print("Insira o telefone: ");
                        f[indice].telefone = teclado.next();
                        System.out.println("Funcionário cadastrado com sucesso!");
                    } else {
                        System.out.println("Impossivel cadastrar. Vetor cheio!");
                    }
                    break;
                case 2:
                    if (indice >= 0) {
                        System.out.print("Insira o CPF do funcionário (apenas numero):");
                        cpf = teclado.next();
                        achou = false;
                        indiceachou = -1;
                        for (int i = 0; i <= indice; i++) {
                            if (cpf.equals(f[i].cpf)) {
                                achou = true;
                                indiceachou = i;
                                break;
                            }
                        }
                        if (achou == true) {
                            System.out.println("Nome do funcionário: " + f[indiceachou].nome);
                            System.out.println("Idade " + f[indiceachou].idade);
                            System.out.println("Salario: " + f[indiceachou].salario);
                            System.out.println("Endereço: " + f[indiceachou].endereço);
                            System.out.println("Telefone: " + f[indiceachou].telefone);
                        } else {
                            System.out.println("Funcionário não encontrada.");
                        }
                    } else {
                        System.out.println("vetor vazio!");
                    }
                    break;
                case 3:
                    if (indice >= 0) {
                        System.out.print("Insira o CPF (apenas números): ");
                        cpf = teclado.next();
                        achou = false;
                        indiceachou = -1;
                        for (int i = 0; i <= indice; i++) {
                            if (cpf.equals(f[i].cpf)) {
                                achou = true;
                                indiceachou = i;
                                break;
                            }
                        }
                        if (achou == true) {
                            for (int i = indiceachou; i < indice; i++) {
                                f[i].cpf = f[i + 1].cpf;
                                f[i].nome = f[i + 1].nome;
                                f[i].idade = f[i + 1].idade;
                                f[i].endereço = f[i + 1].endereço;
                                f[i].salario = f[i + 1].salario;
                                f[i].telefone = f[i + 1].telefone;
                            }
                            indice = indice - 1;
                            System.out.println("Operação realizada com sucesso!");
                        } else {
                            System.out.println("funcionario não encontrado!");
                        }
                    } else {
                        System.out.println("Vetor vazio!");
                    }
                    break;
                case 4:
                    if (indice >= 0){
                        System.out.print("Insira CPF (apenas números): ");
                        cpf = teclado.next();
                        achou = false;
                        indiceachou = -1;
                        for (int i = 0; i <= indice; i++) {
                            if(cpf.equals(f[i].cpf)){
                                achou = true;
                                indiceachou = i;
                                break;
                            }
                        }
                        if (achou == true) {
                            do {
                                System.out.println("0 - Voltar");
                                System.out.println("1 - Nome");
                                System.out.println("2 - Idade");
                                System.out.println("3 - Salario");
                                System.out.println("4 - Endereco");
                                System.out.println("5 - Telefone");
                                System.out.print("Digite sua opcao: ");
                                op1 = teclado.nextInt();
                                switch (op1) {
                                    case 0:
                                        break;
                                    case 1:
                                        System.out.print("Altere/atualize o nome do Funcionário: ");
                                        f[indice].nome = teclado.next();
                                        System.out.println("Operação realizada com sucesso!");
                                        break;
                                    case 2:
                                        System.out.print("Altere/atualize o idade: ");
                                        f[indice].idade = teclado.nextInt();
                                        System.out.println("Operação realizada com sucesso!");
                                        break;
                                    case 3:
                                        System.out.print("Altere/atualize o salario: ");
                                        f[indice].salario = teclado.nextDouble();
                                        System.out.println("Operação realizada com sucesso!");
                                        break;
                                    case 4:
                                        System.out.print("Altere/atualize o endereço: ");
                                        f[indice].endereço = teclado.next();
                                        System.out.println("Operação realizada com sucesso!");
                                        break;
                                    case 5:
                                        System.out.print("Altere/atualize o telefone: ");
                                        f[indice].telefone = teclado.next();
                                        System.out.println("Operação realizada com sucesso!");
                                        break;
                                    default:
                                        System.out.println("Opcao Invalida!");
                                }
                            } while(op1!=0);
                        } else {
                            System.out.println("Conta não encontrada.");
                        }
                    } else {
                        System.out.println("Vetor vazio!");
                    }
                    break;
                case 5:
                    if (indice >= 0){
                        for (int i = 0; i <= indice ; i++) {
                            System.out.println("");
                            System.out.println("Nome: "+f[i].nome);
                            System.out.println("CPF: "+f[i].cpf);
                            System.out.println("Idade: "+f[i].idade);
                            System.out.println("Endereço: "+f[i].endereço);
                            System.out.println("Telefone: "+f[i].telefone);
                            System.out.println("Salario: "+f[i].salario);
                        }
                    } else {
                        System.out.println("Vetor vazio.");
                    }
                    break;
            }

        } while (op != 0);

    }

}