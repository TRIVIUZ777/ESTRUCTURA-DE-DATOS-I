package PILA_DE_LIBROS;



public class MAIN_PILA_DE_LIBROS {

    public static void main(String[] args) {

        LIBRO libro1A = new LIBRO("Homero", 500, 30.00, "La Odisea", "Historia");
        LIBRO libro2A = new LIBRO("Homero", 300, 20.00, "La Iliada", "Historia");
        LIBRO libro3A = new LIBRO("Homero", 300, 80.00, "La Iliada1", "Historia");
        LIBRO libro4A = new LIBRO("Homero", 300, 70.00, "La Iliada2", "Historia");
        LIBRO libro5A = new LIBRO("Homero", 300, 40.00, "La Iliada3", "Historia");

        PILA_DE_LIBROS pilaA = new PILA_DE_LIBROS();
        pilaA.adicionar(libro1A);
        pilaA.adicionar(libro2A);



        LIBRO libro1B = new LIBRO("Stephen King", 500, 40.00, "La torre oscura", "Terror");
        LIBRO libro2B = new LIBRO("Stephen King", 300, 60.00, "Las cuatro estaciones", "Terror");
        LIBRO libro3B = new LIBRO("Stephen King", 300, 90.00, "El ciclo del hombre lobo", "Terror");
        LIBRO libro4B = new LIBRO("Stephen King", 300, 20.00, "Cementerio de animales", "Terror");
        LIBRO libro5B = new LIBRO("Stephen King", 300, 70.00, "La tienda", "Terror");

        PILA_DE_LIBROS pilaB = new PILA_DE_LIBROS();
        pilaB.adicionar(libro1B);
        pilaB.adicionar(libro2B);

        IntercambiarValores5(pilaA,pilaB);
        pilaA.mostrar();
        pilaB.mostrar();


    }

    public static void detarminarPrecio25(PILA_DE_LIBROS pila,double nr) {
        PILA_DE_LIBROS aux = new PILA_DE_LIBROS();
        int contPar = 0;
        LIBRO item = null;
        int numAct = 0;

        while (!pila.esVacio()) {
            item=pila.eliminar();

            if (item.getPrecio() > nr) {
                contPar++;
            }
            aux.adicionar(item);
        }
        pila.vaciar(aux);
        System.out.println("Mayores a "+nr+" son :" + contPar);




    }


    public static void descuento(PILA_DE_LIBROS pila,String cat) {
        PILA_DE_LIBROS aux = new PILA_DE_LIBROS();
        LIBRO item = null;
        double desc=0,total=0;
        int numAct = 0;

        while (!pila.esVacio()) {
            item=pila.eliminar();

            if (item.getCategoria() == cat) {
                desc=item.getPrecio();
                total=desc*0.1;
                total=desc-total;
                item.setPrecio(total);
            }
            aux.adicionar(item);

        }
        pila.vaciar(aux);





    }


    private static void determinaMayorPilaA(PILA_DE_LIBROS pilaA)
    {
        // TODO Auto-generated method stub
        double edades = pilaA.nroElem();
        double mayorDeEdad = edades;
        for(int i=1; i<edades ; i++)
        {
            if(edades>mayorDeEdad)
            {
                mayorDeEdad = edades.;
            }
        }

        System.out.println("EDAD MAYOR: "+ mayorDeEdad);
    }

    private static void determinaMayorPilaB(PILA_DE_LIBROS pilaA)
    {
        // TODO Auto-generated method stub
        double edades = pilaA.nroElem();
        double mayorDeEdad = edades;
        for(int i=1; i<edades ; i++)
        {
            if(edades>mayorDeEdad)
            {
                mayorDeEdad = edades;
            }
        }

        System.out.println("EDAD MAYOR: "+ mayorDeEdad);
    }

    private static void IntercambiarValores5(PILA_DE_LIBROS obj1, PILA_DE_LIBROS obj2)
    {

        LIBRO edades = null;
        LIBRO edades1 = null;
        double max = edades.getPrecio();
        double aux = 0, aux1 = 0;
        double pmax = 0;
        double min = edades.getPrecio();
        double pmin = 0;
        double max1 = edades1.getPrecio();
        double pmax1 = 0;
        double min1 = edades1.getPrecio();
        double pmin1 = 0;


            if(edades > max)
            {
                max = edades;
                pmax=;
            }

            if(min > edades)
            {
                min = edades;
                pmin = ;
            }





            if(edades1>max1)
            {
                max1 = edades1;
                pmax1=;
            }

            if(edades1<min1)
            {
                min1 = edades1;
                pmin1 = i;
            }



        aux = edades[pmax];
        edades[pmax] = edades1[pmax1];
        edades1[pmax1] = aux;

        aux1 = edades[pmin];
        edades[pmin] = edades1[pmin1];
        edades1[pmin1] = aux1;


        obj1.(edades);
        obj2.setEdades(edades1);

    }

}
