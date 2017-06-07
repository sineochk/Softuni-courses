using System;
using System.Collections.Generic;

namespace p18_DiffIntSize
{
    class DiffIntSize
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            List<string> types = new List<string>();
            long num;

            try
            {
                num = long.Parse(input);
            }
            catch (Exception)
            {
                Console.WriteLine("{0} can't fit in any type", input);
                return;
            }

            FillTypeList(num, types);

            if (types.Count > 0)
            {
                Console.WriteLine("{0} can fit in:", num);
                foreach (var type in types)
                {
                    Console.WriteLine("* {0}", type);
                }
            }
            else
            {
                Console.WriteLine("{0} can't fit in any type", input);
            }
        }

        public static void FillTypeList(long num, List<string> types)
        {
            
            if (num < 0)
            {
                if (num >= sbyte.MinValue)
                {
                    types.Add("sbyte");
                }
                if (num >= short.MinValue)
                {
                    types.Add("short");
                }
                if (num >= int.MinValue)
                {
                    types.Add("int");
                }
                if (num >= long.MinValue)
                {
                    types.Add("long");
                }
            }
            else
            {
                if (num <= byte.MaxValue)
                {
                    if (num <= sbyte.MaxValue)
                    {
                        types.Add("sbyte");
                    }
                    types.Add("byte");
                }
                if (num <= ushort.MaxValue)
                {
                    if (num <= short.MaxValue)
                    {
                        types.Add("short");
                    }
                    types.Add("ushort");
                }
                if (num <= uint.MaxValue)
                {
                    if (num <= int.MaxValue)
                    {
                        types.Add("int");
                    }
                    types.Add("uint");
                }
                if (num <= long.MaxValue)
                {
                    types.Add("long");
                }
            }
        }
    }
}
