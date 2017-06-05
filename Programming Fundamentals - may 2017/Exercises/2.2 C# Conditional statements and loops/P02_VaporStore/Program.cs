using System;
using System.Collections.Generic;
using System.Linq;

namespace P02_VaporStore
{
    class Program
    {
        static void Main(string[] args)
        {
            Dictionary<string, double> availableGames = new Dictionary<string, double>();
            availableGames.Add("OutFall 4", 39.99);
            availableGames.Add("CS: OG", 15.99);
            availableGames.Add("Zplinter Zell", 19.99);
            availableGames.Add("Honored 2", 59.99);
            availableGames.Add("RoverWatch", 29.99);
            availableGames.Add("RoverWatch Origins Edition", 39.99);

            double balance = double.Parse(Console.ReadLine());
            double currentBal = balance;
            List<String> games = new List<string>();

            do
            {
                games.Add(Console.ReadLine());
            } while (!games.LastOrDefault().Equals("Game Time"));

            games.Remove("Game Time");

            for (var gameIndex = 0; gameIndex < games.Count && currentBal>0; gameIndex++)
            {
                if(!availableGames.ContainsKey(games[gameIndex]))
                {
                    Console.WriteLine("Not Found");
                }
                else if (availableGames[games[gameIndex]] <= currentBal)
                {
                    currentBal -= availableGames[games[gameIndex]];
                    Console.WriteLine("Bought "+ games[gameIndex]);
                }
                else
                {
                    Console.WriteLine("Too Expensive");
                }
            }

            if (currentBal <= 0)
            {
                Console.WriteLine("Out of money!");
            }
            else
            {
                Console.WriteLine("Total spent: ${0:0.00}. Remaining: ${1:0.00}",
                    balance - currentBal, currentBal);
            }
        }
    }
}
