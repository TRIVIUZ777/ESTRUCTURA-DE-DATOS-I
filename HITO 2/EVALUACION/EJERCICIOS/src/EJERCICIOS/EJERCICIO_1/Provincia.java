package EJERCICIOS.EJERCICIO_1;

public class Provincia {
    private String nombre;
    private int poblacion;
    private double area;

    public Provincia() {
    }

    public Provincia(String nombre, int poblacion, double area) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.area = area;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}