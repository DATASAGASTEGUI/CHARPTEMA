using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PROYECTOCSHARP_CERTIFICADO.TEMA.Tema_07
{
    class Circulo
    {
        public static float area(float radio)
        {
            float valorArea = (float)(Math.PI * Math.Pow(radio, 2));
            return valorArea;
        }

        public float areaCirculo(float radio)
        {
            float valorArea = (float)(Math.PI * Math.Pow(radio, 2));
            return valorArea;
        }
    }
}
