using System;

namespace p09_ReversedChars
{
    class ReversedChars
    {
        static void Main(string[] args)
        {
            char first = char.Parse(Console.ReadLine());
            char mid = char.Parse(Console.ReadLine());
            char last = char.Parse(Console.ReadLine());
            
            Console.WriteLine("{0}{1}{2}", last, mid, first);
        }
    }
}
