package Fev25.Ex1;

import java.util.Scanner;

public class RmNotaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = 30;
        int[] rm = new int[N];
        double[] nota1 = new double[N];
        double[] nota2 = new double[N];

        System.out.print("Informe seu RM (negativo encerra o programa): ");
        int rmLido = sc.nextInt();

        // for para entrada de dados
        int n;
        for (n = 0; n < N && rmLido > 0; n++) {
            rm[n] = rmLido;
            System.out.print("Primeira nota: ");
            nota1[n] = sc.nextDouble();
            System.out.print("Segunda nota: ");
            nota2[n] = sc.nextDouble();
            System.out.print("Informe seu RM (negativo encerra o programa): ");
            rmLido = sc.nextInt();
        }

        // for para calculo da media

        double[] media = new double[n];
        for (int i = 0; i < n; i++) {
            media[i] = (nota1[i] + nota2[i]) / 2;
            System.out.print("\nRM: " + rm[i] + "\nMédia: " + media[i] + "\n");
            System.out.println();
        }

        // for para alunos aprovados
        int[] aprovados = new int[n];
        int nAp = 0;
        for (int i = 0; i < n; i++) {
            if (media[i] >= 6) {
                aprovados[nAp] = rm[i];
                nAp++;
            }
        }
        if (n != 0) {
            System.out.println("\t ****** Lista de aprovados ******");
            for (int i = 0; i < nAp; i++) {
                System.out.println("          RM:           " +aprovados[i]);
            }
        }
    }
}