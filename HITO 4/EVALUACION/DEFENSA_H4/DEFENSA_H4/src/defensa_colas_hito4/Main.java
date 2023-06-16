package defensa_colas_hito4;

public class Main {
    public static void main(String[] args) {




        Cliente cliente1 = new Cliente("Adrian","Quispe",30,"Bolivia","Masculino","GOLD",6775623);
        Cliente cliente2 = new Cliente("Ana","Mamani",65,"Canada","Femenino","GOLD",6775624);
        Cliente cliente3 = new Cliente("Roberto","Quispe",40,"Reino Unido","Masculino","GOLD",6775625);
        Cliente cliente4 = new Cliente("Rosio","Calle",55,"Bolivia","Femenino","GOLD",6775634);
        Cliente cliente5 = new Cliente("Saul","Mamani",75,"Singapur","Masculino","VIP",6775627);


        ColaDeClientes colaA = new ColaDeClientes();
        colaA.adicionar(cliente1);
        colaA.adicionar(cliente2);
        colaA.adicionar(cliente3);
        colaA.adicionar(cliente4);
        colaA.adicionar(cliente5);




        //almacen de id
        int[] ids = {6775634, 6775627};

        Seleccionar2IddeLacolaClientesArray(colaA, ids);




        colaA.mostrar();





    }


    public static void convertirClientesDeGOLDdeBoliviaAVIP(ColaDeClientes colaA,String tipo){

        ColaDeClientes colAux = new ColaDeClientes();

        while (!colaA.esVacia()){
            Cliente cliente = colaA.eliminar();

            if (cliente.getTipo().equals(tipo) && cliente.getApellidos().startsWith("%M")&& cliente.getApellidos().endsWith("ni%")){
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



    public static void Seleccionar2IddeLacolaClientes(ColaDeClientes colaA, int id ){

        ColaDeClientes colAux = new ColaDeClientes();
        int nroElementos = colaA.nroElementos();

        for (int i = 0; i < nroElementos; i++){
            Cliente cliente = colaA.eliminar();

            if (cliente.getId()==id){
                colAux.eliminar();
            }else {
                colaA.adicionar(cliente);
            }

        }


    }


    public static void Seleccionar2IddeLacolaClientesArray(ColaDeClientes colaA, int[] ids) {
        ColaDeClientes colAux = new ColaDeClientes();
        int nroElementos = colaA.nroElementos();

        for (int i = 0; i < nroElementos; i++) {//caminamos en la colaA
            Cliente cliente = colaA.eliminar();

            boolean match = false;//para verificar la coincidencia de la id
            for (int id : ids) {
                if (cliente.getId() == id) {//caminamos en las ids de la colaA
                    match = true; //para verificar coincidencia
                    break;
                }
            }

            if (match) {
                colAux.eliminar();
            } else {
                colaA.adicionar(cliente);
            }
        }
    }






























}