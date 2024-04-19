using System;
using System.Collections.Generic;
using System.IO;
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


namespace WPF_CERTIFICADO.Tema_26.xaml_08
{
    /// <summary>
    /// Lógica de interacción para Ventana1.xaml
    /// </summary>
    public partial class Ventana2 : Window
    {
        private static int[] arrayNumeros;

        private string[] preguntas = leerPreguntasCsv();

        /*
    {
        "¿Cuál es la capital de Francia?",
        "¿Cuál es el río más grande del mundo?",
        "¿Cuál es el país más poblado del mundo?",
        "¿Cuál es el metal más abundante en la corteza terrestre?",
        "¿Quién escribió El Quijote"
    };
        */
        private string[][] opcionesPreguntas  = LeerOpcionesCsv();

  /*
        {
            new string[] {"París","Londres","Berlín","Madrid"},
            new string[] {"Amazonas","Nilo","Mississippi","Yangtsé"},
            new string[] {"China","Brasil","Nigeria","India"},
            new string[] {"Hierro","Aluminio","Cobre","Plomo" },
            new string[] {"Miguel de Cervantes","Gabriel García Márquez","William Shakespeare", "Fyodor Dostoevsky"}
        };
            */
        private string[] respuestas = LeerRespuestasCsv();
            /*
            { "París", "Nilo", "India", "Hierro", "Miguel de Cervantes" };
            */

        private List<RadioButton> lista_radioButtons = new List<RadioButton>();
        public Ventana2()
        {
            InitializeComponent();
            ConstruirRadioButtons();
        }

        private void ConstruirRadioButtons()
        {
            for (int i = 0; i < preguntas.Length; i++)
            {
                TextBlock textBlock = new TextBlock();
                textBlock.Text = preguntas[i];
                textBlock.FontWeight = FontWeights.Bold;
                stackPanelPreguntas.Children.Add(textBlock);

                foreach (string opcion in opcionesPreguntas[i])
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
            foreach (RadioButton radioButton in lista_radioButtons)
            {
                if (radioButton.IsChecked == true)
                {
                    string respuestaSeleccionada = radioButton.Content.ToString();
                    if (pertenece(respuestaSeleccionada))
                    {
                        puntosTotal = puntosTotal + 1;
                    }
                    else
                    {
                        puntosTotal = puntosTotal - 0.25;
                    }
                }
            }

            MessageBox.Show(puntosTotal.ToString(), "PUNTOS TOTAL");
        }

        private bool pertenece(string respuestaSeleccionada)
        {
            bool respuesta = false;
            foreach (string correcta in respuestas)
            {
                if (respuestaSeleccionada == correcta)
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
            //leerOpcionesCsv();
        }

        private static string[] leerPreguntasCsv()
        {


            string[] preguntas = new string[5];
            try
            {
                string rutaRelativa = "data/BancoPreguntas.csv";
                string rutaAbsoluta = Path.GetFullPath(rutaRelativa);
                Console.WriteLine("RUTA ABSOLUTA: " + rutaAbsoluta);
                string fila = "";

 
                using (StreamReader sr = new StreamReader(rutaAbsoluta))
                {
                    string[] partes;
                    int i = 0;

                    while ((fila = sr.ReadLine()) != null)
                    {
                        partes = fila.Split(';');
                        preguntas[i] = partes[0];
                        i++;
                    }
                }
            }
            catch (IOException e)
            {
                Console.WriteLine("ERROR: LECTURA " + e.Message);
            }

            HashSet<int> numeros = new HashSet<int>();

            Random random = new Random();
            string[] preguntasA = new string[2];

            for (int i = 0; i < 10; i++)
            {
                int aleatorio = random.Next(0, 5);  //0 4 
                numeros.Add(aleatorio);
                if(numeros.Count == 2)
                {
                    break;
                }
            }
            arrayNumeros = numeros.ToArray();
            for (int i = 0; i<2; i++)
            {
                int indicealeatorio = arrayNumeros[i];
                preguntasA[i] = preguntas[indicealeatorio];
            }



            return preguntasA;
        }

        private static string[][] LeerOpcionesCsv()
        {
            string[][] opcionesPreguntas = new string[5][]; // Arreglo de arreglos de cadenas para almacenar las opciones

            try
            {
                string rutaRelativa = "data/BancoPreguntas.csv";
                string rutaAbsoluta = Path.GetFullPath(rutaRelativa);
                Console.WriteLine("RUTA ABSOLUTA: " + rutaAbsoluta);
                string fila = "";
                string opciones = "";

                using (StreamReader sr = new StreamReader(rutaAbsoluta))
                {
                    string[] partes;
                    string[] partesOpciones;
                    int i = 0;

                    //while ((fila = sr.ReadLine()) != null && i < opcionesPreguntas.Length)
                    while ((fila = sr.ReadLine()) != null)
                    {
                        partes = fila.Split(';');
                        opciones = partes[1];

                        partesOpciones = opciones.Split(',');
                        opcionesPreguntas[i] = new string[partesOpciones.Length]; // Crear el arreglo interno antes de asignar valores

                        for (int j = 0; j < partesOpciones.Length; j++)
                        {
                            opcionesPreguntas[i][j] = partesOpciones[j].Trim(); // Asignar las opciones al arreglo interno


                        }

                        Console.WriteLine(partesOpciones[0]);
                        i++;
                    }
                }
            }
            catch (IOException e)
            {
                Console.WriteLine("ERROR: LECTURA " + e.Message);
            }

            string[][] opcionesPreguntasA = new string[2][];

            for(int i = 0; i<2; i++)
            {
                opcionesPreguntasA[i] = opcionesPreguntas[arrayNumeros[i]];
                //opcionesPreguntas[i][j] = partesOpciones[j].Trim();
            }


            return opcionesPreguntasA;
        }

        private static string[] LeerRespuestasCsv()
        {
            string[] respuestas = new string[5];
            try
            {
                string rutaRelativa = "data/BancoPreguntas.csv";
                string rutaAbsoluta = Path.GetFullPath(rutaRelativa);
                Console.WriteLine("RUTA ABSOLUTA: " + rutaAbsoluta);
                string fila = "";


                using (StreamReader sr = new StreamReader(rutaAbsoluta))
                {
                    string[] partes;
                    int i = 0;

                    while ((fila = sr.ReadLine()) != null)
                    {
                        partes = fila.Split(';');
                        respuestas[i] = partes[2];
                        i++;
                    }
                }
            }
            catch (IOException e)
            {
                Console.WriteLine("ERROR: LECTURA " + e.Message);
            }

            string[] respuestasA = new string[2];
            for (int i = 0; i < 2; i++)
            {
                respuestasA[i] = respuestas[arrayNumeros[i]];
            }

                return respuestasA;
        }
    }
}
