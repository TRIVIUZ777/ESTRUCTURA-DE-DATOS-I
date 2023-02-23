using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EstDat_Clas1
{
    internal class Program
    {
        static void Main(string[] args)
        {

            //Ejerci8cio1

            //Console.WriteLine("Bienvenido a la materia Estructura de Datos");


            //Ejercicio2

            //int num1 ;
            //int num2 ;
            //int num3 ;
            //int resultado;


            //num1=Convert.ToInt32(Console.ReadLine());
            //num2 = Convert.ToInt32(Console.ReadLine());
            //num3 = Convert.ToInt32(Console.ReadLine());
            //resultado = num1 + num2 + num3;

            //Console.WriteLine(resultado);

            //for (int i = 1;i <= 15; i++) 
            //{ 
            //Console.WriteLine(i+" ");
            //}

            //Ejercicio3

            //int num1 = Convert.ToInt32(Console.ReadLine());
            //if (num1 % 2 == 0)


            //{
            //    for (int i = 1; i == num1; i++)
            //    {
            //        if (i % 2 == 0)
            //        {
            //            Console.WriteLine(i + " ");
            //        }

            //    }
            //}

            //else


            //{
            //    for (int i = 1; i <= 15; i++)
            //    {
            //        if (i %2 != 0)
            //        {
            //            Console.WriteLine(i + " ");
            //        }
            //    }
            //}

        //    DIAGNOSTICO diaG = new DIAGNOSTICO();


        //    Console.ReadKey();
        //}



        static void Main(string[] args)
        {
            int a;
            a = Convert.ToInt32(Console.ReadLine());
            Diagnostico diag = new Diagnostico();
            switch (a)
            {
                case 1:
                    diag.Metodo_1();
                    break;
                case 2:
                    diag.Metodo_2();
                    break;
                case 3:
                    diag.Metodo_3();
                    break;
                case 4:
                    diag.Metodo_4();
                    break;
                case 5:
                    diag.Metodo_5();
                    break;

            }
            Console.ReadLine();
        }


        class Diagnostico
        {

            public Diagnostico()
            {

            }
            public void Metodo_1()
            {
                Console.WriteLine("Bienvanidos a la materia Estructura de Datos");
            }
            public void Metodo_2()
            {
                int a = 2, b = 2, c = 2;
                int s = a + b + c;
                Console.WriteLine(s);
            }
            public void Metodo_3()
            {
                int a, b, c, s;
                a = Convert.ToInt32(Console.ReadLine());
                b = Convert.ToInt32(Console.ReadLine());
                c = Convert.ToInt32(Console.ReadLine());
                s = a + b + c;
                Console.WriteLine(s);
            }
            public void Metodo_4()
            {
                for (int i = 1; i <= 15; i++)
                {
                    Console.WriteLine(i);
                }
            }
            public void Metodo_5()
            {
                int num1;
                num1 = Convert.ToInt32(Console.ReadLine());
                if (num1 % 2 == 0)
                {
                    for (int i = 1; i <= num1; i++)
                    {
                        if (i % 2 == 0)
                        {
                            Console.WriteLine(i);
                        }

                    }
                }
                else
                {
                    for (int i = 1; i <= num1; i++)
                    {
                        if (i % 2 != 0)
                        {
                            Console.WriteLine(i);
                        }

                    }
                }
            }
        }
        static void Main(string[] args)
        {
            int a;
            a = Convert.ToInt32(Console.ReadLine());
            Diagnostico diag = new Diagnostico();
            switch (a)
            {
                case 1:
                    diag.Metodo_1();
                    break;
                case 2:
                    diag.Metodo_2();
                    break;
                case 3:
                    diag.Metodo_3();
                    break;
                case 4:
                    diag.Metodo_4();
                    break;
                case 5:
                    diag.Metodo_5();
                    break;

            }
            Console.ReadLine();
        }


        class Diagnostico
        {

            public Diagnostico()
            {

            }
            public void Metodo_1()
            {
                Console.WriteLine("Bienvanidos a la materia Estructura de Datos");
            }
            public void Metodo_2()
            {
                int a = 2, b = 2, c = 2;
                int s = a + b + c;
                Console.WriteLine(s);
            }
            public void Metodo_3()
            {
                int a, b, c, s;
                a = Convert.ToInt32(Console.ReadLine());
                b = Convert.ToInt32(Console.ReadLine());
                c = Convert.ToInt32(Console.ReadLine());
                s = a + b + c;
                Console.WriteLine(s);
            }
            public void Metodo_4()
            {
                for (int i = 1; i <= 15; i++)
                {
                    Console.WriteLine(i);
                }
            }
            public void Metodo_5()
            {
                int num1;
                num1 = Convert.ToInt32(Console.ReadLine());
                if (num1 % 2 == 0)
                {
                    for (int i = 1; i <= num1; i++)
                    {
                        if (i % 2 == 0)
                        {
                            Console.WriteLine(i);
                        }

                    }
                }
                else
                {
                    for (int i = 1; i <= num1; i++)
                    {
                        if (i % 2 != 0)
                        {
                            Console.WriteLine(i);
                        }

                    }
                }
            }
        }
    }
}
