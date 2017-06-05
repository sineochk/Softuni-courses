using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p05_CharacterStats
{
    class Program
    {
        static void Main(string[] args)
        {
            string name = Console.ReadLine();
            int currentHealth = int.Parse(Console.ReadLine());
            int maxHealth = int.Parse(Console.ReadLine());
            int currentEnergy = int.Parse(Console.ReadLine());
            int maxEnergy = int.Parse(Console.ReadLine());

            string currentHealthStr = new string('|', currentHealth);
            string health = new string('.', maxHealth - currentHealth); 
            string currentEnergyStr = new string('|', currentEnergy); 
            string energy = new string('.', maxEnergy - currentEnergy);

            Console.WriteLine("Name: {0}", name);
            Console.WriteLine("Health: |{0}{1}|", currentHealthStr, health );
            Console.WriteLine("Energy: |{0}{1}|", currentEnergyStr, energy );

        }
    }
}
