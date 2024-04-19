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

namespace WPF_CERTIFICADO.Tema_26.xaml_02
{
    /// <summary>
    /// Lógica de interacción para Ventana.xaml
    /// </summary>
    public partial class Ventana : Window
    {
        public Ventana()
        {
            InitializeComponent();
            personalizarVentana();
        }

        public void personalizarVentana()
        {
            this.Title = "VENTANA CSHARP";
            this.Height = 325;
            this.Width = 400;

            string rutaRelativa = "data/cross1.png";
            this.Icon = new BitmapImage(new Uri(rutaRelativa, UriKind.Relative));

            this.ResizeMode = ResizeMode.NoResize;
            this.WindowStartupLocation = WindowStartupLocation.CenterScreen;
            this.Background = Brushes.LightGray;
        }
    }
}
