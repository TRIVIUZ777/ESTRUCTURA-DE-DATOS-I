package defensa_pilas_hito3;

public class Estudiante {

    private  String nombres;
    private String apellidos;
    private int edad;
    private String sede;
    private  int notaFinal;
    private String CI;

    public Estudiante(String nombres, String apellidos, int edad, String sede, int notaFinal, String CI) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sede = sede;
        this.notaFinal = notaFinal;
        this.CI = CI;
    }
//--------------------------------------------------------------------------
    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getSede() {
        return sede;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public String getCI() {
        return CI;
    }

//-------------------------------------------------


    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }



    public void mostrarEstudiantes(){



            System.out.println("Mostrando Estudiante");
            System.out.println("nombres:"+nombres);
            System.out.println("apellidos:"+apellidos);
            System.out.println("edad:"+edad);
            System.out.println("sede:"+sede);
            System.out.println("notaFinal:"+notaFinal);
            System.out.println("CI:"+CI);
            System.out.println();



    }











}
