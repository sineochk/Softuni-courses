using System;

namespace p03_RestaurantDiscount
{
    class Program
    {
        static void Main(string[] args)
        {
           
            int people = int.Parse(Console.ReadLine());
            string package = Console.ReadLine();
            String hall;
            int hallPrice = 0;
            
            if (people <= 50)
            {
                hall = "Small Hall";
                hallPrice = 2500;
            }
            else if (people <= 100)
            {
                hall = "Terrace";
                hallPrice = 5000;
            }
            else if(people <= 120)
            {
                hall = "Great Hall";
                hallPrice = 7500;
            }
            else
            {
                Console.Write("We do not have an appropriate hall.");
                return;
            }
            Console.WriteLine("We can offer you the {0}", hall);
            Console.Write("The price per person is {0:0.00}$", calculatePerPerson(people, hallPrice, package));

        }

        public static double calculatePerPerson(int people, int hallPrice, String package)
        {
            double ppp = hallPrice;
            if (package.Equals("Normal"))
            {
                ppp += 500;
                ppp -= (ppp * 0.05);
            }
            else if (package.Equals("Gold"))
            {
                ppp += 750;
                ppp -= (ppp * 0.1);
            }
            else if (package.Equals("Platinum"))
            {
                ppp += 1000;
                ppp -= (ppp * 0.15);
            }
            ppp /= people;
            return ppp;
        }
    }
}
