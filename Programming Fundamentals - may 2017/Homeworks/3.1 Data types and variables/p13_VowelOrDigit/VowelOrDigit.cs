using System;

namespace p13_VowelOrDigit
{
    class VowelOrDigit
    {
        static void Main(string[] args)
        {
            char input = char.Parse(Console.ReadLine());

            char[] vowels = new char[] { 'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y' };

            string result = "";

            if (char.IsDigit(input))
            {
                result = "digit";
            }
            else 
            {
                foreach (char vowel in vowels)
                {
                    if (input.Equals(vowel))
                    {
                        result = "vowel";
                        break;
                    }
                }
            }
            if(result.Length == 0)
            {
                result = "other";
            }
            Console.WriteLine(result);
        }
    }
}
