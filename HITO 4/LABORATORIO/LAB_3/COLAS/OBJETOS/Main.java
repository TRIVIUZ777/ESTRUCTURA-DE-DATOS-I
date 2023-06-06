package LAB_2.COLAS.OBJETOS;



public class Main {
    public static void main(String[] args) {
        ColaDeLibros cola = new ColaDeLibros();

        Libros libro1 = new Libros(1,"Juan","masculino","MANGA", 80);
        Libros libro2 = new Libros(2,"Salu","masculino","MANGA", 100);
        Libros libro3 = new Libros(3,"Ana","femenino","HISTORIA", 40);
        Libros libro4 = new Libros(4,"Micaela","femenino","HISTORIA", 30);
        Libros libro5 = new Libros(5,"Pepito","otro","NOVELA", 20);
        Libros libro6 = new Libros(6,"Pep","otro","NOVELA", 20);
        Libros libro7 = new Libros(7,"Carlos","masculino","ARTE", 200);

        cola.adicionar(libro1);
        cola.adicionar(libro2);
        cola.adicionar(libro3);
        cola.adicionar(libro4);
        cola.adicionar(libro5);
        cola.adicionar(libro6);
        cola.adicionar(libro7);



        //cola.mostrar();

        //Libros libroMenosPaginas = obtenerLibroMenosPaginas(cola);


        //obtenerLibroMenosPaginas(cola);

        oredenarLibPagiASC(cola);









    }



    public static Libros obtenerLibroMenosPaginas(ColaDeLibros cola) {
        ColaDeLibros aux = new ColaDeLibros();
        Libros libroMenosPaginas = null;
        int minPaginas = Integer.MAX_VALUE;

        while (!cola.esVacia()) {
            Libros libro = cola.eliminar();
            if (libro.getPaginas() < minPaginas) {
                minPaginas = libro.getPaginas();
                libroMenosPaginas = libro;

            }

            aux.adicionar(libro);

        }

        cola.vaciar(aux);
        System.out.println("Libro con menos páginas:");
        libroMenosPaginas.mostrar();
        return libroMenosPaginas;
    }



    private static Libros DeterminaLibroMenorPagina(ColaDeLibros cola){
        ColaDeLibros aux = new ColaDeLibros();
        Libros libroMenosPaginas = null;
        int minPaginas = Integer.MAX_VALUE;

        while (!cola.esVacia()) {
            Libros item = cola.eliminar();
            if (item.getPaginas() < minPaginas) {
                minPaginas = item.getPaginas();
                libroMenosPaginas = item;

            }

            aux.adicionar(item);

        }

        cola.vaciar(aux);

        return libroMenosPaginas;
    }



    public static void reordenarLibrosPorGenero(ColaDeLibros cola) {


        ColaDeLibros colaFemenino = new ColaDeLibros();
        ColaDeLibros colaMasculino = new ColaDeLibros();
        ColaDeLibros colaOtro = new ColaDeLibros();

        while (!cola.esVacia()) {
            Libros libroActual = cola.eliminar();


            if (libroActual.getGenero().equals("femenino")) {
                colaFemenino.adicionar(libroActual);
            } else if (libroActual.getGenero().equals("masculino")) {
                colaMasculino.adicionar(libroActual);
            } else {
                colaOtro.adicionar(libroActual);
            }
        }

        cola.vaciar(colaFemenino);
        cola.vaciar(colaMasculino);
        cola.vaciar(colaOtro);



    }








    public static void oredenarLibPagASC(ColaDeLibros cola){
        Libros[] libros = new  Libros[cola.nroElementos()];

        for (int i = libros.length -1; i >= 0; i--){
            libros[i]= cola.eliminar();
        }

        for (int i = 0;i<libros.length-1;i++)
        {
            for (int j = 0;j< libros.length-i-1;j++){

                if (libros[j].getPaginas()>libros[j+1].getPaginas()){
                    Libros temp = libros[j];
                    libros[j]= libros[j+1];
                    libros[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < libros.length;i++){
            cola.adicionar(libros[i]);
        }
    }


    public static void oredenarLibPagiASC(ColaDeLibros cola) {
        ColaDeLibros ordenados = new ColaDeLibros();
        ColaDeLibros aux = new ColaDeLibros();
        int nroElem = cola.nroElementos();

        for (int i = 1; i <= nroElem; i++) {
            Libros libros = DeterminaLibroMenorPagina(cola);
            while (!cola.esVacia()) {
                Libros item = cola.eliminar();
                if (item.getCodigoLibro() == libros.getCodigoLibro()) {
                    ordenados.adicionar(item);
                } else {
                    aux.adicionar(item);
                }
            }
            cola.vaciar(aux);


        }
        cola.vaciar(ordenados);
        cola.mostrar();


    }
}












