package Mar24.teste;

import Mar24.pilhas.PilhasInt;

import javax.sound.midi.Soundbank;

public class MainTeste {
    public static void main(String[] args) {
        PilhasInt pilhas = new PilhasInt();
        pilhas.init();
        pilhas.push(11);
        pilhas.push(22);
        pilhas.push(33);
        pilhas.push(44);
        pilhas.push(55);
        pilhas.push(66);
        pilhas.push(77);

        if (pilhas.isEmpty()){
            System.out.println("STACK IS EMPTY !!!");
        }
        else {
            System.out.println("Valor do topo: "+ pilhas.top());
        }
        System.out.println("*** Dados Empilhados ***");
        pilhas.popEsvazia();

        /*
        if (pilhas.isEmpty()){
            System.out.println("STACK IS EMPTY !!!");
        } else {
        System.out.println("Valor retirado: "+pilhas.pop());
        }
        if (pilhas.isEmpty()){
            System.out.println("STACK IS EMPTY !!!");
        } else {
        System.out.println("Valor retirado: "+pilhas.pop());
        }
        if (pilhas.isEmpty()){
            System.out.println("STACK IS EMPTY !!!");
        } else {
        System.out.println("Valor retirado: "+pilhas.pop());
        }
        if (pilhas.isEmpty()){
            System.out.println("STACK IS EMPTY !!!");
        } else {
        System.out.println("Valor retirado: "+pilhas.pop());
        }
        if (pilhas.isEmpty()){
            System.out.println("STACK IS EMPTY !!!");
        } else {
        System.out.println("Valor retirado: "+pilhas.pop());
        }
        if (pilhas.isEmpty()){
            System.out.println("STACK IS EMPTY !!!");
        } else {
        System.out.println("Valor retirado: "+pilhas.pop());
        }
        if (pilhas.isEmpty()){
            System.out.println("STACK IS EMPTY !!!");
        } else {
        System.out.println("Valor retirado: "+pilhas.pop());
        }
        */

    }
}
