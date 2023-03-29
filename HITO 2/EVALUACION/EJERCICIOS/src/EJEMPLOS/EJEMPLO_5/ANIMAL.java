package EJEMPLOS.EJEMPLO_5;


public abstract class ANIMAL {
    protected String nombre;

    public ANIMAL(String nombre) {
        this.nombre = nombre;
    }

    public abstract void hacerSonido();
}

class Perro extends ANIMAL {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro " + nombre + " está ladrando.");
    }
}

class Gato extends ANIMAL {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato " + nombre + " está maullando.");
    }
}
