package Abr07.Ex3;

import java.util.Scanner;

public class AtendeAluno {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        FilaInt fila = new FilaInt();
        fila.init();
        int opcao;
        do {
            System.out.println("1- Insere aluno na fila");
            System.out.println("2- Atende 1 aluno");
            System.out.println("3- Encerra atendimento");
            opcao = le.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Informe RM do aluno: ");
                    int rm = le.nextInt();
                    fila.enqueue(rm);
                    break;
                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("Não há alunos na fila");
                    } else {
                        System.out.println("O aluno: " + fila.dequeue() + " será atendido agora");
                    }
                    break;
                case 3:
                    if (!fila.isEmpty()){
                        System.out.println("Fila ainda tem alunos para atendimento");
                        opcao = 0;
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 3);
    }
}

