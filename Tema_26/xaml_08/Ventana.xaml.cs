using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;

namespace WPF_CERTIFICADO.Tema_26.xaml_08
{
    /// <summary>
    /// Lógica de interacción para Ventana.xaml
    /// </summary>
    public partial class Ventana : Window
    {
        int[] preguntas = {0,1,2,3};
        double[] puntos = {0,0,0,0};
        RadioButton[][] opciones = new RadioButton[4][];



        public Ventana()
        {
            InitializeComponent();
            // Inicializar cada elemento del arreglo opciones
            for (int i = 0; i < opciones.Length; i++)
            {
                opciones[i] = new RadioButton[4];
            }

            opciones[0][0] = rbParis;
            opciones[0][1] = rbMadrid;
            opciones[0][2] = rbLisboa;
            opciones[0][3] = rbLondres;

            opciones[1][0] = rbNilo; 
            opciones[1][1] = rbEufrates;
            opciones[1][2] = rbAmazonas;
            opciones[1][3] = rbOrinoco;

            opciones[2][0] = rbIndia; 
            opciones[2][1] = rbChina;
            opciones[2][2] = rbBrasil;
            opciones[2][3] = rbNigeria;

            opciones[3][0] = rbRusia; 
            opciones[3][1] = rbChina1;
            opciones[3][2] = rbIndia1;
            opciones[3][3] = rbUsa;
        }

        private void Evaluar(object sender, EventArgs e)
        {
            Console.WriteLine("ENTRO");
            foreach (int pregunta in preguntas)
            {
                if (opciones[pregunta][0].IsChecked == true)
                {
                    puntos[pregunta] = 1;
                }
                else if (opciones[pregunta][1].IsChecked == true || opciones[pregunta][2].IsChecked == true || opciones[pregunta][3].IsChecked == true)
                {
                    puntos[pregunta] = -0.25;
                }
            }

            double puntosTotal = 0;
            foreach(double numero in puntos) { 
                puntosTotal = puntosTotal + numero;
            }

            MessageBox.Show(puntosTotal.ToString(), "PUNTOS TOTAL");
        }
        private void Reiniciar(object sender, EventArgs e)
        {
            foreach (int pregunta in preguntas)
            {
                opciones[pregunta][0].IsChecked = false;
                opciones[pregunta][1].IsChecked = false;
                opciones[pregunta][2].IsChecked = false;
                opciones[pregunta][3].IsChecked = false;
            }

            for(int i=0; i<puntos.Length; i++)
            {
                puntos[i] = 0;
            }
        }

        private void Salir(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
