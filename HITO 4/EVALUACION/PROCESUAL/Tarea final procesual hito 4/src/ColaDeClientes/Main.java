package ColaDeClientes;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Juan","Quispe",30,"Bolivia","Masculino","GOLD");
        Cliente cliente2 = new Cliente("Ana","Mamani",65,"Canada","Femenino","VIP");
        Cliente cliente3 = new Cliente("Max","Quispe",40,"Reino Unido","Masculino","GOLD");
        Cliente cliente4 = new Cliente("Rosio","Calle",65,"Bolivia","Femenino","GOLD");
        Cliente cliente5 = new Cliente("Saul","Condori",45,"Singapur","Masculino","VIP");


        ColaDeClientes colaA = new ColaDeClientes();
        colaA.adicionar(cliente1);
        colaA.adicionar(cliente2);
        colaA.adicionar(cliente3);
        colaA.adicionar(cliente4);
        colaA.adicionar(cliente5);


        Cliente cliente6 = new Cliente("Saul","Lopez",55,"España","Masculino","GOLD");
        Cliente cliente7 = new Cliente("Pedro","Gomez",70,"Argentina","Masculino","VIP");
        Cliente cliente8 = new Cliente("Laura","Fernandez",45,"Colombia","Femenino","GOLD");
        Cliente cliente9 = new Cliente("Saul","Perez",65,"Mexico","Masculino","GOLD");
        Cliente cliente10 = new Cliente("Isabel","Santos",35,"Brasil","Femenino","VIP");


        ColaDeClientes colaB = new ColaDeClientes();
        colaB.adicionar(cliente6);
        colaB.adicionar(cliente7);
        colaB.adicionar(cliente8);
        colaB.adicionar(cliente9);
        colaB.adicionar(cliente10);


        moverClientesSaulAlIniColaB(colaA,colaB);


        colaB.mostrar();

        System.out.println("-----------------------------------------------------------------------");
        //colaB.mostrar();






    }

    public static void convertirClientesDeGOLDdeBoliviaAVIP(ColaDeClientes colaA, String nacionalidad ,String tipo){

        ColaDeClientes colAux = new ColaDeClientes();

        while (!colaA.esVacia()){
            Cliente cliente = colaA.eliminar();

            if (cliente.getTipo().equals(tipo) && cliente.getPais().equals(nacionalidad)){
                cliente.setTipo("VIP");
            }
            colAux.adicionar(cliente);

        }
        colaA.vaciar(colAux);


    }


    public static void moverAlPrincipioClienteMayor60Años(ColaDeClientes colaA, int edad ){

        ColaDeClientes colAux = new ColaDeClientes();
        int nroElementos = colaA.nroElementos();

        for (int i = 0; i < nroElementos; i++){
            Cliente cliente = colaA.eliminar();

            if (cliente.getEdad()>edad){
                colaA.adicionar(cliente);
            }else {
                colAux.adicionar(cliente);
            }

        }
        colaA.vaciar(colAux);

    }



    public static void moverClientesSaulAlIniColaB(ColaDeClientes colaA,ColaDeClientes colaB){

        ColaDeClientes colAux1 = new ColaDeClientes();
        ColaDeClientes colAux2 = new ColaDeClientes();

        int nroClientesA = colaA.nroElementos();

        for (int i = 0; i < nroClientesA; i++){
            Cliente cliente = colaA.eliminar();

            if (cliente.getNombres().equals("Saul")){
                colAux1.adicionar(cliente);
            }else {
                colaA.adicionar(cliente);
            }

        }

        int nroClientesB = colaB.nroElementos();
        for (int i = 0; i < nroClientesB; i++){
            Cliente cliente = colaB.eliminar();

            if (cliente.getNombres().equals("Saul")){
                colAux1.adicionar(cliente);
            }else {
                colAux2.adicionar(cliente);
            }

        }


        int nroClientes1 = colAux1.nroElementos();
        for (int i = 0; i < nroClientes1; i++){
            Cliente cliente = colAux1.eliminar();
            colaB.adicionar(cliente);



        }


        int nroClientes2 = colAux2.nroElementos();
        for (int i = 0; i < nroClientes2; i++){
            Cliente cliente = colAux2.eliminar();
            colaB.adicionar(cliente);



        }



    }













}