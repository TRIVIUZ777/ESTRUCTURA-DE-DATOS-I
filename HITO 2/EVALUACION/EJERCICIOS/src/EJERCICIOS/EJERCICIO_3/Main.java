package EJERCICIOS.EJERCICIO_3;

import EJERCICIOS.EJERCICIO_2.Departamento;
public class Main {
    public static void main(String[] args) {
        Pais bolivia = new Pais();
        Departamento laPaz = bolivia.getDepartamentos().get(0);
        System.out.println("Datos del País:");
        System.out.println("Nombre: " + bolivia.getNombre());
        System.out.println("Cantidad de departamentos: " + bolivia.getDepartamentos().size());
        System.out.println();


        System.out.println("Datos del departamento de " + ((EJERCICIOS.EJERCICIO_3.Departamento) laPaz).getNombre() + ":");
        System.out.println("Nombre: " + ((EJERCICIOS.EJERCICIO_3.Departamento) laPaz).getNombre());



    }
}
