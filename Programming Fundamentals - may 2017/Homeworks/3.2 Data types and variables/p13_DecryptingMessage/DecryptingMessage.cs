using System;

namespace p13_DecryptingMessage
{
    class DecryptingMessage
    {
        static void Main(string[] args)
        {
            int key = int.Parse(Console.ReadLine());
            int n = int.Parse(Console.ReadLine());
            string result = "";

            for (int i = 0; i < n; i++)
            {
                int index = Convert.ToInt32(char.Parse(Console.ReadLine()));
                char letter = Convert.ToChar(index + key);
                result += letter;
            }
            Console.WriteLine(result);
        }
    }
}
