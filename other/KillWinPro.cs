using System;
using System.Windows;
using System.Diagnostics;
using System.Security.Principal;

namespace KillWinPro
{
    /// <summary>
    /// Logika interakcji dla klasy MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
            WindowsIdentity user = WindowsIdentity.GetCurrent();
        }

        private void button_Click(object sender, EventArgs e)
        {
            Process[] _proceses = null;
            _proceses = Process.GetProcessesByName("winpro");

            foreach (Process proces in _proceses)
            {
                var temp = "/C taskkill /F /FI \"USERNAME eq " + Environment.UserName + "\"  /IM  winpro.exe";
     
                System.Diagnostics.Process.Start("CMD.exe", temp);
                Console.Out.WriteLine(temp);
            }

            Environment.Exit(0);
        }


    }
}
