using System;

namespace p12_BeerKegs
{
    class BeerKegs
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            double maxVol = double.MinValue;
            string kegModel = "";

            for (int i = 0; i < n; i++)
            {
                string model = Console.ReadLine();
                double radius = double.Parse(Console.ReadLine());
                double height = double.Parse(Console.ReadLine());
                double currentVol = Math.PI * radius * radius * height;

                if (currentVol > maxVol)
                {
                    maxVol = currentVol;
                    kegModel = model;
                }
            }
            Console.WriteLine(kegModel);
        }
    }
}
