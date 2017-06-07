using System;

namespace p16_ComparingFloats
{
    class ComparingFloats
    {
        static void Main(string[] args)
        {
            double num1 = double.Parse(Console.ReadLine());
            double num2 = double.Parse(Console.ReadLine());

            Console.WriteLine( (Math.Abs(num1 - num2) >= 0.000001) ? "False" : "True");
        }
    }
}
