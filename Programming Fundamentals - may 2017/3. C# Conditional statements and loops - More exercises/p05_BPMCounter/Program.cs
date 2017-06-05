using System;

namespace p05_BPMCounter
{
    class Program
    {
        static void Main(string[] args)
        {
            double beatsPerMinute = double.Parse(Console.ReadLine());
            double numberOfBeats = double.Parse(Console.ReadLine());

            double minutes =(int)( numberOfBeats / beatsPerMinute);
            double secs = (int)(numberOfBeats / beatsPerMinute * 60 - minutes * 60);

            double bars = Math.Round((numberOfBeats / 4), 1);

            Console.WriteLine("{0} bars - {1}m {2}s", bars, minutes, secs);
        }
    }
}
