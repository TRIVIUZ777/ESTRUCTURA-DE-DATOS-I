package defensa_colas_hito4;

public class ColaDeClientes {

    private int ini;
    private int fin;
    private int max;
    private Cliente[] clientes;

    public ColaDeClientes(){

        this.max=100;
        this.ini=0;
        this.fin=0;
        this.clientes=new Cliente[this.max+1];
    }

    public boolean esVacia(){
        return  ini ==0 && fin ==0;

    }


    public boolean esLlena(){
        return  fin ==max;

    }

    public void adicionar(Cliente nuevoCliente){
        if (esLlena()){
            System.out.println("Cola de clientes llena");
        }else {
            fin=(fin % max)+1;
            clientes[fin]=nuevoCliente;
        }


    }

    public Cliente eliminar(){
        Cliente clienteEliminado=null;

        if (esVacia()){
            System.out.println("Cola vacia");
        }else {
            ini =(ini%max)+1;
            clienteEliminado =clientes[ini];
            if (ini==fin){
                ini=0;
                fin=0;
            }
        }
        return clienteEliminado;
    }

    public int nroElementos(){
        return (fin-ini+max)%max;
    }

    public void vaciar(ColaDeClientes cola){
        Cliente clienteEliminado;
        while (!cola.esVacia()){
            clienteEliminado = cola.eliminar();
            adicionar(clienteEliminado);
        }
    }

    public  void mostrar(){
        if (esVacia()){
            System.out.println("la cola de clientes esta vacia");
        }else {
            System.out.println("Mostrando los datos de la cola CLientes");
            ColaDeClientes aux = new ColaDeClientes();
            while (!esVacia()){
                Cliente cliente = eliminar();
                System.out.println(" ");
                System.out.println("Nombres: "+cliente.getNombres());
                System.out.println("Apellidos: "+cliente.getApellidos());
                System.out.println("Edad: "+cliente.getEdad());
                System.out.println("Pais: "+cliente.getPais());
                System.out.println("Genero: "+cliente.getGenero());
                System.out.println("Tipo: "+cliente.getTipo());
                System.out.println("Id:: "+cliente.getId());
                System.out.println(" ");
            }
        }


    }




}
