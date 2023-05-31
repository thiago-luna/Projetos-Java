package aula15.poo.metodos;

import java.util.Scanner;

public class Aula15POOMetodos {
    
    static final int MAX = 10;
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int indice, op, op1, indiceachou, codigo;
        String nome, som;
        boolean achou;
        Animal[] as = new Animal[MAX];
        Animal a;
        Cao c;
        Gato g;
        Peixe p;
        indice = -1;
        do {
            System.out.println("0 - Sair.");
            System.out.println("1 - Cadastrar Animal.");
            System.out.println("2 - Cadastrar Animal (Cão).");
            System.out.println("3 - Cadastrar Animal (Gato).");
            System.out.println("4 - Cadastrar Animal (Peixe).");
            System.out.println("5 - Consultar.");
            System.out.println("6 - Remover.");
            System.out.println("7 - Alterar.");
            System.out.println("8 - Caçar ratos.");
            System.out.println("9 - Caçar gatos.");
            System.out.println("10 - Nadar.");
            System.out.println("11 - Falar.");
            System.out.println("12 - Listar.");
            System.out.print("Digite uma opção: ");
            op = teclado.nextInt();

            switch (op) {
                case 0:
                    System.out.println("Até logo!");
                    break;
                case 1:
                    indice++;
                    if (indice < MAX) {
                        System.out.print("Codigo: ");
                        codigo = teclado.nextInt();
                        System.out.print("Nome: ");
                        nome = teclado.next();
                        a = new Animal(codigo, nome);
                        as[indice] = a;
                        System.out.println("Operacao realizada com sucesso!");
                    } else {
                        System.out.println("Vetor cheio!");
                    }
                    break;
                case 2:
                    indice++;
                    if (indice < MAX) {
                        System.out.print("Codigo: ");
                        codigo = teclado.nextInt();
                        System.out.print("Nome: ");
                        nome = teclado.next();
                        c = new Cao(codigo, nome);
                        as[indice] = c;
                        System.out.println("Operacao realizada com sucesso!!");
                    } else {
                        System.out.println("Vetor cheio!");
                    }
                    break;
                case 3:
                    indice++;
                    if (indice < MAX) {
                        System.out.print("Codigo: ");
                        codigo = teclado.nextInt();
                        System.out.print("Nome: ");
                        nome = teclado.next();
                        g = new Gato(codigo, nome);
                        as[indice] = g;
                        System.out.println("Operacao realizada com sucesso!!");
                    } else {
                        System.out.println("Vetor cheio!");
                    }
                    break;
                case 4:
                    indice++;
                    if (indice < MAX) {
                        System.out.print("Codigo: ");
                        codigo = teclado.nextInt();
                        System.out.print("Nome: ");
                        nome = teclado.next();
                        p = new Peixe(codigo, nome);
                        as[indice] = p;
                        System.out.println("Operacao realizada com sucesso!");
                    } else {
                        System.out.println("Vetor cheio!");
                    }
                    break;
                case 5:
                    if (indice >= 0) {
                        System.out.println("");
                        System.out.print("Codigo:");
                        codigo = teclado.nextInt();
                        achou = false;
                        indiceachou = -1;
                        for (int i = 0; i <= indice; i++) {
                            if (codigo == as[i].getCodigo()) {
                                achou = true;
                                indiceachou = i;
                                break;
                            }
                        }
                        if (achou == true) {
                            System.out.println("Nome: " + as[indiceachou].getNome());
                            if (as[indiceachou] instanceof Animal & !(as[indiceachou] instanceof Cao) & !(as[indiceachou] instanceof Gato) & !(as[indiceachou] instanceof Peixe)) {
                                System.out.println("Animal");
                            } else {
                                if (as[indiceachou] instanceof Cao) {
                                    System.out.println("Cão");
                                } else {
                                    if (as[indiceachou] instanceof Gato) {
                                        System.out.println("Gato");
                                    } else {
                                        System.out.println("Peixe");
                                    }
                                }
                            }
                        } else {
                            System.out.println("Animmal não encontrado.");
                        }
                    } else {
                        System.out.println("vetor vazio!");
                    }
                    break;
                case 6:
                    if (indice >= 0) {
                        System.out.print("Codigo: ");
                        codigo = teclado.nextInt();
                        achou = false;
                        indiceachou = -1;
                        for (int i = 0; i <= indice; i++) {
                            if (codigo == as[i].getCodigo()) {
                                achou = true;
                                indiceachou = i;
                                break;
                            }
                        }
                        if (achou == true) {
                            for (int i = indiceachou; i < indice; i++) {
                                as[i] = as[i + 1];
                            }
                            as[indice] = null;
                            indice = indice - 1;
                            System.out.println("Operação realizada com sucesso!");
                        } else {
                            System.out.println("Animal não encontrado!");
                        }
                    } else {
                        System.out.println("Vetor vazio!");
                    }
                    break;
                case 7:
                    if (indice >= 0) {
                        System.out.print("Codigo: ");
                        codigo = teclado.nextInt();
                        achou = false;
                        indiceachou = -1;
                        for (int i = 0; i <= indice; i++) {
                            if (codigo == as[i].getCodigo()) {
                                achou = true;
                                indiceachou = i;
                                break;
                            }
                        }
                        if (achou == true) {
                            System.out.print("Nome: ");
                            nome = teclado.next();
                            as[indiceachou].setNome(nome);
                            System.out.println("Operação realizada com sucesso!");
                            break;
                        } else {
                            System.out.println("Animal não encontrado.");
                        }
                    } else {
                        System.out.println("Vetor vazio!");
                    }
                    break;
                case 8:
                    if (indice >= 0) {
                        System.out.print("Codigo: ");
                        codigo = teclado.nextInt();
                        achou = false;
                        indiceachou = -1;
                        for (int i = 0; i <= indice; i++) {
                            if (codigo == as[i].getCodigo()) {
                                achou = true;
                                indiceachou = i;
                                break;
                            }
                        }
                        if (achou == true) {
                            if (as[indiceachou] instanceof Gato) {
                                System.out.println("");
                                System.out.println(((Gato) as[indiceachou]).cacar());
                                System.out.println("");
                            } else {
                                System.out.println("Não é um gato!");
                            }
                        } else {
                            System.out.println("Animal não encontrado");
                        }
                    } else {
                        System.out.println("Vetor vazio.");
                    }
                    break;
                case 9:
                    if (indice >= 0) {
                        System.out.print("Codigo: ");
                        codigo = teclado.nextInt();
                        achou = false;
                        indiceachou = -1;
                        for (int i = 0; i <= indice; i++) {
                            if (codigo == as[i].getCodigo()) {
                                achou = true;
                                indiceachou = i;
                                break;
                            }
                        }
                        if (achou == true) {
                            if (as[indiceachou] instanceof Cao) {
                                System.out.println("");
                                System.out.println(((Cao) as[indiceachou]).cacar());
                                System.out.println("");
                            } else {
                                System.out.println("Não é um cachorro!");
                            }
                        } else {
                            System.out.println("Animal não encontrado");
                        }
                    } else {
                        System.out.println("Vetor vazio.");
                    }
                    break;
                case 10:
                    if (indice >= 0) {
                        System.out.print("Codigo: ");
                        codigo = teclado.nextInt();
                        achou = false;
                        indiceachou = -1;
                        for (int i = 0; i <= indice; i++) {
                            if (codigo == as[i].getCodigo()) {
                                achou = true;
                                indiceachou = i;
                                break;
                            }
                        }
                        if (achou == true) {
                            if (as[indiceachou] instanceof Peixe) {
                                System.out.println("");
                                System.out.println(((Peixe) as[indiceachou]).nadar());
                                System.out.println("");
                            } else {
                                System.out.println("Não é um peixe");
                            }
                        } else {
                            System.out.println("Animal não encontrado");
                        }
                    } else {
                        System.out.println("Vetor vazio.");
                    }
                    break;
                case 11:
                    if (indice >= 0) {
                        System.out.print("Codigo: ");
                        codigo = teclado.nextInt();
                        achou = false;
                        indiceachou = -1;
                        for (int i = 0; i <= indice; i++) {
                            if (codigo == as[i].getCodigo()) {
                                achou = true;
                                indiceachou = i;
                                break;
                            }
                        }
                        if (achou == true) {
                            System.out.println("");
                            System.out.println(as[indiceachou].falar());
                            System.out.println("");
                        } else {
                            System.out.println("Animal não encontrado");
                        }
                    } else {
                        System.out.println("Vetor vazio.");
                    }
                    break;
                case 12:
                    if (indice >= 0) {
                        for (int i = 0; i <= indice; i++) {
                            System.out.println("");
                            if (as[i] instanceof Animal & !(as[i] instanceof Cao) & !(as[i] instanceof Gato) & !(as[i] instanceof Peixe)) {
                                System.out.println("Animal "+i);
                            } else {
                                if (as[i] instanceof Cao) {
                                    System.out.println("Cão "+i);
                                } else {
                                    if (as[i] instanceof Gato) {
                                        System.out.println("Gato "+i);
                                    } else {
                                        System.out.println("Peixe "+i);
                                    }
                                }
                            }
                            System.out.println("Codigo: " + as[i].getCodigo());
                            System.out.println("Nome: " + as[i].getNome());
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