using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Newtonsoft.Json.Linq;

// Install-Package Newtonsoft.Json

namespace PROYECTOCSHARP_CERTIFICADO.TEMA.Tema_19
{
    class Principal
    {
        static void Main(string[] args)
        {
            string ruta_relativa = @"data/persona.json";
            using (StreamReader sr = new StreamReader(ruta_relativa))
            {
                string json = sr.ReadToEnd();
                dynamic datos = JObject.Parse(json);
                string nombre = datos.nombre;
                int edad = datos.edad;
                double estatura = datos.estatura;
                bool casado = datos.casado;
                char sexo = Convert.ToChar(datos.sexo);
                Console.WriteLine(nombre + " " + edad + " " + estatura + " " + casado + " " + sexo);

            }
        }
    }
}
