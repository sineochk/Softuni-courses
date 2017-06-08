using System;

namespace p09_MakeAWord
{
    class MakeAWord
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            string word = "";

            for (int i = 0; i < n; i++)
            {
                char currentChar = char.Parse(Console.ReadLine());
                word += currentChar;
            }
            Console.WriteLine("The word is: {0}", word);
        }
    }
}
