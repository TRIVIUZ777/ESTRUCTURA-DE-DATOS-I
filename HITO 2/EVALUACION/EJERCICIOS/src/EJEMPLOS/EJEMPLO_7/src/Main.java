package EJEMPLOS.EJEMPLO_7.src;

public class Main {
    public static void main(String[] args) {
        Animal miPerro = new Perro();
        Animal miGato = new Gato();

        miPerro.hacerSonido(); // Imprime "Guau! Guau!"
        miGato.hacerSonido(); // Imprime "¡Miau! ¡Miau!"
    }
}
