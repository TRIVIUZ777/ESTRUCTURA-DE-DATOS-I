package EJEMPLOS.EJEMPLO_7.src;
// Clase Animal
class Animal {
    public void hacerSonido() {
        // Cuerpo vacío
    }
}

// Clase Perro (hereda de Animal)
class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Guau! Guau!");
    }
}

// Clase Gato (hereda de Animal)
class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("¡Miau! ¡Miau!");
    }
}

