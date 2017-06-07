using System;

namespace p19_TheaThePhotographer
{
    class TheaThePhotographer
    {
        static void Main(string[] args)
        {
            long pics = long.Parse(Console.ReadLine());
            long filterSecs = long.Parse(Console.ReadLine());
            double filterFactor = double.Parse(Console.ReadLine());
            long uploadTime = long.Parse(Console.ReadLine());

            long goodPics = (long)Math.Ceiling((filterFactor / 100) * pics);
            long totalTime = pics * filterSecs + goodPics * uploadTime;

            long days = totalTime / 86400;
            long hours = (totalTime - (days * 86400)) / 3600;
            long mins = (totalTime - (days * 86400 + hours * 3600)) / 60;
            long secs = totalTime - ((days * 86400) + (hours * 3600) + (mins * 60));

            Console.WriteLine("{0}:{1:00}:{2:00}:{3:00}", days, hours, mins, secs);
        }
    }
}
