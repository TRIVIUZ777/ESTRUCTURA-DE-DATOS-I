package Pila_de_cadenas;


import java.util.Scanner;

public class Pila_de_cadenas {

    private int max;     //cantidad maxima
    private int tope;    //elementos
    private String[] nombre;

    public Pila_de_cadenas()
    {
        this.max=10;
        this.tope=0;
        this.nombre = new String [this.max+1];
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
    public String adicionar(String nuevaCAD)
    {
        if(esLleno()==true){
            System.out.println("PILA LLENA");
        }else{
            tope=tope+1;
            nombre[tope]=nuevaCAD;
        }
        return nuevaCAD;
    }
    public String eliminar()
    {
        String itemEliminado="";
        if(esVacio()==true){
            System.out.println("PILA VACIA");
        }else{
            itemEliminado = nombre[tope];
            tope=tope-1;
        }
        return itemEliminado;
    }


    public void llenar(int nroItems)
    {
        Scanner leer = new Scanner(System.in);
        String nombre = "";

        System.out.println("Llenando la pila de nombres");

        for (int i = 0 ; i < nroItems ; i++){
            System.out.println("Ingrese el nombre:"+(i+1)+": ");
            nombre= leer.nextLine();
            adicionar(nombre);
            System.out.println();


        }

    }


    public void mostrar()
    {
        String item="";
        if(esVacio())
        {
            System.out.println("No hay items que mostrar");
        }else{
            System.out.println("Mostrando la PILA DE CADENAS: ");
            Pila_de_cadenas aux=new Pila_de_cadenas();
            while(!esVacio()){
                item = eliminar();
                System.out.print(item+", ");
                aux.adicionar(item);
            }
            vaciar(aux);
        }


    }
    public void vaciar(Pila_de_cadenas pila)
    {
        while (!pila.esVacio()) {
            adicionar(pila.eliminar());
        }
    }









    }





