using System;
using System.Linq;

namespace p02_NumberChecker
{
    class NumberChecker
    {
        static void Main(string[] args)
        {
            string num = Console.ReadLine();
            string resultType = string.Empty;

            if (num.Contains('.') || num.Contains(','))
            {
                resultType = "floating-point";
            }
            else
            {
                resultType = "integer";
            }

            Console.WriteLine(resultType);
        }
    }
}
