using System;

namespace p15_FastPrimeChecker
{
    class FastPrimeChecker
    {
        static void Main(string[] args)
        {
            int num = int.Parse(Console.ReadLine());
           
            for (int i = 2; i <= num; i++)
            {
                bool isPrime = true;
                for (int k = 2; k <= Math.Sqrt(i); k++)
                {
                    if (i % k == 0)
                    {
                        isPrime = false;
                        break;
                    }
                }
                Console.WriteLine($"{i} -> {isPrime}");
            }
        }
    }
}
