package EJERCICIOS.EJERCICIO_2;


public class Departamento {
    private String nombre;
    private int cantidadProvincias;

    public Departamento(String nombre, int cantidadProvincias) {
        this.nombre = nombre;
        this.cantidadProvincias = cantidadProvincias;
    }

    public Departamento() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadProvincias() {
        return cantidadProvincias;
    }

    public void setCantidadProvincias(int cantidadProvincias) {
        this.cantidadProvincias = cantidadProvincias;
    }
}