package Nombres;

import EDADES.Edades;

class MainNombres {

    public static void main(String[] args) {

        String[] nombre = new String[5];
        nombre[0] ="Ana";
        nombre[1] ="Juan";
        nombre[2] ="Pepito";
        nombre[3] ="Carla";
        nombre[4] ="Freddy";

        Nombres obj1= new Nombres("EDD",nombre);


        ContarNombres(obj1);
        obj1.Mostrar();

        //Crear un metodo estatico que determine cuantas personas
        //del paralelo EDD tiene el nombre pepito


    }

    public static int ContarNombres(Nombres obj1){



        String[] nom = new String[0];


        String[] nombre = obj1.getNombres();
        for (String estudiante : nombre) {
            if (estudiante.equals("pepito")) {
                nom = nombre;
            }
        }
        return nom;
    }

}