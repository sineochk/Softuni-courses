using System;

namespace p14_BoatSimulator
{
    class BoatSimulator
    {
        static void Main(string[] args)
        {
            char firstBoat = char.Parse(Console.ReadLine());
            char secondBoat = char.Parse(Console.ReadLine());
            int n = int.Parse(Console.ReadLine());

            int firstBoatTiles = 0;
            int secondBoatTiles = 0;
            bool hasNoAWinner = true;

            for (int i = 1; i <= n && hasNoAWinner; i++)
            {
                string input = Console.ReadLine();
                int speed = input.Length;
                if (input == "UPGRADE")
                {
                    firstBoat = Convert.ToChar(firstBoat + 3);
                    secondBoat = Convert.ToChar(secondBoat + 3);
                }
                else
                {
                    if (i % 2 != 0)
                    {
                        firstBoatTiles += speed;
                        if (firstBoatTiles >= 50)
                        {
                            Console.WriteLine(firstBoat);
                            hasNoAWinner = false;
                        }
                    }
                    else
                    {
                        secondBoatTiles += speed;
                        if (secondBoatTiles >= 50)
                        {
                            Console.WriteLine(secondBoat);
                            hasNoAWinner = false;
                        }
                    }
                }
            }
            if (hasNoAWinner)
            {
                Console.WriteLine(firstBoatTiles > secondBoatTiles ? "{0}" : "{1}", firstBoat, secondBoat);
            }
        }
    }
}
