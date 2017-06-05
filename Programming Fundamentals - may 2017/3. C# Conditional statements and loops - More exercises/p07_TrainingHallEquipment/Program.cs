using System;

namespace p07_TrainingHallEquipment
{
    class Program
    {
        static void Main(string[] args)
        {
            double budget = double.Parse(Console.ReadLine());
            int items = int.Parse(Console.ReadLine());

            string[] adding = new string[items];
            double currentPrice = 0;

            for (int i = 0; i < items; i++)
            {
                string itemName = Console.ReadLine();
                double itemPrice = double.Parse(Console.ReadLine());
                int itemCount = int.Parse(Console.ReadLine());
                currentPrice += itemPrice * itemCount;
                
                adding[i] = $"Adding {itemCount} {(itemCount > 1 ? itemName + "s" : itemName)} to cart.";
                   // Console.WriteLine("Adding {0} {1} to cart.", itemCount , itemCount > 1? itemName + "s" : itemName);
            }
            for (int i = 0; i < adding.Length; i++)
            {
                Console.WriteLine(adding[i]);
            }

            Console.WriteLine("Subtotal: ${0:0.00}", currentPrice);
            Console.WriteLine(budget >= currentPrice ? "Money left: ${0:0.00}" : "Not enough. We need ${0:0.00} more." , Math.Abs(currentPrice - budget));
            
        }
    }
}
