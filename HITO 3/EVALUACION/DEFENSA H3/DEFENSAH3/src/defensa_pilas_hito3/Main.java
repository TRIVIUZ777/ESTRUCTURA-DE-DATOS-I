package defensa_pilas_hito3;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Estudiante Estudiante1 = new Estudiante("Juan", "Quispe", 19, "LA PAZ", 60, "9980LP");
        Estudiante Estudiante2 = new Estudiante("Omar","Villca",20,"EL ALTO",75,"9450LP");
        Estudiante Estudiante3 = new Estudiante("Alex","Quispe",18,"COCHABANBA",80,"9002CB");
        Estudiante Estudiante4 = new Estudiante("Ana","Mamani",25,"EL ALTO",48,"9032LP");
        Estudiante Estudiante5 = new Estudiante("Ros","Quispe",24,"COCHABANBA",50,"9045CB");
        Estudiante Estudiante6 = new Estudiante("Daniel","Mamani",19,"COCHABANBA",80,"9084CB");



        PilaDeEstudiante pila = new PilaDeEstudiante();
        pila.adicionar(Estudiante1);
        pila.adicionar(Estudiante2);
        pila.adicionar(Estudiante3);
        pila.adicionar(Estudiante4);
        pila.adicionar(Estudiante5);
        pila.adicionar(Estudiante6);




        //mayoresNOTA(pila, 51);

        reordenaPila(pila,"LP");
        pila.mostrar();

    }








    public static void mayoresNOTA(PilaDeEstudiante pila, int nota){
        PilaDeEstudiante aux = new PilaDeEstudiante();

        Estudiante item = null;
        int cont = 0;

        while (!pila.esVacio()){
            item = pila.eliminar();

            if (item.getSede() == "EL ALTO") {
                if (item.getNotaFinal() >= nota && item.getCI().endsWith("LP")) {
                    cont++;
                }
            }
            aux.adicionar(item);
        }
        pila.vaciar(aux);
        System.out.println("Hay " + cont +" estudiante aprobado con nota mayor a "+ nota);
    }


    public static void kEsimoPosicion(PilaDeEstudiante pila, int nuevaDireccion){
        PilaDeEstudiante aux = new PilaDeEstudiante();
        Estudiante item = null;
        Estudiante nom = null;

        while (!pila.esVacio()){
            item = pila.eliminar();
            if(pila.nroElem()+1 == nuevaDireccion){
                nom = item;

                if (nuevaDireccion > pila.nroElem()) {
                    System.out.println("max");

                }
            }else {
                aux.adicionar(item);
            }
        }
        pila.vaciar(aux);
        pila.adicionar(nom);
    }

//---------------------------------------
//    public static int numeroMenor(PilaDeEstudiante pila) {
//
//        PilaDeEstudiante aux = new PilaDeEstudiante();
//
//        int numActual = 0;
//        int menor = pila.g;
//        pila.adicionar(menor);
//
////        int menor = Integer.MAX_VALUE;
//
//        while (!pila.esVacio()) {
//
//            numActual = pila.eliminar();
//
//            if (numActual < menor) {
//                menor = numActual;
//            }
//
//            aux.adicionar(numActual);
//
//        }
//        pila.vaciar(aux);
//        return menor;
//
//    }



    public static void kEsimoNotaPosicion(PilaDeEstudiante pila, int nuevaDireccion){
        PilaDeEstudiante aux = new PilaDeEstudiante();
        Estudiante item = null;
        Estudiante nom = null;

        while (!pila.esVacio()){
            item = pila.eliminar();
            if(item.getNotaFinal() <item.getNotaFinal()){
                item=item;

            if(pila.nroElem()+1 == nuevaDireccion){
                nom = item;


            }else {
                aux.adicionar(item);
            }
        }
        pila.vaciar(aux);
        pila.adicionar(nom);
    }







    }
    public static void reordenaPila(PilaDeEstudiante pila,String cede){
        PilaDeEstudiante aux = new PilaDeEstudiante();
        PilaDeEstudiante cedeci = new PilaDeEstudiante();

        Estudiante item = null;

        while (!pila.esVacio()){
            item = pila.eliminar();

            if(item.getCI().endsWith(cede)){

                
                aux.adicionar(item);

            }else{
                cedeci.adicionar(item);
            }
        }
        pila.vaciar(cedeci);
        pila.vaciar(aux);
    }





}
