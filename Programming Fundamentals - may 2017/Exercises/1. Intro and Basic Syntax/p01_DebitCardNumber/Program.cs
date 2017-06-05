using System;

namespace p01_DebitCardNumber
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] num = new int[4];

            for (int i = 0; i < 4; i++)
            {
                num[i] = int.Parse(Console.ReadLine());
                
            }
            for (int i = 0; i < 4; i++)
            {
                Console.Write("{0:D4} ", num[i]);
                //Console.Write("{0:0000} ", num[i]);
            }
            
        }
    }
}
