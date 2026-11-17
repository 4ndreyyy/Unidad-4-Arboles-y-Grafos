package Grafos;
//78f30e060922a400eac9ad182d3a861c4553cc4b9005ce289ce38f9b227aeb43
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

    public void agregarAristaDireccion(int origen, int destino){

        matriz[origen][destino] =1;
    }

    public void agregarAristaDireccion(int origen, int destino, int peso){

        matriz[origen][destino] =peso;
    }

    public void eliminarArista(int origen, int destino){

        matriz[origen][destino]=0;
    }


    public void mostrarMatriz(){
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz.length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }

    public boolean existeArista(int origen, int destino){
        return matriz[origen][destino]==1;
    }

    public int valorArista(int origen, int destino){
        return matriz[origen][destino];
    }

    public int valorAristaPonderado(int origen, int destino){
        return matriz[origen][destino];
    }

    public int[] mostrarVecinos(int vertice) {
        int [] vecinos = new int [matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[vertice][i] > 0) {
                System.out.println(i + " es vecino de " + vertice);
                vecinos[i]=matriz[vertice][i];
            }
        }
        return vecinos;
    }}
