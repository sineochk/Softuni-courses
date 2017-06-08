using System;

namespace p07_SentenceTheThief
{
    class SentenceTheThief
    {
        static void Main(string[] args)
        {
            string type = Console.ReadLine();
            int n = int.Parse(Console.ReadLine());
            long maxId = long.MinValue;
            long sentence;

            maxId = GetMaxId(type, n, maxId);
            sentence = CountSentence(maxId);

            if (sentence > 1)
            {
                Console.WriteLine("Prisoner with id {0} is sentenced to {1} years", maxId, sentence);
            }
            else
            {
                Console.WriteLine("Prisoner with id {0} is sentenced to {1} year", maxId, sentence);
            }
        }

        public static long CountSentence (long maxId)
        {
            long sentence = 1;

            if (maxId < sbyte.MinValue)
            {
                sentence = (maxId / -128) + 1;
            }
            else if (maxId > sbyte.MaxValue)
            {
                sentence = (maxId / 127) + 1;
            }
            return sentence;
        }

        public static long GetMaxId(string type, int n, long maxId)
        {
            
            for (int i = 0; i < n; i++)
            {
                long currentID = long.Parse(Console.ReadLine());
                if (type == "sbyte")
                {
                    if (currentID <= sbyte.MaxValue && currentID > maxId)
                    {
                        maxId = currentID;
                    }
                }
                else if (type == "int")
                {
                    if (currentID <= int.MaxValue && currentID > maxId)
                    {
                        maxId = currentID;
                    }
                }
                else if (type == "long")
                {
                    if (currentID <= long.MaxValue && currentID > maxId)
                    {
                        maxId = currentID;
                    }
                }
            }
            return maxId;
        }
    }
}
