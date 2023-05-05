package PilaDeClientes;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Clientes cliente1 = new Clientes("Juan", "Martinez", 19, "Av. Cochabanba", "Masculino");
        Clientes cliente2 = new Clientes("Roberto", "Quiroz", 28, "Av. 6 de Agosto", "Femenino");
        Clientes cliente3 = new Clientes("luis", "Patti", 39, "Av. 7 de Marzo", "Masculino");
        Clientes cliente4 = new Clientes("Ana", "Choque", 22, "Calle Gregorio Lanza", "Femenino");
        Clientes cliente5 = new Clientes("Adrian", "Lopez", 32, "Calle San Miguel", "Masculino");


        PilaClientes pila = new PilaClientes();
        pila.adicionar(cliente1);
        pila.adicionar(cliente2);
        pila.adicionar(cliente3);
        pila.adicionar(cliente4);
        pila.adicionar(cliente5);

         //pila.mostrar();

        //mayoresCiertaEda(pila, 20);

          kEsimoPosicion(pila, 3);
         pila.mostrar();

        //asignaDireccion(pila, "Plaza Jualian Apaza","Femenino");
        //pila.mostrar();


        //reordenaPila(pila);
        //4pila.mostrar();

    }

    public static void mayoresCiertaEda(PilaClientes pila, int edad) {
        PilaClientes aux = new PilaClientes();
        Clientes item = null;
        int cont = 0;

        // Pasa los elementos de la pila a la aux en orden inverso
        while (!pila.esVacio()) {
            item = pila.eliminar();
            aux.adicionar(item);
        }

        // Busca los elementos mayores que la edad y cuenta cuántos hay
        while (!aux.esVacio()) {
            item = aux.eliminar();

            if (item.getEdad() > edad) {
                cont++;
            }

            pila.adicionar(item);
        }

        System.out.println("Hay " + cont + " clientes con la edad mayor a " + edad);
    }








    public static void kEsimoPosicion(PilaClientes pila, int nuevaDireccion){
        PilaClientes aux = new PilaClientes();
        Clientes item = null;
        Clientes nom = null;

        while (!pila.esVacio()){
            // se eliminan los elementos de la pila original y se almacenan en la variable item
            item = pila.eliminar();
            // se evalúa si el elemento actual es el de la posición k
            if(pila.nroElem()+1 == nuevaDireccion){
                nom = item;
            }else {
                // se agrega el elemento actual a la pila auxiliar
                aux.adicionar(item);
            }
        }
        pila.vaciar(aux);
        pila.adicionar(nom);
    }
    public static void asignaDireccion(PilaClientes pila, String nuevaDireccion,String genero){
        PilaClientes aux = new PilaClientes();

        Clientes item = null;

        // Se recorre la pila original hasta que esté vacía
        while (!pila.esVacio()) {
            // Se obtiene el siguiente elemento de la pila original y se almacena en la variable temporal
            item = pila.eliminar();

            // Si el género del elemento es igual al género especificado, se cambia la dirección del elemento
            // y se agrega a la pila auxiliar
            if (item.getGenero().equals(genero)) {
                item.setDireccion(nuevaDireccion);
                aux.adicionar(item);
            }
            // Si el género del elemento no es igual al género especificado, se agrega directamente a la pila auxiliar
            else {
                aux.adicionar(item);
            }
        }
        pila.vaciar(aux);

    }
    public static void reordenaPila(PilaClientes pila){
        // Se crean dos pilas vacías: una para clientes masculinos y otra para clientes femeninos
        PilaClientes masculino = new PilaClientes();
        PilaClientes femenino = new PilaClientes();

        Clientes item = null;

        // Se recorre la pila original y se van extrayendo los elementos uno por uno
        while (!pila.esVacio()){
            item = pila.eliminar();

            // Si el género del cliente es masculino, se agrega a la pila de clientes masculinos
            if(Objects.equals(item.getGenero(), "Masculino")){
                masculino.adicionar(item);
            }
            // Si el género del cliente es femenino, se agrega a la pila de clientes femeninos
            else{
                femenino.adicionar(item);
            }
        }

        // Se vacía la pila original y se agregan primero los clientes masculinos, y luego los femeninos
        pila.vaciar(masculino);
        pila.vaciar(femenino);
    }
}
