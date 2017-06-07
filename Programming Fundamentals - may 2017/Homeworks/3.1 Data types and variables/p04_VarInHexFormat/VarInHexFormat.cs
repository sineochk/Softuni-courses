using System;

namespace p04_VarInHexFormat
{
    class VarInHexFormat
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            Console.WriteLine(Convert.ToInt32(input, 16));
        }
    }
}
