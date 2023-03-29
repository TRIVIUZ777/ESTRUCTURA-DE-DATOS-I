package EJEMPLOS.EJEMPLO_4;

public class Main {

    public static void main(String[] args) {

        COCHE miCoche = new COCHE("Toyota", 2021, "rojo");

        System.out.println("Mi coche es un " + miCoche.getModelo() + " del año " + miCoche.getAño() + " y de color " + miCoche.getColor());

        miCoche.setColor("azul");

        System.out.println("Ahora mi coche es de color " + miCoche.getColor());

    }
}

