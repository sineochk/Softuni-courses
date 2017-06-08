using System;
using System.Linq;

namespace p05_WeatherForecast
{
    class WeatherForecast
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            string weather = "";

            if (input.Contains('.'))
            {
                weather = "Rainy";
            }
            else
            {
                long num = long.Parse(input);
                if (num > -128 && num < byte.MaxValue)
                {
                    weather = "Sunny";
                }
                else if (num > int.MinValue && num <=int.MaxValue)
                {
                    weather = "Cloudy";
                }
                else
                {
                    weather = "Windy";
                }
            }
            Console.WriteLine(weather);
        }
    }
}
