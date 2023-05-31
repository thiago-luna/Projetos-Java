package aula13.introducaopoo;

import java.util.Scanner;

public class Aula13IntroducaoPOO {

    static final int MAX = 50;
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int indice, op, op1, indiceachou, idade;
        String cpf, nome, telefone,endereço;
        double salario;
        boolean achou;
        Funcionarios [] f = new Funcionarios[MAX];
        Funcionarios funcionarios;
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
                        cpf = teclado.next();
                        System.out.print("Insira o nome do Funcionário: ");
                        nome = teclado.next();
                        System.out.print("Insira a idade: ");
                        idade = teclado.nextInt();
                        System.out.print("Insira o salario: ");
                        salario = teclado.nextDouble();
                        System.out.print("Insira o endereço: ");
                        endereço = teclado.next();
                        System.out.print("Insira o telefone: ");
                        telefone = teclado.next();
                        funcionarios = new Funcionarios(nome,cpf, idade,salario,endereço,telefone);
                        f[indice] = funcionarios;
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
                            if (cpf.equals(f[i].getCpf())) {
                                achou = true;
                                indiceachou = i;
                                break;
                            }
                        }
                        if (achou == true) {
                            System.out.println("Nome do funcionário: " + f[indiceachou].getNome());
                            System.out.println("Idade " + f[indiceachou].getIdade());
                            System.out.println("Salario: " + f[indiceachou].getSalario());
                            System.out.println("Endereço: " + f[indiceachou].getEndereço());
                            System.out.println("Telefone: " + f[indiceachou].getTelefone());
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
                            if (cpf.equals(f[i].getCpf())) {
                                achou = true;
                                indiceachou = i;
                                break;
                            }
                        }
                        if (achou == true) {
                            for (int i = indiceachou; i < indice; i++) {
                                f[i]=f[i+1];
                            }
                            f[indice] = null;
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
                                	nome = teclado.next();
                                        f[indiceachou].setNome(nome);
                                        System.out.println("Operação realizada com sucesso!");
                                        break;
                                    case 2:
                                        System.out.print("Altere/atualize o idade: ");
                                        idade = teclado.nextInt();
                                        f[indiceachou].setIdade(idade);
                                        System.out.println("Operação realizada com sucesso!");
                                        break;
                                    case 3:
                                        System.out.print("Altere/atualize o salario: ");
                                        salario = teclado.nextDouble();
                                        f[indiceachou].setSalario(salario);
                                        System.out.println("Operação realizada com sucesso!");
                                        break;
                                    case 4:
                                        System.out.print("Altere/atualize o endereço: ");
                                        endereço = teclado.next();
                                        f[indiceachou].setEndereço(endereço);
                                        System.out.println("Operação realizada com sucesso!");
                                        break;
                                    case 5:
                                        System.out.print("Altere/atualize o telefone: ");
                                        telefone = teclado.next();
                                        f[indice].setTelefone(telefone);
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
                            System.out.println("Nome: "+f[i].getNome());
                            System.out.println("CPF: "+f[i].getCpf());
                            System.out.println("Idade: "+f[i].getIdade());
                            System.out.println("Endereço: "+f[i].getEndereço());
                            System.out.println("Telefone: "+f[i].getTelefone());
                            System.out.println("Salario: "+f[i].getSalario());
                        }
                    } else {
                        System.out.println("Vetor vazio.");
                    }
                    break;
            }

        } while (op != 0);

    }

}
