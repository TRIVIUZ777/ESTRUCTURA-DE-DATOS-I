package PILA_DE_LIBROS;



public class PILA_DE_LIBROS {

    private int max;     //cantidad maxima
    private int tope;    //elementos
    private LIBRO[] libros;

    public PILA_DE_LIBROS()
    {
        this.tope=0;
        this.max=10;
        this.libros =new LIBRO [this.max+1];
    }
    public boolean esVacio()
    {
        if(this.tope==0)
        {
            return true;
        }else{
            return false;}
    }
    public boolean esLleno()
    {
        if(tope==max){
            return true;
        }else{
            return false;
        }

    }
    public int nroElem()
    {
        return this.tope;
    }
    public  void adicionar(LIBRO nuevoLibro)
    {
        if(this.esLleno()){
            System.out.println("Pila de libros llena");
        }else{
            tope=this.tope+1;
            this.libros[this.tope]=nuevoLibro;
        }

    }
    public LIBRO eliminar()
    {
        LIBRO libroEliminado = null;

        if(!this.esVacio()==true){
            libroEliminado =libros[tope];
            tope=tope-1;
        }else{
            System.out.println("Pila de libros vacia");
        }
        return libroEliminado;
    }

    public static void llenar(String n)
    {

    }
    public void vaciar(PILA_DE_LIBROS pila)
    {
        while (!pila.esVacio()) {
            adicionar(pila.eliminar());
        }
    }
    public void mostrar()
    {
        LIBRO libro=null;
        if(esVacio())
        {
            System.out.println("No hay items que mostrar");

        }
        else
        {
            System.out.println("Mostrando la PILA DE CADENAS: ");
            PILA_DE_LIBROS aux=new PILA_DE_LIBROS();

            while(!esVacio()){
                libro = eliminar();
                aux.adicionar(libro);
                libro.mostrarLibro();
            }
            vaciar(aux);
        }


    }
}
