using System;

namespace p05_BoolVar
{
    class BoolVar
    {
        static void Main(string[] args)
        {
            string trueOrFalse = Console.ReadLine();
            bool isTrue = Convert.ToBoolean(trueOrFalse);
            Console.WriteLine(isTrue ? "Yes" : "No");
        }
    }
}
