using System;

namespace p03_WaterOverflow
{
    class WaterOverflow
    {
        static void Main(string[] args)
        {
            int lines = int.Parse(Console.ReadLine());
            int waterTank = 0;

            for (int i = 0; i < lines; i++)
            {
                int liters = int.Parse(Console.ReadLine());
                if (waterTank + liters > 255)
                {
                    Console.WriteLine("Insufficient capacity!");
                }
                else
                {
                    waterTank += liters;
                }
            }
            Console.WriteLine(waterTank);
        }
    }
}
