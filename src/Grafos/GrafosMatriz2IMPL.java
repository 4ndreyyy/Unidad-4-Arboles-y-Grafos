package Grafos;

public class GrafosMatriz2IMPL {
    public static void main(String[] args) {
        Grafos grafo = new Grafos(5);
        grafo.agregarArista(0,1);
        grafo.agregarArista(0,2);
        grafo.agregarArista(0,3);
        grafo.agregarArista(1,3);
        //Indice (4) sin conexion
        grafo.mostrarMatriz();
    }
}
