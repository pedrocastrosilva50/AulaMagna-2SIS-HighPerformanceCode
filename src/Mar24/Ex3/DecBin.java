package Mar24.Ex3;

import Mar24.pilhas.PilhasInt;

import java.util.Scanner;

public class DecBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilhasInt pilha = new PilhasInt();
        pilha.init();
        int decimalValue, resto;
        System.out.print("Valor em decimal: ");
        decimalValue = sc.nextInt();
        while (decimalValue != 0){
            resto = decimalValue % 2;
            pilha.push(resto);
            decimalValue = decimalValue/2;
        }
        System.out.println("Valor em binário: ");
        pilha.popEsvazia();
    }
}
