using System;
using System.Globalization;

//1 mile == 1.60934 kilometers

namespace p03_MilesToKilometers
{
    class Program
    {
        static void Main(string[] args)
        {
            double miles = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
            Console.WriteLine((miles*1.60934).ToString("0.00", CultureInfo.InvariantCulture));
        }
    }
}
