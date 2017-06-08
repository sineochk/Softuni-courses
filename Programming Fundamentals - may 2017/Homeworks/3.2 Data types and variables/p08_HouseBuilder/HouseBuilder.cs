using System;

namespace p08_HouseBuilder
{
    class HouseBuilder
    {
        static void Main(string[] args)
        {
            long num1 = long.Parse(Console.ReadLine());
            long num2 = long.Parse(Console.ReadLine());
            long sum = num1 <= 127 ? sum = 4 * num1 + 10 * num2 : sum = 10 * num1 + 4 * num2;
            
            Console.WriteLine(sum);
        }
    }
}
