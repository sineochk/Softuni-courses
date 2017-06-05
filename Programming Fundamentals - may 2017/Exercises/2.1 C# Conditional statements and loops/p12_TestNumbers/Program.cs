using System;

namespace p12_TestNumbers
{
    class Program
    {
        static void Main(string[] args)
        {
            int firstNum = int.Parse(Console.ReadLine());
            int secondNum = int.Parse(Console.ReadLine());
            int thirdNum = int.Parse(Console.ReadLine());
            int sum = 0;
            int count = 0;
            bool isSmaller = true;
            for (int i = firstNum; i >= 1 && isSmaller; i--)
            {
                for (int k = 1; k <= secondNum && isSmaller; k++)
                {
                    sum += i * k * 3;
                    if (sum >= thirdNum)
                    {
                        isSmaller = false;
                    }
                    count++;
                }
            }

            Console.WriteLine("{0} combinations", count);

            if (sum >= thirdNum)
            {
                Console.WriteLine("Sum: {0} >= {1}", sum, thirdNum);
            }
            else
            {
                Console.WriteLine("Sum: {0}", sum);
            }
        }
    }
}
