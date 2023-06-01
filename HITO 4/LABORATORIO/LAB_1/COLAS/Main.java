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





        eliminarNumerosRepetidos(cola);
        cola.mostrar(); // Output: Cola de números: 5 9 12 15
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

        cola.vaciar(aux); // Restaurar la cola original

        for (int num : contadorNumeros.keySet()) {
            if (contadorNumeros.get(num) == 1) {
                cola.adicionar(num);
            }
        }
    }
}





