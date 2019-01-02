using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CaesarCipher
{
    class Program
    {
        static void Main(string[] args)
        {
            String msg = "asdf";
            String enc = "";
            String dec = "";
            int cyiherOffset = 3;
            int len = msg.Length;

            Console.WriteLine("Base string = " + msg);
            Console.WriteLine("Offset = " + cyiherOffset);

            foreach (char c in msg)
            {
                dec += (char) (c + cyiherOffset);
            }

            Console.WriteLine("Decoded = " + dec);

            foreach (char c in dec)
            {
                enc += (char)(c - cyiherOffset);
            }

            Console.WriteLine("Encoded = " + enc);
        }

    }
}
