package LAB_1;

public class MainPiladeNumeros {
    public static void main(String[] args) {

        PiladeNumeros pila = new PiladeNumeros();

        pila.adicionar(10);
        pila.adicionar(2);
        pila.adicionar(5);
        pila.adicionar(23);
        pila.adicionar(5);

        pila.mostrar();
        cambiarPosicion(pila);
        pila.mostrar();


    }


    public static int numeroMayor(PiladeNumeros pila) {
        PiladeNumeros aux = new PiladeNumeros();

        int num = 0;
        int max = 0;
//        int max = Integer.MIN_VALUE;

        while (!pila.esVacio()) {
            num = pila.eliminar();
            if (num > max) {
                max = num;
            }
            aux.adicionar(num);
        }
        pila.vaciar(aux);
        return max;
    }

    public static void numeros5(PiladeNumeros pila, int buscar) {
        PiladeNumeros aux = new PiladeNumeros();
        int num = 0;
        int cont = 0;

        while (!pila.esVacio()) {
            num = pila.eliminar();
            if (num == buscar) {
                cont++;
            }
            aux.adicionar(num);
        }
        pila.vaciar(aux);
        System.out.println("Cantidad: " + cont);
    }

    public static int numeroMenor(PiladeNumeros pila) {

        PiladeNumeros aux = new PiladeNumeros();

        int numActual = 0;
        int menor = pila.eliminar();
        pila.adicionar(menor);

//        int menor = Integer.MAX_VALUE;

        while (!pila.esVacio()) {

            numActual = pila.eliminar();

            if (numActual < menor) {
                menor = numActual;
            }

            aux.adicionar(numActual);

        }
        pila.vaciar(aux);
        return menor;

    }

    public static void cambiarPosicion(PiladeNumeros pila) {
        int numeroMayor1 = numeroMayor(pila);
        int numeroMenor = numeroMenor(pila);

        int numPila1 = 0;

//        System.out.println("Mayor: "+numeroMayor1);
//        System.out.println("Menor: "+numeroMenor);

        PiladeNumeros aux1 = new PiladeNumeros();


        while (!pila.esVacio()) {

            numPila1 = pila.eliminar();

            if (numeroMayor1 == numPila1) {
                aux1.adicionar(numeroMenor);
            } else if (numeroMenor == numPila1) {
                aux1.adicionar(numeroMayor1);
            } else {

                aux1.adicionar(numPila1);
            }

        }
        pila.vaciar(aux1);
    }

    public static void ContarNumParImpar(PiladeNumeros pila) {
        PiladeNumeros aux = new PiladeNumeros();
        int contPar = 0;
        int contImpar = 0;
        int numAct = 0;

        while (!pila.esVacio()) {
            numAct = pila.eliminar();

            if (numAct % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
            aux.adicionar(numAct);
        }
        pila.vaciar(aux);
        System.out.println("Pares: " + contPar);

        System.out.println("Impares: " + contImpar);
    }

    public static void agregarBase(PiladeNumeros pila, int agregar) {
        PiladeNumeros aux = new PiladeNumeros();
        int numAct = 0;

        aux.vaciar(pila);
        aux.adicionar(agregar);
        pila.vaciar(aux);
    }




}





