using System;
using System.Globalization;

namespace p02_RectangleArea
{
    class Program
    {
        static void Main(string[] args)
        {
            double width = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
            double height = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
            double value = width * height;
            Console.WriteLine(value.ToString("0.00", CultureInfo.InvariantCulture));
            
            

        }
    }
}
