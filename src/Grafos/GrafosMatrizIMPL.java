package Grafos;

public class GrafosMatrizIMPL {
    public static void main(String[] args) {

        Grafos grafo = new Grafos(4);
        grafo.agregarArista(0, 1);
        grafo.agregarArista(0, 2);
        grafo.agregarArista(2, 3);

        //Muestra las conexiones como si fuera una matriz en la terminal, indica que origen que son
        //las columnas y el destino que son las filas
        //El tamaño de la matriz la determina el vertice

        System.out.println("IMPL");
        System.out.println("");
        grafo.mostrarMatriz();

        System.out.println("Arista entre 0-1 ="+grafo.existeArista(0,1));
        System.out.println("Arista entre 0.3 ="+grafo.existeArista(0,3));

        System.out.println("Valor de Arista 0-1");
        System.out.println(grafo.valorAristaPonderado(0,1));


    }

}
