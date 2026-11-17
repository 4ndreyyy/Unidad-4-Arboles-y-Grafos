package Arboles;

public class ArbolesTar1 {

    public static void main(String[] args) {
        int[] foliosVendidos = {4521, 3012, 5890, 2750, 4100, 6200, 3900};
        ArbolBinario arbolFolios = construirArbol(foliosVendidos);

        System.out.println("Folios vendidos ordenados:");
        arbolFolios.inorder(arbolFolios.raiz);
        System.out.println("Folio más bajo: " + arbolFolios.menorElemento(arbolFolios.raiz));
        System.out.println("Folio más alto: " + arbolFolios.mayorElemento(arbolFolios.raiz));

        int[] matriculas = {5000, 3000, 7000, 2000, 4000, 6000, 8000, 4500};
        ArbolBinario arbolMatriculas = construirArbol(matriculas);

        System.out.println("Total de alumnos: " + arbolMatriculas.contarNodos());
        int matriculaBuscada = 4500;
        System.out.println("Nivel de la matrícula " + matriculaBuscada + ": "
                + arbolMatriculas.nivelDeNodo(matriculaBuscada));

        int[] ventas = {450, 120, 890, 75, 300, 600, 950, 250, 400, 700};
        ArbolBinario arbolVentas = construirArbol(ventas);

        System.out.println("Ventas entre 250 y 600:");
        arbolVentas.buscarEnRango(250, 600);
    }

    private static ArbolBinario construirArbol(int[] valores) {
        ArbolBinario arbol = new ArbolBinario();
        for (int valor : valores) {
            arbol.raiz = arbol.insert(arbol.raiz, valor);
        }
        return arbol;
    }
}
