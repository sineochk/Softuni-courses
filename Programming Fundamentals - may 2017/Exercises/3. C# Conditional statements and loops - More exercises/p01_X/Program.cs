using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p01_X
{
    class Program
    {
        static void Main(string[] args)
        {

            int n = int.Parse(Console.ReadLine());
            for (int i = 0; i < n / 2; i++)
            {
                Console.WriteLine(
                    new string(' ', i) +
                    'x' +
                    new string(' ', (n - 2) - (i + i)) +
                    'x'
                    );
            }

            Console.WriteLine(new string(' ', n / 2) + 'x');

            for (int i = n / 2 - 1; i >= 0; i--)
            {
                Console.WriteLine(
                    new string(' ', i) +
                    'x' +
                    new string(' ', (n - 2) - (i + i)) +
                    'x'
                    );
            }
        }
    }
}
