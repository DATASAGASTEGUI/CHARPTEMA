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

namespace WPF_CERTIFICADO.Tema_26.xaml_06
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

        private void SeleccionarItem(object sender, EventArgs e)
        {
            ComboBoxItem item = (ComboBoxItem)cboCiudad.SelectedItem;
            string ciudad = item.Content.ToString(); 
            switch(ciudad)
            {
                case "BARCELONA": textCiudad.Text = "Barcelona capital de la comunidad de Cataluña"; break;
                case "BILBAO": textCiudad.Text = "Bilbao capital del pais Vasco"; break;
                case "MADRID": textCiudad.Text = "Madrid capital de la comunidad de Madrid"; break;
                case "SEVILLA": textCiudad.Text = "Sevilla capital de la comunidad de Andalucia"; break;
                case "ZARAGOZA": textCiudad.Text = "Zaragoza capital de la comunidad de Aragon"; break;
                case "CADIZ": textCiudad.Text = "Cadiz ciudad de la comunidad de Andalucia"; break;
                case "GRANADA": textCiudad.Text = "Granada ciudad de la comunidad de Andalucia"; break;
                default: textCiudad.Text = "SELECCIONE CIUDAD"; break;
            }
        }

        private void Reiniciaar(object sender, RoutedEventArgs e)
        {
            cboCiudad.SelectedIndex = 0;
        }

        private void Salir(object sender, RoutedEventArgs e)
        {
            this.Close();
        }
    }
}
