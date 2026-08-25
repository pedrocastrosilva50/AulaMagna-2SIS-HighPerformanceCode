package Ago25.aplicacao;

import Ago25.arvores.AbbInt;

public class MainTeste {
    static void main(){
        AbbInt abb = new AbbInt();

        abb.root = abb.inserir(abb.root, 6);
        abb.root = abb.inserir(abb.root, 4);
        abb.root = abb.inserir(abb.root, 10);
        System.out.println("Apresenta valores da ABB");
        abb.mostrarEmOrdem(abb.root);
    }
}
