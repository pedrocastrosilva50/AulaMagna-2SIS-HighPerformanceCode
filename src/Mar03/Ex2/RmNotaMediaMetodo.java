package Mar03.Ex2;

import java.util.Scanner;

public class RmNotaMediaMetodo {
    static final int N = 30;

    public static void main(String[] args) {

        int[] rm = new int[N];
        double[] nota1 = new double[N];
        double[] nota2 = new double[N];
        int[] aprovados = new int[N];
        int n = entradaDados(rm, nota1, nota2);

        double[] media = new double[n];
        calcularMedia(n, media, nota1, nota2);
        for (int i = 0; i < n; i++){
            System.out.println("\nRM: " + rm[i] + "\nMédia: " + media[i] + "\n");
        }
        int nAp = geraListaAprovados(n, media, rm, aprovados);
            System.out.println("\n\t ****** Lista de aprovados ******");
            for (int i = 0; i < nAp; i++) {
                System.out.println(" \n                 RM:" +aprovados[i]);
        }

    }
    public static int entradaDados(int[] rm, double[] nota1, double[] nota2) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Informe seu RM (negativo encerra o programa): ");
        int rmLido = sc.nextInt();
        for (n = 0; n < N && rmLido > 0; n++) {
            rm[n] = rmLido;
            System.out.print("Primeira nota: ");
            nota1[n] = sc.nextDouble();
            System.out.print("Segunda nota: ");
            nota2[n] = sc.nextDouble();
            System.out.print("Informe seu RM (negativo encerra o programa): ");
            rmLido = sc.nextInt();
        }
        return n;
    }

    public static void calcularMedia(int n, double[] media, double[] nota1, double[] nota2){
        for (int i = 0; i < n; i++){
            media[i] = (nota1[i] + nota2[i])/2;
        }
    }

    public static int geraListaAprovados(int n, double[] media, int[] rm, int[] aprovados) {
        int nAp = 0;
        for (int i = 0; i < n; i++) {
            if (media[i] >= 6) {
                aprovados[nAp] = rm[i];
                nAp++;
            }
        }
        return nAp;
    }

}