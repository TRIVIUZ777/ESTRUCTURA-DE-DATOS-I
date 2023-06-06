package LAB_2.COLAS.OBJETOS;



public class ColaDeLibros {

    private int ini;
    private int fin;
    private int max;
    private Libros[] libros;

    public ColaDeLibros(){
        this.max = 100;
        this.ini = 0;
        this.fin = 0;
        this.libros = new Libros[this.max+1];
    }

    public boolean esVacia(){
        if(ini == 0 && fin == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean esLlena(){
        if(fin == max){
            return true;
        }
        else {
            return false;
        }


    }

    public void adicionar(Libros nuevoLibro){
        if(esLlena()){
            System.out.println("Cola de numeros llena");
        }
        else{
            fin = fin+1;
            libros[fin]=nuevoLibro;
        }
    }

    public Libros eliminar(){
        Libros elemento = null;

        if(esVacia()){
            System.out.println("Cola VACIA");
        }else{
            ini = ini+1;
            elemento = libros[ini];
            if(ini == fin){
                ini=0;
                fin=0;
            }
        }
        return elemento;
    }


    public int nroElementos(){
        return fin - ini;

    }


    public int getFin() {
        return fin;
    }

    public int getIni() {
        return ini;
    }





    public void vaciar(ColaDeLibros cola){

        while(!cola.esVacia()){

            adicionar(cola.eliminar());
        }
    }

    public void mostrar(){

        if(esVacia()){
            System.out.println("La cola de numeros esta vacia, no hay ITEMS");
        }else
        {
            Libros elemEliminado;
            System.out.println("Mostrando los datos de la cola");
            ColaDeLibros aux = new ColaDeLibros();
            while(!esVacia()){
                elemEliminado = eliminar();
                elemEliminado.mostrar();
                aux.adicionar(elemEliminado);
            }
            vaciar(aux);
        }
    }


}
