using System;

namespace p11_ConvertSpeedUnits
{
    class ConvertSpeedUnits
    {
        static void Main(string[] args)
        {
            int meters = int.Parse(Console.ReadLine());
            int hours = int.Parse(Console.ReadLine());
            int mins = int.Parse(Console.ReadLine());
            int secs = int.Parse(Console.ReadLine());

            float totalSecs = secs + (mins + (hours * 60)) * 60;
            float km =(float)meters / 1000;
            float miles = (float)meters / 1609;
            float time = totalSecs / 3600;

            float metersPerSecond = meters / totalSecs;

            Console.WriteLine(metersPerSecond);
            Console.WriteLine(km / time);
            Console.WriteLine(miles / time);
        }
    }
}
