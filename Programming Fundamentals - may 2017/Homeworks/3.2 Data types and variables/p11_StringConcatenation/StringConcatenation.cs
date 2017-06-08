using System;
using System.Collections.Generic;

namespace p11_StringConcatenation
{
    class StringConcatenation
    {
        static void Main(string[] args)
        {
            string delimiter = Console.ReadLine();
            string oddOrEven = Console.ReadLine();
            int n = int.Parse(Console.ReadLine());

            List<string> words = new List<string>();

            for (int i = 1; i <= n; i++)
            {
                string word = Console.ReadLine();
                if (oddOrEven == "even" && i % 2 == 0)
                {
                        words.Add(word);
                }
                else if (oddOrEven == "odd" && i % 2 != 0)
                {
                        words.Add(word);
                }
            }
            Console.WriteLine(string.Join(delimiter, words));
            //Console.WriteLine( words[0] +delimiter+ words[1]);
        }
    }
}
