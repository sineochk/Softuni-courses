using System;

namespace p15_BalancedBrackets
{
    class BalancedBrackets
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            string lastBracket = "";
            string balance = "BALANCED";

            for (int i = 0; i < n && balance.Equals("BALANCED"); i++)
            {
                string input = Console.ReadLine();
                if (input == "(")
                {
                    if (lastBracket == "(")
                    {
                        balance = "UNBALANCED";
                    }
                    lastBracket = "(";
                }
                if (input == ")")
                {
                    if (lastBracket == ")")
                    {
                        balance = "UNBALANCED";
                    }
                    lastBracket = ")";
                }
            }
            if (lastBracket == "(")
            {
                balance = "UNBALANCED";
            }
            Console.WriteLine(balance);
        }
    }
}
