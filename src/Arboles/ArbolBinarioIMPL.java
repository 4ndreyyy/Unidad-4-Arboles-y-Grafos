package Arboles;

public class ArbolBinarioIMPL {

    public static void main(String[] args) {
    ArbolBinario arbol = new ArbolBinario();
        arbol.raiz=arbol.insert(arbol.raiz,40);
        arbol.raiz=arbol.insert(arbol.raiz,20);
        arbol.raiz=arbol.insert(arbol.raiz,50);
        arbol.raiz=arbol.insert(arbol.raiz,10);
        arbol.raiz=arbol.insert(arbol.raiz,30);
        //arbol.raiz=arbol.insert(arbol.raiz,60);

        System.out.println("Preorder");
        arbol.preorder(arbol.raiz);
        System.out.println("");

        System.out.println("Postorder");
        arbol.postorder(arbol.raiz);
        System.out.println("");

        System.out.println("Inorder");
        arbol.inorder(arbol.raiz);

        System.out.println("Total de nodos:");
        System.out.println(arbol.totalNodos(arbol.raiz));

        System.out.println("Altura");
        System.out.println(arbol.altura(arbol.raiz));

        System.out.println("Total Hojas");
        System.out.println(arbol.totalHojas(arbol.raiz));

        System.out.println("Elemento Menor");
        System.out.println(arbol.menorElemento(arbol.raiz));

        System.out.println("Mayor Elemento");
        System.out.println(arbol.mayorElemento(arbol.raiz));
    }
}
