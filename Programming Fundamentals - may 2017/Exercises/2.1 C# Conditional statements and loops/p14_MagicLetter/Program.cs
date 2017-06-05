using System;

namespace p14_MagicLetter
{
    class Program
    {
        static void Main(string[] args)
        {
            char symbolOne = Console.ReadLine()[0];
            char symbolTwo = Console.ReadLine()[0];
            char escSymbol = Console.ReadLine()[0];

            for (int i = symbolOne; i <= symbolTwo; i++)
            {
                for (int j = symbolOne; j <= symbolTwo; j++)
                {
                    for (int k = symbolOne; k <= symbolTwo; k++)
                    {
                        if ((char)k != escSymbol && (char)j != escSymbol && (char)i != escSymbol)
                        {
                            Console.Write((char)i + "" + (char)j + "" + (char)k + " ");
                            
                        }
                    }
                }
            }
        }
    }
}
