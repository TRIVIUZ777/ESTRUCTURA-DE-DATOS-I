package Student;

public class Student {


    private String fullname;
    private String lastname;

    private int age;

    public Student(String fullname,String lastname,int age)

    {
        this.fullname=fullname;
        this.lastname=lastname;
        this.age=age;
    }

    public String getFullName()
    {
        return this.fullname;

        //System.out.println("Nombre: "+this.fullname+this.lastname);
        //System.out.println();
    }

    public void setFullName(String fullname)
    {
        this.fullname=fullname;

        //System.out.println(lastname);
    }

    public String getLastName()
    {
        return this.lastname;

        //System.out.println("Nombre: "+this.fullname+this.lastname);
        //System.out.println();
    }

    public void setLastName(String lastname)
    {
        this.lastname=lastname;

        //System.out.println(lastname);
    }

    public int getAge()
    {
        return this.age;

        //System.out.println("Nombre: "+this.fullname+this.lastname);
        //System.out.println();
    }

    public void setAge(int age)
    {
        this.age=age;

        //System.out.println(lastname);
    }
}
