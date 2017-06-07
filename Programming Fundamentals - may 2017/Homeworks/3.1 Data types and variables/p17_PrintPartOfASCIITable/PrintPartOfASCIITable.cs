using System;

namespace p17_PrintPartOfASCIITable
{
    class PrintPartOfASCIITable
    {
        static void Main(string[] args)
        {
            int firstChar = int.Parse(Console.ReadLine());
            int lastChar = int.Parse(Console.ReadLine());

            for (int i = firstChar; i <= lastChar; i++)
            {
                Console.Write(Convert.ToChar(i) + " ");
            }
        }
    }
}
