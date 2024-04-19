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

namespace WPF_CERTIFICADO.Tema_26.xaml_03
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

        private void Sumar(object sender, RoutedEventArgs e)
        {
            try
            {
                double n1, n2, suma;
                n1 = double.Parse(txtN1.Text);
                n2 = double.Parse(txtN2.Text);
                suma = n1 + n2;
                txtSuma.Text = suma.ToString();
            }catch(Exception ex)
            {
                MessageBox.Show("ENTRADA INCORRECTA", "ERROR");
            }
        }

        private void Limpiar(object sender, RoutedEventArgs e)
        {
            txtN1.Text = "";
            txtN2.Text = "";
            txtSuma.Text = "";
        }

        private void CerrarVentana(object sender, RoutedEventArgs e)
        {
            this.Close();
        }
    }
}
