using System;
using System.Numerics;

namespace p10_CanturiesToNanosecs
{
    class CanturiesToNanosecs
    {
        static void Main(string[] args)
        {
            uint centuries = uint.Parse(Console.ReadLine());
            uint years = centuries * 100;
            uint days = (uint)(years * 365.2422);
            uint hours = days * 24;
            ulong mins = hours * 60;
            ulong secs = mins * 60;
            ulong milisecs = secs * 1000;
            BigInteger microsecs = milisecs * 1000;
            BigInteger nanosecs = microsecs * 1000;

            Console.WriteLine("{0} centuries = {1} years = {2} days = {3} hours = {4} minutes = {5} seconds = {6} milliseconds = {7} microseconds = {8} nanoseconds",
                centuries, years, days, hours, mins, secs, milisecs, microsecs, nanosecs);

        }
    }
}
