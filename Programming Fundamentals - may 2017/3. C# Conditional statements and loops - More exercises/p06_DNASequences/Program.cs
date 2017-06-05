using System;

namespace p06_DNASequences
{
    class Program
    {
        static void Main(string[] args)
        {
            int controlNum = int.Parse(Console.ReadLine());

            char[] chars = { 'A', 'C', 'G', 'T' };

            for (int firstChar = 0; firstChar < chars.Length; firstChar++)
            {
                for (int secondChar = 0; secondChar < chars.Length; secondChar++)
                {
                    for (int thirdChar = 0; thirdChar < chars.Length; thirdChar++)
                    {
                        int currentSum = firstChar + secondChar + thirdChar + 3;
                        char XorO;
                        bool isX = !(currentSum >= controlNum);

                        Console.Write("{0}{1}{2}{3}{0} ",
                           XorO = isX ? 'X' : 'O',
                           chars[firstChar],
                           chars[secondChar],
                           chars[thirdChar]
                           );
                    }
                    Console.WriteLine();
                }
            }
        }
    }
}
