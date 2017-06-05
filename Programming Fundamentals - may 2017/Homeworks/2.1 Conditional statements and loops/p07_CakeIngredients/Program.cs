using System;

namespace p07_CakeIngredients
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] ingredients = new string[21];
            int count = 1;

            ingredients[0] = Console.ReadLine();
            while (ingredients[count - 1] != "Bake!")
            {
                ingredients[count] = Console.ReadLine();
                count++;
            }
            for (int i = 0; i < count - 1; i++)
            {
                Console.WriteLine("Adding ingredient {0}.", ingredients[i]);
            }
            Console.WriteLine("Preparing cake with {0} ingredients.", count - 1);

        }

        static void Main2(string[] args)
        {
            string[] ingredients = new string[21];
            int count = 0;
            
            while ((ingredients[count++] = Console.ReadLine()) != "Bake!") ;
            for (int i = 0; i < count - 1; i++)
            {
                Console.WriteLine("Adding ingredient {0}.", ingredients[i]);
            }
            Console.WriteLine("Preparing cake with {0} ingredients.", count - 1);

        }


    }
}
