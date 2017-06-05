using System;

namespace p01_ChooseDrink
{
    class Program
    {
        static void Main(string[] args)
        {
            string profession = Console.ReadLine();
            double quantity = double.Parse(Console.ReadLine());
            double prise;
            
            if (profession.Equals("Athlete"))
            {
                prise = 0.7 * quantity;
            }
            else if (profession.Equals("Businessman") || profession.Equals("Businesswoman"))
            {
                prise = 1.0 * quantity;
            }
            else if (profession.Equals("SoftUni Student"))
            {
                prise = 1.7 * quantity;
            }
            else
            {
                prise = 1.2 * quantity;
            }
            Console.WriteLine("The {0} has to pay {1:0.00}.", profession,prise);
        }
    }
}
