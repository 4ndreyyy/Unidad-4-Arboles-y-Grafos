package Grafos;

public class Grafos {
    int [][] matriz;
    int vertice;
    public Grafos(int vertice){
        matriz =new int [vertice][vertice];
    }

    public void agregarArista(int origen, int destino){
        matriz [origen] [destino] = 1;
        matriz [destino][origen] = 1;

    }

    public void mostrarMatriz(){
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz.length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }


}
