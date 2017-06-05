using System;

namespace p04PhotoGallery
{
    class Program
    {
        static double size = 0;
        static string sizeName = "B";

        static void Main(string[] args)
        {
            int photoNumber = int.Parse(Console.ReadLine());

            int day = int.Parse(Console.ReadLine());
            int month = int.Parse(Console.ReadLine());
            int year = int.Parse(Console.ReadLine());
            int hour = int.Parse(Console.ReadLine());
            int minute = int.Parse(Console.ReadLine());

            double bytes = double.Parse(Console.ReadLine());

            int width = int.Parse(Console.ReadLine());
            int height = int.Parse(Console.ReadLine());

            string date = $"{day:00}/{month:00}/{year} {hour:00}:{minute:00}";

            SizeAndSizeName(bytes);
            string resolution = Resolution(width, height);

            Console.WriteLine("Name: DSC_{0:D4}.jpg", photoNumber);
            Console.WriteLine("Date Taken: {0}", date);
            Console.WriteLine("Size: {0}{1}", size, sizeName);
            Console.WriteLine("Resolution: {0}x{1} ({2})", width, height, resolution);
        }

        public static void SizeAndSizeName(double bytes)
        {
            if (bytes >= 1000 && bytes < 1000000)
            {
                size = 1.0 * bytes / 1000;
                sizeName = "KB";
            }
            else if (bytes >= 1000000)
            {
                size = 1.0 * bytes / 1000000;
                sizeName = "MB";
            }
            else
            {
                size = bytes;
            }
        }

        public static string Resolution (int width, int height)
        {
            string resolution = "";
            if (width > height)
            {
                resolution = "landscape";
            }
            else if (width < height)
            {
                resolution = "portrait";
            }
            else
            {
                resolution = "square";
            }
            return resolution;
        }
    }
}
