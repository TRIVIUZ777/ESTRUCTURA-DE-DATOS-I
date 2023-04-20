package LAB_1;

public class PiladeNumeros {

    private int max;     //cantidad maxima
    private int tope;    //elementos
    private int[] numeros;

    public PiladeNumeros()
    {
        this.max=10;
        this.tope=0;
        this.numeros=new int [this.max+1];
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
    public  int adicionar(int nuevoNum)
    {
        if(esLleno()==true){
            System.out.println("PILA LLENA");
        }else{
            tope=tope+1;
            numeros[tope]=nuevoNum;
        }
        return nuevoNum;
    }
    public int eliminar()
    {
        int itemEliminado=0;
        if(esVacio()==true){
            System.out.println("PILA VACIA");
        }else{
            itemEliminado=numeros[tope];
            tope=tope-1;
        }
        return itemEliminado;
    }

    public static void llenar(int n)
    {

    }
    public void mostrar()
    {
        int item=0;
        if(esVacio())
        {
            System.out.println("No hay items que mostrar");
        }else{
            System.out.println("Mostrando la PILA DE NUMEROS: ");
            PiladeNumeros aux=new PiladeNumeros();
            while(!esVacio()){
                item = eliminar();
                System.out.print(item+", ");
                aux.adicionar(item);
            }
            vaciar(aux);
        }


    }
    public void vaciar(PiladeNumeros pila)
    {
        while (!pila.esVacio()) {
            adicionar(pila.eliminar());
        }
    }
public static int numeroMayor(PiladeNumeros pila){
        PiladeNumeros aux = new PiladeNumeros();

        int num = 0;
        int max = 0;
//        int max = Integer.MIN_VALUE;

        while(!pila.esVacio() ){
            num = pila.eliminar();
            if(num > max){
                max = num;
            }
            aux.adicionar(num);
        }
        pila.vaciar(aux);
        return max;
    }
    public static void numeros5(PiladeNumeros pila, int buscar){
        PiladeNumeros aux = new PiladeNumeros();
        int num = 0;
        int cont = 0;

        while (!pila.esVacio()){
            num = pila.eliminar();
            if(num == buscar){
                cont++;
            }
            aux.adicionar(num);
        }
        pila.vaciar(aux);
        System.out.println("Cantidad: "+cont);
    }
    public static int numeroMenor(PiladeNumeros pila){

        PiladeNumeros aux = new PiladeNumeros();

        int numActual = 0;
        int menor = pila.eliminar();
        pila.adicionar(menor);

//        int menor = Integer.MAX_VALUE;

        while (!pila.esVacio()) {

            numActual =pila.eliminar();

            if (numActual < menor)
            {
                menor = numActual;
            }

            aux.adicionar(numActual);

        }
        pila.vaciar(aux);
        return menor;

    }
    public static void cambiarPosicion(PiladeNumeros pila){
        int numeroMayor1 = numeroMayor(pila);
        int numeroMenor = numeroMenor(pila);

        int numPila1 = 0;

//        System.out.println("Mayor: "+numeroMayor1);
//        System.out.println("Menor: "+numeroMenor);

        PiladeNumeros aux1 = new PiladeNumeros();


        while (!pila.esVacio()){

            numPila1 = pila.eliminar();

            if(numeroMayor1 ==numPila1){
                aux1.adicionar(numeroMenor);
            }

            else if(numeroMenor == numPila1){
                aux1.adicionar(numeroMayor1);
            }
            else {

                aux1.adicionar(numPila1);
            }

        }
        pila.vaciar(aux1);
    }
    public static void ContarNumParImpar(PiladeNumeros pila){
        PiladeNumeros aux = new PiladeNumeros();
        int contPar = 0;
        int contImpar = 0;
        int numAct = 0;

        while (!pila.esVacio()){
            numAct = pila.eliminar();

            if(numAct%2 == 0){
                contPar++;
            }
            else{
                contImpar++;
            }
            aux.adicionar(numAct);
        }
        pila.vaciar(aux);
        System.out.println("Pares: "+ contPar);

        System.out.println("Impares: "+ contImpar);
    }
    public static void k(PiladeNumeros pila, int agregar){
        PiladeNumeros aux = new PiladeNumeros();
        int numAct = 0;

        aux.vaciar(pila);
        aux.adicionar(agregar);
        pila.vaciar(aux);
    }




    }





