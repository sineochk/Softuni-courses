using System;

namespace p10_SumOfChars
{
    class SumOfChars
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int sum = 0;
            for (int i = 0; i < n; i++)
            {
                char c = char.Parse(Console.ReadLine());
                int charIndex = Convert.ToInt32(c);
                sum += charIndex;
            }
            Console.WriteLine("The sum equals: {0}", sum);
        }
    }
}
