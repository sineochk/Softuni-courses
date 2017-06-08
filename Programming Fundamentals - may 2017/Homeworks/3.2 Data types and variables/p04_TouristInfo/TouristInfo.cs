using System;

namespace p04_TouristInfo
{
    class TouristInfo
    {
        static string convUnit = "";
        static double convValue = 0;

        static void Main(string[] args)
        {
            string unit = Console.ReadLine();
            double value = double.Parse(Console.ReadLine());
            double valueCopy = value;

            ConvertUnitAndValue(unit, value);

            Console.WriteLine("{0} {1} = {2:f2} {3}", valueCopy, unit, convValue, convUnit);
        }
        static void ConvertUnitAndValue (string unit, double value)
        {
            if (unit == "miles")
            {
                convUnit = "kilometers";
                convValue = value * 1.6;
            }
            else if (unit == "inches")
            {
                convUnit = "centimeters";
                convValue = 2.54 * value;
            }
            else if (unit == "feet")
            {
                convUnit = "centimeters";
                convValue = 30 * value;
            }
            else if (unit == "yards")
            {
                convUnit = "meters";
                convValue = 0.91 * value;
            }
            else if (unit == "gallons")
            {
                convUnit = "liters";
                convValue = 3.8 * value;
            }
        }
    }
}
