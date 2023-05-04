package PilaDeClientes;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Clientes cliente1 = new Clientes("Jose", "Martinez", 28, "Plaza de la Victoria", "Masculino");
        Clientes cliente2 = new Clientes("Mateo", "Lopez", 32, "Calle del Misterio", "Masculino");
        Clientes cliente3 = new Clientes("Andrea", "Choque", 26, "Calle Gregorio Lanza", "Femenino");
        Clientes cliente4 = new Clientes("Ana", "Quiroz", 19, "Av. 6 de Agosto", "Femenino");
        Clientes cliente5 = new Clientes("Miguel Angel", "Patti", 39, "Av. Ayo Ayo", "Masculino");


        PilaClientes pila = new PilaClientes();
        pila.adicionar(cliente1);
        pila.adicionar(cliente2);
        pila.adicionar(cliente3);
        pila.adicionar(cliente4);
        pila.adicionar(cliente5);

         //pila.mostrar();

        //mayoresCiertaEdad(pila, 30);

          //kEsimoPosicion(pila, 2);
          //pila.mostrar();

        //asignaDireccion(pila, "JAJAJJA","Femenino");
        //pila.mostrar();


        reordenaPila(pila);
        pila.mostrar();

    }
    public static void mayoresCiertaEdad(PilaClientes pila, int edad){
        PilaClientes aux = new PilaClientes();

        Clientes item = null;
        int cont = 0;

        while (!pila.esVacio()){
            item = pila.eliminar();

            if(item.getEdad() > edad){
                cont++;
            }

            aux.adicionar(item);
        }
        pila.vaciar(aux);
        System.out.println("Hay " + cont +" clientes con la edad mayor a "+ edad);
    }
    public static void kEsimoPosicion(PilaClientes pila, int nuevaDireccion){
        PilaClientes aux = new PilaClientes();
        Clientes item = null;
        Clientes nom = null;

        while (!pila.esVacio()){
            item = pila.eliminar();
            if(pila.nroElem()+1 == nuevaDireccion){
                nom = item;
            }else {
                aux.adicionar(item);
            }
        }
        pila.vaciar(aux);
        pila.adicionar(nom);
    }
    public static void asignaDireccion(PilaClientes pila, String nuevaDireccion,String genero){
        PilaClientes aux = new PilaClientes();

        Clientes item = null;
        while (!pila.esVacio()){
            item = pila.eliminar();

            if(item.getGenero().equals(genero)){
                item.setDireccion(nuevaDireccion);
                aux.adicionar(item);
            }
            else {
                aux.adicionar(item);
            }
        }
        pila.vaciar(aux);

    }
    public static void reordenaPila(PilaClientes pila){
        PilaClientes masculino = new PilaClientes();
        PilaClientes femenino = new PilaClientes();

        Clientes item = null;

        while (!pila.esVacio()){
            item = pila.eliminar();

            if(Objects.equals(item.getGenero(), "Masculino")){
                masculino.adicionar(item);

            }else{
                femenino.adicionar(item);
            }
        }
        pila.vaciar(masculino);
        pila.vaciar(femenino);
    }
}
