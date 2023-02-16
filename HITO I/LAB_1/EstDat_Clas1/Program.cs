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

            DIAGNOSTICO diaG = new DIAGNOSTICO();


            Console.ReadKey();
        }

        

        public class DIAGNOSTICO
        {
            public int num1;
            public int num2;
            public int num3;
            
            public int resultado;
            public void Bienvenido(int num1, int num2, int num3, int resultado)
                {
                Console.WriteLine("Bienvenido a la materia Estructura de Datos");
            }

            public void Sum3Num(int num1, int num2, int num3,  int resultado) 
            {
                num1 = 9;
                num2 = 4;
                num3 = 11;
                resultado = num1 + num2 + num3;

            }

            public void Sum3NumTecl(int num1, int num2, int num3, int resultado)
            {
                num1 = Convert.ToInt32(Console.ReadLine());
                num2 = Convert.ToInt32(Console.ReadLine());
                num3 = Convert.ToInt32(Console.ReadLine());
                resultado = num1 + num2 + num3;

            }

            public void NumNat(int num1, int num2, int num3, int resultado)
            {

                for (int i = 1; i <= 15; i++)
                {
                    Console.WriteLine(i + " ");
                }

            }

            public void NumParOInp(int num1, int num2, int num3, int resultado)
            {

                num1 = Convert.ToInt32(Console.ReadLine());
                if (num1%2 == 0)


                {
                    for (int i = 1; i == num1; i++)
                    {
                        if (i%2 == 0)
                        {
                            Console.WriteLine(i + " ");
                        }

                    }
                }

                else


                {
                    for (int i = 1; i <= 15; i++)
                    {
                        if (i % 2 != 0)
                        {
                            Console.WriteLine(i + " ");
                        }
                    }
                }


            }
        }
    }
}
