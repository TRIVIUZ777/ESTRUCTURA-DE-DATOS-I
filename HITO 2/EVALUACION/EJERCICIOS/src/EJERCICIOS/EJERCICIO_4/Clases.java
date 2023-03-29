package EJERCICIOS.EJERCICIO_4;

import java.util.ArrayList;

class Pais {
    private String nombre;
    private ArrayList<Departamento> departamentos;

    public Pais() {
        this.nombre = "";
        this.departamentos = new ArrayList<>();
    }

    public Pais(String nombre) {
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(ArrayList<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public void agregarNuevoDepartamento(Departamento departamento) {
        this.departamentos.add(departamento);
    }

    @Override
    public String toString() {
        return "País: " + nombre + "\n" + "Departamentos: " + departamentos.size();
    }
}

class Departamento {
    private String nombre;
    private ArrayList<Provincia> provincias;

    public Departamento() {
        this.nombre = "";
        this.provincias = new ArrayList<>();
    }

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.provincias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(ArrayList<Provincia> provincias) {
        this.provincias = provincias;
    }

    public void agregarNuevaProvincia(Provincia provincia) {
        this.provincias.add(provincia);
    }

    @Override
    public String toString() {
        return "Departamento: " + nombre + "\n" + "Provincias: " + provincias.size();
    }
}

class Provincia {
    private String nombre;

    public Provincia() {
        this.nombre = "";
    }

    public Provincia(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Provincia: " + nombre;
    }
}