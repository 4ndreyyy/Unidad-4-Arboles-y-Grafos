package Grafos;

public class GrafosMatrizDireccionIMPL {
    public static void main(String[] args) {
        Grafos grafo = new Grafos(5);
        grafo.agregarAristaDireccion(0,1,3);
        grafo.agregarAristaDireccion(0,2,1);
        grafo.agregarAristaDireccion(2,3,2);
        grafo.agregarAristaDireccion(1,3,2);

        System.out.println("");
        System.out.println("IMPL");
        grafo.mostrarMatriz();

        System.out.println("Valor Arista 0-1= "+grafo.valorAristaPonderado(0,1));
        System.out.println("");
        System.out.println("Despues de eliminar la arista");
        grafo.eliminarArista(1,3);
        grafo.mostrarMatriz();

        System.out.println(" ");
        grafo.mostrarVecinos(0);

    }
}
