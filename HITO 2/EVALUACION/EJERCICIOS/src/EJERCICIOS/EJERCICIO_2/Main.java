package EJERCICIOS.EJERCICIO_2;

public class Main {
    public static void main(String[] args) {
        String[] nombresDepartamentos = {"La Paz", "Cochabamba", "Santa Cruz", "Oruro", "Potosí", "Chuquisaca", "Tarija", "Beni", "Pando"};

        int[] cantidadProvincias = {20, 16, 15, 16, 16, 10, 6, 8, 5};

        Departamento[] departamentos = new Departamento[nombresDepartamentos.length];

        for (int i = 0; i < nombresDepartamentos.length; i++) {
            departamentos[i] = new Departamento(nombresDepartamentos[i], cantidadProvincias[i]);
        }

        System.out.println("Datos de los departamentos de Bolivia: ");
        for (Departamento departamento : departamentos) {
            System.out.println("Nombre: " + departamento.getNombre() + ", Cantidad de provincias: " + departamento.getCantidadProvincias());
        }
    }
}


