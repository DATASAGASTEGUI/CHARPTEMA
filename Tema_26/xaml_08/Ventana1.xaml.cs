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
    /// Lógica de interacción para Ventana1.xaml
    /// </summary>
    public partial class Ventana1 : Window
    {
        private string[] preguntas =
        {
            "¿Cuál es la capital de Francia?",
            "¿Cuál es el río más grande del mundo?",
            "¿Cuál es el país más poblado del mundo?",
            "¿Cuál es el metal más abundante en la corteza terrestre?",
            "¿Quién escribió El Quijote"
        };
        private string[][] opcionesPreguntas =
        {
            new string[] {"París","Londres","Berlín","Madrid"},
            new string[] {"Amazonas","Nilo","Mississippi","Yangtsé"},
            new string[] {"China","Brasil","Nigeria","India"},
            new string[] {"Hierro","Aluminio","Cobre","Plomo" },
            new string[] {"Miguel de Cervantes","Gabriel García Márquez","William Shakespeare", "Fyodor Dostoevsky"}
        };
        private string[] respuestas = { "París", "Nilo", "India", "Hierro", "Miguel de Cervantes" };

        private List<RadioButton> lista_radioButtons = new List<RadioButton>();
        public Ventana1()
        {
            InitializeComponent();
            ConstruirRadioButtons();
        }

        private void ConstruirRadioButtons()
        {
            for(int i = 0; i<preguntas.Length; i++)
            {
                TextBlock textBlock = new TextBlock();
                textBlock.Text = preguntas[i];
                textBlock.FontWeight = FontWeights.Bold;
                stackPanelPreguntas.Children.Add(textBlock);

                foreach(string opcion in opcionesPreguntas[i])
                {
                   RadioButton radioButton = new RadioButton();
                   radioButton.Content = opcion;
                   radioButton.GroupName = "Pregunta" + i;
                   stackPanelPreguntas.Children.Add(radioButton);
                   lista_radioButtons.Add(radioButton);
                }
            }
        }

        private void Evaluar(object sender, RoutedEventArgs e)
        {
            double puntosTotal = 0;
            foreach(RadioButton radioButton in lista_radioButtons)
            {
                if(radioButton.IsChecked == true)
                {
                    string respuestaSeleccionada = radioButton.Content.ToString();
                    if(pertenece(respuestaSeleccionada))
                    {
                        puntosTotal = puntosTotal + 1;
                    }else
                    {
                        puntosTotal = puntosTotal -0.25;
                    }
                }
            }
            
            MessageBox.Show(puntosTotal.ToString(), "PUNTOS TOTAL");
        }

        private bool pertenece(string respuestaSeleccionada)
        {
            bool respuesta = false;
            foreach(string correcta in respuestas)
            {
                if(respuestaSeleccionada == correcta)
                {
                    respuesta = true;
                    break;
                }
            }
            return respuesta;
        }

        private void Reiniciar(object sender, RoutedEventArgs e)
        {
            foreach (RadioButton radioButton in lista_radioButtons)
            {
                radioButton.IsChecked = false;
            }
        }

        private void Salir(object sender, RoutedEventArgs e)
        {
            this.Close();
        }
    }
}
