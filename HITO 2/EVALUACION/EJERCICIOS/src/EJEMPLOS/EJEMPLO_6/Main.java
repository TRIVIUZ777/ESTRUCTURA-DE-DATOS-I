package EJEMPLOS.EJEMPLO_6;

public class Main {

    public static void main(String[] args) {

        Coche miCoche = new Coche("Toyota", "Corolla", 2021, "rojo");

        System.out.println("Mi coche es un " + miCoche.marca + " " + miCoche.modelo + " del año " + miCoche.año + " y de color " + miCoche.getColor());

        miCoche.cambiarColor("azul");

        System.out.println("Ahora mi coche es de color " + miCoche.getColor());

        miCoche.arrancar();

    }
}

