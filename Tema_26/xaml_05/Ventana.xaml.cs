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

namespace WPF_CERTIFICADO.Tema_26.xaml_05
{
    /// <summary>
    /// Lógica de interacción para Ventana.xaml
    /// </summary>
    public partial class Ventana : Window
    {
        public Ventana()
        {
            InitializeComponent();
        }

        private void Cargar(object sender, RoutedEventArgs e)
        {
            for(int i = 0; i<10; i++)
            {
                lbNumero.Items.Add(i+1);
            }
        }

        private void Limpiar(object sender, RoutedEventArgs e)
        {
            lbNumero.Items.Clear();
        }

        private void Salir(object sender, RoutedEventArgs e)
        {
            this.Close();
        }
    }
}
