package Mai05.Ex2;

public class MainLista1 {
    public static void main(String[] args) {
        NoLista lista = new NoLista();
        lista.dado = 1;
        lista.prox = null;

        System.out.println("\n\tLista: "+ lista);
        System.out.println("\tDado: " + lista.dado);
        System.out.println("\tProx: "+ lista.prox);

        System.out.println("\nInserindo segundo elemento :");
        NoLista novo = new NoLista();
        novo.dado = 2;
        novo.prox = null;
        lista.prox = novo;

        System.out.println("\n\tLista: "+ lista);
        System.out.println("\tDado: " + lista.dado);
        System.out.println("\tProx: "+ lista.prox);

        System.out.println("\n\tLista: "+ novo);
        System.out.println("\tDado: " + novo.dado);
        System.out.println("\tProx: "+ novo.prox);

        System.out.println("\nInserindo terceiro elemento :");
        NoLista novo2 = new NoLista();
        novo2.dado = 3;
        novo2.prox = lista;

        System.out.println("\n\tLista: "+ lista);
        System.out.println("\tDado: " + lista.dado);
        System.out.println("\tProx: "+ lista.prox);

        System.out.println("\n\tLista: "+ novo);
        System.out.println("\tDado: " + novo.dado);
        System.out.println("\tProx: "+ novo.prox);

        System.out.println("\n\tLista: "+ novo2);
        System.out.println("\tDado: " + novo2.dado);
        System.out.println("\tProx: "+ novo2.prox);

        //Exercicio 2
        lista = novo2;
        //Exercicio 3

        System.out.println("\tApresentado os dados presentes na lista encadeada");
        NoLista aux = lista;
        while ("\t"+aux != null){
            System.out.println("\t"+aux.dado);
            aux = aux.prox;
        }
    }
}
