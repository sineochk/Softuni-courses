using System;

namespace p05_WordInPlural
{
    class Program
    {
        static void Main(string[] args)
        {
            string word = Console.ReadLine();
            string pluralWord = "";

            if (word.EndsWith("y"))
            {
                pluralWord = word.Remove(word.Length - 1);
                pluralWord += "ies"; 
            }
            else if (word.EndsWith("o") || word.EndsWith("s") || word.EndsWith("x") || word.EndsWith("z") 
                || word.EndsWith("sh") || word.EndsWith("ch"))
            {
                pluralWord = word + "es";
            }
            else
            {
                pluralWord = word + "s";
            }
           
            Console.WriteLine(pluralWord);
        }
    }
}
