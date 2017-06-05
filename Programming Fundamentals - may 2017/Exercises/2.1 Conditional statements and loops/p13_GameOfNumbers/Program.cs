using System;

namespace p13_GameOfNumbers
{
    class Program
    {
        static void Main(string[] args)
        {
            int firstInput = int.Parse(Console.ReadLine());
            int secondInput = int.Parse(Console.ReadLine());
            int magicNum = int.Parse(Console.ReadLine());

            int sum = 0;
            int count = 0;
            int firstNum = 0;
            int secondNum = 0; 
            bool isFound = false;

            for (firstNum = firstInput; firstNum <= secondInput && !isFound; firstNum++)
            {
                for (secondNum = firstInput; secondNum <= secondInput && !isFound; secondNum++)
                {
                    if (firstNum + secondNum == magicNum)
                    {
                        isFound = true;
                        sum = firstNum + secondNum;
                    }
                    count++;
                }
            }
            
            if (isFound)
            {
                Console.WriteLine("Number found! {0} + {1} = {2}", secondNum - 1, firstNum -1 , magicNum);
            }
            else
            {
                Console.WriteLine("{0} combinations - neither equals {1}", count, magicNum);
            }
        }
    }
}
