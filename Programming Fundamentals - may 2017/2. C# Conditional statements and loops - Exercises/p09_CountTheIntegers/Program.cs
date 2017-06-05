using System;

namespace p09_CountTheIntegers
{
    class Program
    {
        static void Main(string[] args)
        {
            int input;
            int count = 0;
            while (true)
            {
                try
                {
                    input = int.Parse(Console.ReadLine());
                    count++;
                }
                catch (Exception)
                {
                    Console.WriteLine("{0}", count);
                    return;
                }
            }
        }
    }
}
