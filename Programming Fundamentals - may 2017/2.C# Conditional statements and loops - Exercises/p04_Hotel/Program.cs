using System;

namespace p04_Hotel
{
    class Program
    {
        static void Main(string[] args)
        {
            string month = Console.ReadLine();
            int nightsCount = int.Parse(Console.ReadLine());

            double studioPrise = 0;
            double doublePrise = 0;
            double suitePrise = 0;

            if (month.Equals("May") || month.Equals("October"))
            {
                studioPrise = 50; //>7 : 5%
                doublePrise = 65;
                suitePrise = 75;
                if (nightsCount > 7)
                {
                    studioPrise *= 0.95;
                }
            }
            else if (month.Equals("June") || month.Equals("September"))
            {
                studioPrise = 60;
                doublePrise = 72; // >14 : 10%
                suitePrise = 82;
                if (nightsCount > 14)
                {
                    doublePrise *= 0.90;
                }
            }
            else if (month.Equals("July") || month.Equals("August") || month.Equals("December"))
            {
                studioPrise = 68;
                doublePrise = 77;
                suitePrise = 89; // >14 : 15%
                if (nightsCount > 14)
                {
                    suitePrise *= 0.85;
                }
            }
            Console.WriteLine("Studio: {0:0.00} lv.", 
                freeNight(month, nightsCount) ? (studioPrise * (nightsCount - 1)) : (studioPrise * nightsCount));
            Console.WriteLine("Double: {0:0.00} lv.", 
                doublePrise * nightsCount);
            Console.WriteLine("Suite: {0:0.00} lv.", 
                suitePrise * nightsCount);
        }

        public static bool freeNight (string month, int nightsCount)
        {
            if ((month.Equals("September") || month.Equals("October")) && nightsCount > 7)
            {
                return true;
            }
            return false;
        }
    }
}
