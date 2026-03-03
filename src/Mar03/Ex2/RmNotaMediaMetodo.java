package Mar03.Ex2;

import java.util.Scanner;

public class RmNotaMediaMetodo {
    static final int N = 30;

    public static void main(String[] args) {

        int[] rm = new int[N];
        double[] nota1 = new double[N];
        double[] nota2 = new double[N];
        int n = entradaDados(rm, nota1, nota2);
        for (int i = 0; i < n; i++){
            System.out.println(rm[i]);
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



}