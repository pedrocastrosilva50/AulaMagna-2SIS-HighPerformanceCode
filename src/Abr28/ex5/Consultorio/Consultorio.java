package Abr28.ex5.Consultorio;

import java.util.Scanner;

public class Consultorio {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        FilaString fila = new FilaString();
        fila.init();
        int opcao;
        do {
            System.out.println("1- Insere paciente na fila");
            System.out.println("2- Atende 1 paciente");
            System.out.println("3- Encerra atendimento");
            opcao = le.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Informe nome do paciente: ");
                    le.nextLine();
                    String nome = le.nextLine();
                    fila.enqueue(nome);
                    break;
                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("Não há pacientes na fila");
                    } else {
                        System.out.println("O paciente: " + fila.dequeue() + " será atendido agora");
                    }
                    break;
                case 3:
                    if (!fila.isEmpty()){
                        System.out.println("Fila ainda tem pacientes para atendimento");
                        opcao = 0;
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 3);
    }
}
