package PilaDeClientes;

public class PilaClientes {
    private Clientes[] items;
    private int tope;

    public PilaClientes() {
        this.items = new Clientes[100];
        this.tope = -1;
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
            System.out.println(items[i].getNombre() + " " + items[i].getApellido() + ", " + items[i].getEdad() + " años, dirección: " + items[i].getDireccion() + ", género: " + items[i].getGenero());
        }
    }
}
