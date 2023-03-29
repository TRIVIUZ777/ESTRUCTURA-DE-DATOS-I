package EJERCICIOS.EJERCICIO_3;

import java.util.ArrayList;
import java.util.List;

class Departamento extends EJERCICIOS.EJERCICIO_2.Departamento {
    private String nombre;

    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
public class Pais {
    private String nombre;
    private List<Departamento> departamentos;

    public Pais() {
        this.nombre = "Bolivia";
        this.departamentos = new ArrayList<>();
        this.departamentos.add(new Departamento("La Paz"));
        this.departamentos.add(new Departamento("Cochabamba"));
        this.departamentos.add(new Departamento("Santa Cruz"));
        this.departamentos.add(new Departamento("Oruro"));
        this.departamentos.add(new Departamento("Potosí"));
        this.departamentos.add(new Departamento("Chuquisaca"));
        this.departamentos.add(new Departamento("Tarija"));
        this.departamentos.add(new Departamento("Beni"));
        this.departamentos.add(new Departamento("Pando"));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }


}