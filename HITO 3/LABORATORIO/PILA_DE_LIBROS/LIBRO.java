package PILA_DE_LIBROS;

public class LIBRO {
    private String autor;
    private int nroPag;
    private double precio;
    private  String tirulo;
    private String categoria;
//-----------CONSTRUCTOR----------------------------------------------------------------------------------------------------------

    public LIBRO(String autor, int nroPag, double precio, String tirulo, String categoria) {
        this.autor = autor;
        this.nroPag = nroPag;
        this.precio = precio;
        this.tirulo = tirulo;
        this.categoria = categoria;

    }
//----------GETTER----------------------------------------------------------------------------------------------------
    public String getAutor() {
        return autor;
    }

    public int getNroPag() {
        return nroPag;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTirulo() {
        return tirulo;
    }

    public String getCategoria() {
        return categoria;
    }
//----------SETTER------------------------------------------------------------------------------------------------------------------------------


    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNroPag(int nroPag) {
        this.nroPag = nroPag;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTirulo(String tirulo) {
        this.tirulo = tirulo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
//----------------------
    public void mostrarLibro(){

        System.out.println("Mostrando Libro");
        System.out.println("Autor:"+autor);
        System.out.println("NroPag:"+nroPag);
        System.out.println("Precio:"+precio);
        System.out.println("Titulo:"+tirulo);
        System.out.println("Categoria:"+categoria);
        System.out.println();
    }


}





