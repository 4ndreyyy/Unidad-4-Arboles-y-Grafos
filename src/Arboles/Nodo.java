package Arboles;

public class Nodo {
    Nodo izq;
    Nodo dere;
    int valor;

    Nodo (int valor){
        this.valor=valor;
        this.izq=null;
        this.dere=null;
    }

}