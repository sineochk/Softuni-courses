using System;

namespace p06_IntervalOfNumbers
{
    class Program
    {
        static void Main(string[] args)
        {
            int firstNum = int.Parse(Console.ReadLine());
            int secondNum = int.Parse(Console.ReadLine());

            for (int i = firstNum < secondNum ? firstNum: secondNum; 
                i <= (( firstNum < secondNum) ? secondNum : firstNum);
                i++)
            {
                Console.WriteLine(i);
            }
        }
    }
}
