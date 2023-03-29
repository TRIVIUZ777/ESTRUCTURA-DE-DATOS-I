package EJEMPLOS.EJEMPLO_6;


class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int año;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void arrancar() {
        System.out.println("El vehículo está arrancando.");
    }

    public void detener() {
        System.out.println("El vehículo se está deteniendo.");
    }
}

class Coche extends Vehiculo {
    private String color;

    public Coche(String marca, String modelo, int año, String color) {
        super(marca, modelo, año);
        this.color = color;
    }

    public void cambiarColor(String nuevoColor) {
        this.color = nuevoColor;
    }

    public String getColor() {
        return this.color;
    }
}

