using System;

namespace p08_SmsTyping
{
    class Program
    {
        static String[] phoneChars = new String[10];

        static void Main(string[] args)
        {
            populatePhoneChars();
            int textLenght = int.Parse(Console.ReadLine());
            String[] text = new String[textLenght];

            int phoneCharIndex;
            int phoneCharPosition;

            for (int i = 0; i < textLenght; i++)
            {
                text[i] = Console.ReadLine();
            }

            for (int i = 0; i< textLenght; i++)
            {
                phoneCharIndex = (int)Char.GetNumericValue(text[i][0]);
                phoneCharPosition = text[i].Length - 1;

                Console.Write( phoneChars[phoneCharIndex] [phoneCharPosition] );
            }
        }

        private static void populatePhoneChars()
        {
            phoneChars[2] = "abcABC";
            phoneChars[3] = "defDEF";
            phoneChars[4] = "ghiGHI";
            phoneChars[5] = "jklJKL";
            phoneChars[6] = "mnoMNO";
            phoneChars[7] = "pqrsPQRS";
            phoneChars[8] = "tuvTUV";
            phoneChars[9] = "wxyzWXYZ";
            phoneChars[0] = " ";
        }
    }
}
