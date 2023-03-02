
import Math_utils.Math_utils;
import Student.Student;
import java.util.*;

class main {

    public static void main(String[] args)
    {
        Scanner full=new Scanner(System.in);
        Scanner last=new Scanner(System.in);
        Scanner age=new Scanner(System.in);


        String fullname= full.nextLine();
        String lastname= last.nextLine();
        int Age = age.nextInt();

        Student st = new Student(fullname,lastname,Age);

        st.getFullName();

        st.getLastName();
        //st.setLastName();
        st.getAge();
        //st.setAge();


        String nombre = st.getFullName();
        System.out.println("nombre:" + nombre);

        st.setFullName("Pepito");

        String nomCamb= st.getFullName();
        System.out.println("nuevo nombre:" + nomCamb);




        String Apellido = st.getLastName();
        System.out.println("Apellido:" + Apellido);

        st.setLastName("pep1");

        String ApeCamb= st.getLastName();
        System.out.println("Nuevo apellido:" + ApeCamb);


        //Cambiar edad

        int Edad = st.getAge();
        System.out.println("Edad:" + Edad);

        st.setAge(30);

        int EDCamb= st.getAge();
        System.out.println("Nueva edad:" + EDCamb);



        //Scanner leer=new Scanner(System.in);
        //// TODO Auto-generated method stub
        //String nameAPP=leer.next();;
        //String version=leer.next();;
        //int year=leer.nextInt();
        //int limite;
        //String ci;
        //Math_utils mu = new Math_utils(nameAPP,version,year);
//
        //mu.printAPP();
        //System.out.println();
//
        //limite = leer.nextInt();
        //mu.generateNaturaleNumbers(limite);
//
        //limite = leer.nextInt();
        //mu.generatePairNumbers(limite);
//
        //ci = leer.next();
        //mu.generateExtensionFromCI(ci);
//
    }

}
