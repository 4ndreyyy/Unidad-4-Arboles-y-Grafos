package Arboles;

public class ArbolBinario {

    Nodo raiz;

    public Nodo insert (Nodo raiz, int valor){
        if (raiz==null){
            return new Nodo(valor);
        }
        if (valor< raiz.valor){
            raiz.izq= insert(raiz.izq,valor);
        }else if (valor > raiz.valor){
            raiz.dere= insert(raiz.dere, valor);
        }
        return raiz;
    }

    public void preorder(Nodo nodo) {
        if (nodo != null) {
            System.out.println(nodo.valor);
            preorder(nodo.izq);
            preorder(nodo.dere);
        }
    }

    public void inorder(Nodo nodo){
        if (nodo != null) {
            inorder(nodo.izq);
            System.out.println(nodo.valor);
            inorder(nodo.dere);
        }
    }

    public void postorder(Nodo nodo){
        if (nodo!=null){
            postorder(nodo.izq);
            postorder(nodo.dere);
            System.out.println(nodo.valor);
        }
    }

    public boolean buscar (Nodo nodo, int valor){
        if (nodo == null) {
            return false;
        }
        if (nodo.valor == valor) {
            return true;
        }
        if (valor < nodo.valor) {
            return buscar(nodo.izq, valor);
        } else {
            return buscar(nodo.dere, valor);
        }
    }

    public int totalNodos(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }
        return  1+ totalNodos(nodo.izq) + totalNodos(nodo.dere);
    }

    public int altura(Nodo nodo){
        if (nodo==null){
            return 0;
        }
        int altIzq = altura(nodo.izq);
        int altDere = altura(nodo.dere);
        return Math.max(altIzq, altDere) + 1;
    }

    public int totalHojas(Nodo nodo){
        if (nodo!=null){
            if (nodo.izq == null && nodo.dere == null) {
                return 1;
            }
            return totalHojas(nodo.izq) + totalHojas(nodo.dere);
        }
        return 0;
    }

    public int menorElemento(Nodo nodo){
        if (nodo == null) {
            throw new RuntimeException("El árbol está vacío");
        }
        while (nodo.izq != null) {
            nodo = nodo.izq;
        }
        return nodo.valor;
    }

    
    public int mayorElemento(Nodo nodo){
        if (nodo == null) {
            throw new RuntimeException("El árbol está vacío");
        }
        while (nodo.dere != null) {
            nodo = nodo.dere;
        }
        return nodo.valor;
    }
}
