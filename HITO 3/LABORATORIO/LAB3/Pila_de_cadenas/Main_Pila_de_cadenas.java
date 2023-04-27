package Pila_de_cadenas;


import LAB_1.PiladeNumeros;

public class Main_Pila_de_cadenas {
    public static void main(String[] args) {



        Pila_de_cadenas nombresEDD = new Pila_de_cadenas();

        nombresEDD.adicionar("Wiliam");
        nombresEDD.adicionar("Andres");
        nombresEDD.adicionar("Josias");
        nombresEDD.adicionar("Iris");
        nombresEDD.adicionar("Jhonatan");
        nombresEDD.adicionar("Ilia");


//        nombresEDD.llenar(6);

        moverElemento(nombresEDD,3);
        nombresEDD.mostrar();



    }

    public static void contaNombre(Pila_de_cadenas pila,String nombre) {
        Pila_de_cadenas aux = new Pila_de_cadenas();
        String itemEliminado = " ";
        int nonCont = 0;

        while (!pila.esVacio()) {

             itemEliminado = pila.eliminar();


                if (itemEliminado.equals(nombre)){
                    nonCont = nonCont +1;
                }
                aux.adicionar(itemEliminado);
        }
        pila.vaciar(aux);
        System.out.println("El nombre "+nombre +" se repite " + nonCont+" veces");


    }

    public static void añadeNombreEntreJosiasyAndres(Pila_de_cadenas pila,String nomAñand){

        Pila_de_cadenas aux = new Pila_de_cadenas();
        String nom;
        while (!pila.esVacio()){
            nom=pila.eliminar();
            if (nom.equals("Josias")){
                aux.adicionar(nom);
                aux.adicionar(nomAñand);
                
            }
            else {
                aux.adicionar(nom);
            }
        }
        pila.vaciar(aux);

        

    }



    public static void intercambiaritems(Pila_de_cadenas pila){
        Pila_de_cadenas aux = new Pila_de_cadenas();
        String item1 = pila.eliminar();
        aux.vaciar(pila);
        String item2 = aux.eliminar();
        pila.adicionar(item1);
        pila.vaciar(aux);
        pila.adicionar(item2);

    }

    public  static void moverElemento(Pila_de_cadenas pila,int kaesimo){
        Pila_de_cadenas aux = new Pila_de_cadenas();
        String nomKaesimo="";
        String itemeliminado ="";

        while (!pila.esVacio()){
            itemeliminado=pila.eliminar();
            if (pila.nroElem()+1==kaesimo){

                nomKaesimo=itemeliminado;
            }
            else {
                aux.adicionar(itemeliminado);
            }




        }
        pila.vaciar(aux);
        pila.adicionar(nomKaesimo);

    }





}