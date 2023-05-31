
package aula14.herançapoo;

import java.util.Scanner;

public class Aula14Herança {
    
    static final int MAX = 50; 
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int indice, op, op1, indiceachou, idade;
        String codigo, nome, trabalho, pessoa, mendigo;
        boolean achou;
        Pessoa[] ps = new Pessoa[MAX];
        Pessoa p;
        Trabalhador t;
        Mendigo m;
        indice = -1;
        do {
            System.out.println("0 - Sair.");
            System.out.println("1 - Cadastrar Pessoa.");
            System.out.println("2 - Cadastrar Pessoa (Mendigo).");
            System.out.println("3 - Cadastrar Pessoa (trabalhador).");
            System.out.println("4 - Consultar.");
            System.out.println("5 - Remover.");
            System.out.println("6 - Alterar.");
            System.out.println("7 - Mora na rua?");
            System.out.println("8 - Trabalha?");
            System.out.println("9 - Listar.");
            System.out.print("Digite uma opção: ");
            op = teclado.nextInt();

            switch (op) {
                case 0:
                    System.out.println("Até logo!");
                    break;
                case 1:
                    indice++;
                    if (indice < MAX) {
                        System.out.print("Insira o codigo da pessoa: ");
                        codigo = teclado.next();
                        System.out.print("Insira o nome: ");
                        nome = teclado.next();
                        System.out.print("Insira a idade: ");
                        idade = teclado.nextInt();
                        p = new Pessoa(codigo, nome, idade);
                        ps[indice] = p;
                        System.out.println("Pessoa cadastrada com sucesso!");                        
                    } else { 
                        System.out.println("Impossivel cadastrar. Vetor cheio!");
                    }
                    break;
                case 2:
                    indice++;
                    if (indice<MAX){
                        System.out.print("Insira o codigo da pessoa: ");
                        codigo = teclado.next();
                        System.out.print("Insira o nome: ");
                        nome = teclado.next();
                        System.out.print("Insira a idade: ");
                        idade = teclado.nextInt();
                        m = new Mendigo(codigo, nome,  idade);
                        ps[indice] = m;
                        System.out.println("Pessoa cadastrada com sucesso!"); 
                    } else {
                        System.out.println("Impossivel cadastrar. Vetor cheio!");
                    }
                    break;
                case 3:
                    indice++;
                    if(indice<MAX){
                        System.out.print("Insira o codigo da pessoa: ");
                        codigo = teclado.next();
                        System.out.print("Insira o nome: ");
                        nome = teclado.next();
                        System.out.print("Insira a idade: ");
                        idade = teclado.nextInt();
                        t = new Trabalhador(codigo, nome, idade);
                        ps[indice] = t;
                        System.out.println("Pessoa cadastrada com sucesso!");
                    } else{
                        System.out.println("Impossivel cadastrar. Vetor cheio!");
                    }
                    break;
                case 4:
                    if (indice >= 0) {
                        System.out.print("Insira o codigo da pessoa:");
                        codigo = teclado.next();
                        achou = false;
                        indiceachou = -1;
                        for (int i = 0; i <= indice; i++) {
                            if (codigo.equals(ps[i].getCodigo())) {
                                achou = true;
                                indiceachou = i;
                                break;
                            }
                        }
                        if (achou == true) {
                            System.out.println("Nome: " + ps[indiceachou].getNome());
                            System.out.println("Idade: " + ps[indiceachou].getIdade());
                        } else {
                            System.out.println("Pessoa não encontrada.");
                        }
                    } else {
                        System.out.println("vetor vazio!");
                    }
                    break;
                case 5:
                    if (indice >= 0) {
                        System.out.print("Insira o codigo da pessoa: ");
                        codigo = teclado.next();
                        achou = false;
                        indiceachou = -1;
                        for (int i = 0; i <= indice; i++) {
                            if (codigo.equals(ps[i].getCodigo())) {
                                achou = true;
                                indiceachou = i;
                                break;
                            }
                        }
                        if (achou == true) {
                            for (int i = indiceachou; i < indice; i++) {
                                ps[i] = ps[i + 1];
                            }
                            ps[indice] = null;
                            indice = indice - 1;
                            System.out.println("Operação realizada com sucesso!");
                        } else {
                            System.out.println("Pessoa não encontrada!");
                        }
                    } else {
                        System.out.println("Vetor vazio!");
                    }
                    break;
                case 6:
                    if (indice >= 0) {
                        System.out.print("Insira o codigo da pessoa: ");
                        codigo = teclado.next();
                        achou = false;
                        indiceachou = -1;
                        for (int i = 0; i <= indice; i++) {
                            if (codigo.equals(ps[i].getCodigo())) {
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
                                System.out.println("3 - Mudar situação da pessoa (trabalhador, pessoa e mendigo).");
                                System.out.print("Digite sua opcao: ");
                                op1 = teclado.nextInt();
                                switch (op1) {
                                    case 0:
                                        break;
                                    case 1:
                                        System.out.print("Altere/atualize o nome: ");
                                        nome = teclado.next();
                                        ps[indiceachou].setNome(nome);
                                        System.out.println("Operação realizada com sucesso!");
                                        break;
                                    case 2:
                                        System.out.print("Altere/atualize o idade: ");
                                        idade = teclado.nextInt();
                                        ps[indiceachou].setIdade(idade);
                                        System.out.println("Operação realizada com sucesso!");
                                        break;
                                    case 3:
                                        System.out.println("A pessoa agora está trabalhando? (Insira s para sim ou n para n)");
                                        trabalho = teclado.next();
                                        if (trabalho.equals("S")||trabalho.equals("s")) {
                                            indice++;
                                            codigo = ps[indiceachou].getCodigo();
                                            nome = ps[indiceachou].getNome();
                                            idade = ps[indiceachou].getIdade();
                                            t = new Trabalhador(codigo, nome, idade);
                                            ps[indice] = t;
                                            for (int i = indiceachou; i < indice; i++) {
                                                ps[i] = ps[i + 1];
                                            }
                                            ps[indice] = null;
                                            indice = indice - 1;
                                            System.out.println("Operação realizada com sucesso!");
                                            break;
                                        }
                                        System.out.println("A pessoa virou mendigo? (Insira s para sim ou n para n)");
                                        mendigo = teclado.next();
                                        if (mendigo.equals("S")||mendigo.equals("s")) {
                                            indice++;
                                            codigo = ps[indiceachou].getCodigo();
                                            nome = ps[indiceachou].getNome();
                                            idade = ps[indiceachou].getIdade();
                                            m = new Mendigo(codigo, nome, idade);
                                            ps[indice] = m;
                                            for (int i = indiceachou; i < indice; i++) {
                                                ps[i] = ps[i + 1];
                                            }
                                            ps[indice] = null;
                                            indice = indice - 1;
                                            System.out.println("Operação realizada com sucesso!");
                                            break;
                                        } else {
                                            indice++;
                                            codigo = ps[indiceachou].getCodigo();
                                            nome = ps[indiceachou].getNome();
                                            idade = ps[indiceachou].getIdade();
                                            p = new Pessoa(codigo, nome, idade);
                                            ps[indice] = p;
                                            for (int i = indiceachou; i < indice; i++) {
                                                ps[i] = ps[i + 1];
                                            }
                                            ps[indice] = null;
                                            indice = indice - 1;
                                            System.out.println("Operação realizada com sucesso!");
                                            break;
                                        }
                                    default:
                                        System.out.println("Opcao Invalida!");
                                }
                            } while (op1 != 0);
                        } else {
                            System.out.println("Pessoa não encontrada.");
                        }
                    } else {
                        System.out.println("Vetor vazio!");
                    }
                    break;
                case 7:
                    if (indice >= 0) {
                        System.out.print("Insira o codigo da pessoa: ");
                        codigo = teclado.next();
                        achou = false;
                        indiceachou = -1;
                        for (int i = 0; i <= indice; i++) {
                            if (codigo.equals(ps[i].getCodigo())) {
                                achou = true;
                                indiceachou = i;
                                break;
                            }
                        }
                        if (achou == true) {
                           if (ps[indiceachou] instanceof Mendigo){
                               System.out.println("");
                               System.out.println("Mendigo? "+((Mendigo)ps[indiceachou]).Verificar());
                               System.out.println("");
                           }else{
                               System.out.println("Não é mendigo!");
                           }
                        } else {
                          System.out.println("Pessoa não encontrada");
                        }
                    } else {
                      System.out.println("Vetor vazio.");
                    }
                    break;
                case 8:
                    if (indice >= 0) {
                        System.out.print("Insira o codigo da pessoa: ");
                        codigo = teclado.next();
                        achou = false;
                        indiceachou = -1;
                        for (int i = 0; i <= indice; i++) {
                            if (codigo.equals(ps[i].getCodigo())) {
                                achou = true;
                                indiceachou = i;
                                break;
                            }
                        }
                        if (achou == true) {
                           if (ps[indiceachou] instanceof Trabalhador){
                               System.out.println("");
                               System.out.println("Trabalhador? "+((Trabalhador)ps[indiceachou]).Verificar());
                               System.out.println("");
                           }else{
                               System.out.println("Não é trabalhador");
                           }
                        } else {
                          System.out.println("Pessoa não encontrada");
                        }
                    } else {
                      System.out.println("Vetor vazio.");
                    }
                    break;
                case 9:
                    if (indice >= 0) {
                        for (int i = 0; i <= indice; i++) {
                            System.out.println("");
                            System.out.println("Nome: " + ps[i].getNome());
                            System.out.println("Codigo: " + ps[i].getCodigo());
                            System.out.println("Idade: " + ps[i].getIdade());
                            System.out.println("");
                        }
                    } else {
                        System.out.println("Vetor vazio.");
                    }
                    break;
                default:
                    System.out.println("Opção invalida! Tente novamente.");
                break;
            }

        } while (op != 0);
    }

}