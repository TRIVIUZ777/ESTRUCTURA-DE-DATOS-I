package defensa_pilas_hito3;

public class PilaDeEstudiante {

    private int max;     //cantidad maxima
    private int tope;    //elementos
    private Estudiante[] libros;

    public PilaDeEstudiante()
    {
        this.tope=0;
        this.max=100;
        this.libros =new Estudiante [this.max+1];
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
    public  void adicionar(Estudiante nuevoLibro)
    {
        if(this.esLleno()){
            System.out.println("Pila de libros llena");
        }else{
            tope=this.tope+1;
            this.libros[this.tope]=nuevoLibro;
        }

    }
    public Estudiante eliminar()
    {
        Estudiante libroEliminado = null;

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
    public void vaciar(PilaDeEstudiante pila)
    {
        while (!pila.esVacio()) {
            adicionar(pila.eliminar());
        }
    }
    public void mostrar()
    {
        Estudiante libro=null;
        if(esVacio())
        {
            System.out.println("No hay items que mostrar");

        }
        else
        {
            System.out.println("Mostrando la PILA DE CADENAS: ");
            PilaDeEstudiante aux=new PilaDeEstudiante();

            while(!esVacio()){
                libro = eliminar();
                aux.adicionar(libro);
                libro.mostrarEstudiantes();
            }
            vaciar(aux);
        }


    }

}