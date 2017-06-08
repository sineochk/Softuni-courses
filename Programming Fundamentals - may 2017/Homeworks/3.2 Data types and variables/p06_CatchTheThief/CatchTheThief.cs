using System;

namespace p06_CatchTheThief
{
    class CatchTheThief
    {
        static void Main(string[] args)
        {
            string type = Console.ReadLine();
            int n = int.Parse(Console.ReadLine());
            long maxId = long.MinValue;

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
            Console.WriteLine(maxId);
        }
    }
}
