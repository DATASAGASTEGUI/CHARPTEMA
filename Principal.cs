using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PROYECTOCSHARP_CERTIFICADO.TEMA
{
    class Persona
    {
        public string Nombre { get; set; }
        public int Edad { get; set; }
        public float Altura { get; set; }

        // Constructor de la clase Persona
        public Persona(string nombre, int edad, float altura)
        {
            Nombre = nombre;
            Edad = edad;
            Altura = altura;
        }
    }

    class Principal
    {
        static void Main1(string[] args)
        {
            // Creación de una lista para almacenar objetos de tipo Persona
            List<Persona> personas = new List<Persona>();

            // Agregar personas a la lista
            personas.Add(new Persona("Juan", 30, 1.75f));
            personas.Add(new Persona("María", 25, 1.65f));
            personas.Add(new Persona("Carlos", 40, 1.80f));

            // Iterar sobre la lista y mostrar la información de cada persona
            foreach (Persona persona in personas)
            {
                Console.WriteLine("Nombre: " + persona.Nombre);
                Console.WriteLine("Edad: " + persona.Edad);
                Console.WriteLine("Altura: " + persona.Altura);
                Console.WriteLine();
            }
        }
    }
}
