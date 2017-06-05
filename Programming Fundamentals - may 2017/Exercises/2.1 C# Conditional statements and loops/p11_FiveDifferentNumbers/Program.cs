using System;

namespace p11_FiveDifferentNumbers
{
    class Program
    {
        static void Main(string[] args)
        {
            int firstNum = int.Parse(Console.ReadLine());
            int secondNum = int.Parse(Console.ReadLine());

            if (secondNum - firstNum < 4)
            {
                Console.WriteLine("No");
                return;
            }
            else
            {
                for (int a = firstNum; a <= secondNum - 4; a++)
                {
                    for (int b = a + 1; b <= secondNum - 3; b++)
                    {
                        for (int c = b + 1; c <= secondNum - 2; c++)
                        {
                            for (int d = c + 1; d <= secondNum - 1; d++)
                            {
                                for (int e = d + 1; e <= secondNum; e++)
                                {
                                    Console.WriteLine($"{a} {b} {c} {d} {e}");
                                }
                            }
                        }
                    }
                }
            }
            
        }
    }
}
