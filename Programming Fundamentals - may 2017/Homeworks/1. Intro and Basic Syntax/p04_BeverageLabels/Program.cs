using System;


namespace p04_BeverageLabels
{
    class Program
    {
        static void Main(string[] args)
        {
            String name = Console.ReadLine();
            double volume = double.Parse(Console.ReadLine());
            double energyPer100ml = double.Parse(Console.ReadLine());
            double sugarPer100ml = double.Parse(Console.ReadLine());

            Console.WriteLine("{0}ml {1}: ", volume, name);

            Console.WriteLine("{0}kcal, {1}g sugars", (energyPer100ml * volume)/100, (sugarPer100ml * volume)/100);

        }
    }
}
