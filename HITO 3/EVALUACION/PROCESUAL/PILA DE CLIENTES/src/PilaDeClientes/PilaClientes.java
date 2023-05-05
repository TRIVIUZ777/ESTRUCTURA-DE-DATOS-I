package PilaDeClientes;

import java.util.Stack;
import java.util.function.IntFunction;

public class PilaClientes extends Stack<Clientes> {
    private Clientes[] items;
    private int tope;
     private int max;
    public PilaClientes() {
        this.items = new Clientes[100];
        this.tope = -1;
        this.max = 0;
    }

    public boolean esVacio() {
        return (tope == -1);
    }

    public boolean esLleno() {
        return (tope == items.length - 1);
    }

    public void adicionar(Clientes item) {
        if (!esLleno()) {
            items[++tope] = item;
        }
    }

    public Clientes eliminar() {
        if (!esVacio()) {
            return items[tope--];
        } else {
            return null;
        }
    }

    public int nroElem(){
        return tope+1;
    }

    public void vaciar(PilaClientes pila){
        while (!pila.esVacio()){
            this.adicionar(pila.eliminar());
        }
    }

    public void mostrar() {
        System.out.println("Pila de clientes: ");
        for (int i = tope; i >= 0; i--) {
            System.out.println("  ");
            System.out.println("Pila de clientes: ");
            System.out.println("Nombre: "+items[i].getNombre());
            System.out.println("Apellidos: "+items[i].getApellido());
            System.out.println("Edad: "+ items[i].getEdad());
            System.out.println("Direccion: "+ items[i].getDireccion());
            System.out.println("Genero:"+ items[i].getGenero());

        }
    }



}
