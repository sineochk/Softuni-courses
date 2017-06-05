using System;

namespace p08_CaloriesCounter
{
    class Program
    {
        static void Main(string[] args)
        {
            int countIngredients = int.Parse(Console.ReadLine());

            int totalCalories = 0;

            string ingredients = "";
            for (int i = 0; i < countIngredients; i++)
            {
                ingredients = Console.ReadLine().ToLower();

                if (ingredients.Equals("cheese"))
                {
                    totalCalories += 500;
                }
                else if (ingredients.Equals("tomato sauce"))
                {
                    totalCalories += 150;
                }
                else if (ingredients.Equals("salami"))
                {
                    totalCalories += 600;
                }
                else if (ingredients.Equals("pepper"))
                {
                    totalCalories += 50;
                }
                
            }
                Console.WriteLine("Total calories: {0} ", totalCalories);
        }
       
    }
}
