package Nombres;

public class Nombres
{

    private String paralelo;
    private String[] nombres;

    public Nombres (String paralelo,String[] nombres){
        this.paralelo = paralelo;
        this.nombres =nombres;

    }


    //-----------------------------------------------------------------
    public String getParalelo() {
        return paralelo;
    }

    public String[] getNombres() {
        return nombres;
    }


    //-----------------------------------------------------------------

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public void setNombres(String[] nombres) {
        this.nombres = nombres;
    }

    //-----------------------------------------------------------------

    public void Mostrar()
    {
        System.out.println("Mostrando clase");
        System.out.println("Universidad:"+this.getUniversidad());
        System.out.println("Paralelo:"+this.getParalelo());
        System.out.println("Edades:");
        //length =  es el numero de posiciones(TAMAÑO) de un array/ EL TAMAÑO DEL VECTOR
        for(int i=0; i<this.getEdades().length ; i++)
        {
            System.out.print(this.Edades[i]+ ",");

        }

        System.out.println();
    }

}
