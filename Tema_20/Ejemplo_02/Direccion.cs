using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PROYECTOCSHARP_CERTIFICADO.TEMA.Tema_20.Ejemplo_02
{
    class Direccion
    {
        public string calle {  get; set; }
        public int numero { get; set; }
        public string ciudad { get; set; }

        public Direccion() { }

        public Direccion(string calle, int numero, string ciudad)
        {
            this.calle = calle;
            this.numero = numero;
            this.ciudad = ciudad;
        }
    }
}
