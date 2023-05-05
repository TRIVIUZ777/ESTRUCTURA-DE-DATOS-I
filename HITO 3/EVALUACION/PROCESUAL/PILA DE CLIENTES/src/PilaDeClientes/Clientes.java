package PilaDeClientes;

public class Clientes {private String nombre;
    private String apellido;
    private int edad;
    private String direccion;
    private String genero;

    public Clientes(String nombre, String apellido, int edad, String direccion, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}