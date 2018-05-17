using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace workingHoursCalculator
{
    class workingHoursCalculator
    {
     

        static void Main(string[] args)
        {
            int daysCounter = 1;
            int generationCounter = 0;
            int days = 25;
            int hours = 170;
            int seed = 7;
          

            int[] vals = new int[days];
            int nextIdx = 0;
            int nextNumber = 0;
            Random r = new Random();


            while (vals.Sum() != hours)
            {
                nextNumber = r.Next(seed - 2, seed +1);
                nextIdx = r.Next(days);
                vals[nextIdx] = nextNumber;
                Console.Write("Generating... " +  "Attempt:" + generationCounter + "                ");
                System.Console.WriteLine(DateTime.Now.ToString());
                generationCounter += 1;
            }

            foreach (var item in vals)
            {

             Console.WriteLine("Dzień:" + daysCounter + ", liczba godzin " + item.ToString());
            daysCounter += 1;

            }
            Console.WriteLine("suma godzin:" + vals.Sum());
      




            Console.ReadLine();
        }

    }
}
