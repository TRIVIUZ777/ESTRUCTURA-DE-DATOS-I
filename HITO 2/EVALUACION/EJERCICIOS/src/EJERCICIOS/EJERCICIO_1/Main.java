package EJERCICIOS.EJERCICIO_1;

public class Main {

    public static void main(String[] args){

        Provincia provincia = new Provincia("La Paz", 2200000, 133.985);
        System.out.println("Nombre: " + provincia.getNombre());
        System.out.println("Población: " + provincia.getPoblacion());
        System.out.println("Área: " + provincia.getArea() + " km²");

    }
}
