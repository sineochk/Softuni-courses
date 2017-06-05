using System;

namespace p03Megapixels
{
    class Program
    {
        static void Main(string[] args)
        {
            double width = double.Parse(Console.ReadLine());
            double height = double.Parse(Console.ReadLine());

            double resolution = width * height / 1000000;

            Console.WriteLine("{0}x{1} => {2}MP", width, height, Math.Round(resolution, 1));
        }
    }
}
