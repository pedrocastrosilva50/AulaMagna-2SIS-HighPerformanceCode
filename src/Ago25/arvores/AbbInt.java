package Ago25.arvores;

public class AbbInt {
    private class NO {
        int dado;
        NO esq, dir;
    }

    public NO root = null;

    public NO inserir(NO p, int info) {
        if (p == null) {
            p = new NO();
            p.dado = info;
            p.esq = null;
            p.dir = null;
        } else if (info < p.dado) {
            p.esq = inserir(p.esq, info);
        } else {
            p.dir = inserir(p.dir, info);
        }
        return p;
    }
    public void mostrarEmOrdem (NO p){
        if (p!=null){
            mostrarEmOrdem(p.esq);
            System.out.print("\t"+p.dado);
            mostrarEmOrdem(p.dir);
        }
    }
}
