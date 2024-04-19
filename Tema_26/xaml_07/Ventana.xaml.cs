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

namespace WPF_CERTIFICADO.Tema_26.xaml_07
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

        private void Seleccionar(object sender, RoutedEventArgs e)
        {
             List<string> list_marcados = new List<string>();

             if(chkLectura.IsChecked == true) 
             {
                list_marcados.Add(chkLectura.Content.ToString());
             }
            if (chkPintura.IsChecked == true)
            {
                list_marcados.Add(chkPintura.Content.ToString());
            }
            if (chkCine.IsChecked == true)
            {
                list_marcados.Add(chkCine.Content.ToString());
            }
            if (chkCocina.IsChecked == true)
            {
                list_marcados.Add(chkCocina.Content.ToString());
            }
            if (chkPaseo.IsChecked == true)
            {
                list_marcados.Add(chkPaseo.Content.ToString());
            }
            if (chkAjedrez.IsChecked == true)
            {
                list_marcados.Add(chkAjedrez.Content.ToString());
            }

            lbHoby.Items.Clear();
            foreach (string hoby in list_marcados)
            {
                lbHoby.Items.Add(hoby);
            }

        }

        private void Salir(object sender, RoutedEventArgs e)
        {
            this.Close();
        }

        private void Reiniciar(object sender, RoutedEventArgs e)
        {
            chkLectura.IsChecked = false;
            chkCine.IsChecked = false;
            chkCocina.IsChecked = false;
            chkPaseo.IsChecked = false;
            chkAjedrez.IsChecked = false;
            chkPintura.IsChecked = false;
            lbHoby.Items.Clear();
        }
    }
}
