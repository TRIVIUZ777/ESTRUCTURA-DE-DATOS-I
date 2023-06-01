package LAB_1.COLAS;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Main {
    public static void main(String[] args) {
        ColaDeNumeros cola = new ColaDeNumeros();



        cola.adicionar(4);
        cola.adicionar(12);
        cola.adicionar(8);
        cola.adicionar(6);
        cola.adicionar(4);
        cola.adicionar(1);


        eliminarNumerosRepe(cola);
        System.out.println(verificaSiExisteUnoMas(cola,4));
        cola.mostrar();
    }
    public static int contarMultiplosDeTres(ColaDeNumeros cola,int multiplo) {
        int contador = 0;
        ColaDeNumeros aux = new ColaDeNumeros();

        while (!cola.esVacia()) {
            int num = cola.eliminar();
            aux.adicionar(num);

            if (num % multiplo == 0) {
                contador++;
            }
        }

        cola.vaciar(aux); // Restaurar la cola original

        return contador;
    }

    public static int contarMultiplosDeTrs(ColaDeNumeros cola,int multiplo) {
        int cont = 0;
        int item = 0;
        ColaDeNumeros aux = new ColaDeNumeros();

        while (cola.esVacia()) {
            item = cola.eliminar();
            if (item % multiplo == 0) {
                cont++;
            }
            aux.adicionar(item);
        }
        cola.vaciar(aux);
        System.out.println("Hay " + cont + " estudiante aprobado con nota mayor a " + cola);


        return cont;
    }

    public static void eliminarNumerosRepetidos(ColaDeNumeros cola) {
        ColaDeNumeros aux = new ColaDeNumeros();
        Map<Integer, Integer> contadorNumeros = new HashMap<>();

        while (!cola.esVacia()) {
            int num = cola.eliminar();
            aux.adicionar(num);

            contadorNumeros.put(num, contadorNumeros.getOrDefault(num, 0) + 1);
        }

        //cola.vaciar(aux); // Restaurar la cola original

        for (int num : contadorNumeros.keySet()) {
            if (contadorNumeros.get(num) == 1) {
                cola.adicionar(num);
            }
        }
    }

    public static void eliminarNumerosRepet(ColaDeNumeros cola) {
        int nroElem = cola.nroElementos();

        for (int i = 0; i <= nroElem; i++) {
            int num = cola.eliminar();
            boolean existeRepetido = verificaSiExisteUnoMas(cola, num);

            if (!existeRepetido) {
                cola.adicionar(num);
            }
        }
    }



    public static void eliminarNumerosRepe(ColaDeNumeros cola) {
        int nroElem =   cola.nroElementos();
        int item ;

        for (int i=1; i<= nroElem; i++){
            item = cola.eliminar();

            if (verificaSiExisteUnoMas(cola,item)==false){
            //System.out.println("Num = "+ item);

            cola.adicionar(item);}

        }

        //System.out.println(cola.getFin());
        //System.out.println(cola.getIni());


    }

    public static boolean verificaSiExisteUnoMas(ColaDeNumeros cola, int num){

        int cont = 0;
        int item;
        int nroElem = cola.nroElementos();

        for (int i=1; i<=nroElem; i++){
            item = cola.eliminar();


            if (item == num){
                cont = cont +1;


            }else {

                cola.adicionar(item);


            }

        }
        if (cont>0){

            return true;
        }
        else {

            return false;
        }



    }


}





