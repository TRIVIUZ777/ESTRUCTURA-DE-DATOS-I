package EJERCICIOS.EJERCICIO_4;

public class Main {

        public static void main(String[] args) {

            Pais bolivia = new Pais("Bolivia");

            // Agregar departamentos
            Departamento laPaz = new Departamento("La Paz");
            Departamento santaCruz = new Departamento("Santa Cruz");
            Departamento cochabamba = new Departamento("Cochabamba");

            bolivia.agregarNuevoDepartamento(laPaz);
            bolivia.agregarNuevoDepartamento(santaCruz);
            bolivia.agregarNuevoDepartamento(cochabamba);

            // Agregar provincias
            Provincia lp1 = new Provincia("La Paz 1");
            Provincia lp2 = new Provincia("La Paz 2");
            Provincia sc1 = new Provincia("Santa Cruz 1");
            Provincia sc2 = new Provincia("Santa Cruz 2");
            Provincia cb1 = new Provincia("Cochabamba 1");
            Provincia cb2 = new Provincia("Cochabamba 2");

            laPaz.agregarNuevaProvincia(lp1);
            laPaz.agregarNuevaProvincia(lp2);
            santaCruz.agregarNuevaProvincia(sc1);
            santaCruz.agregarNuevaProvincia(sc2);
            cochabamba.agregarNuevaProvincia(cb1);
            cochabamba.agregarNuevaProvincia(cb2);

            // Mostrar datos
            System.out.println("Datos del país:");
            System.out.println("Nombre: " + bolivia.getNombre());
            System.out.println("Número de departamentos: " + bolivia.getDepartamentos());

            for (Departamento departamento : bolivia.getDepartamentos()) {
                System.out.println(" - Departamento: " + departamento.getNombre());
                System.out.println("   Número de provincias: " + departamento.getProvincias());

                for (Provincia provincia : departamento.getProvincias()) {
                    System.out.println("   - Provincia: " + provincia.getNombre());
                }
            }

        }
}
