using System;

namespace p08_EmployeeData
{
    class EmployeeData
    {
        static void Main(string[] args)
        {
            string firstName = Console.ReadLine();
            string lastName = Console.ReadLine();
            int age = int.Parse(Console.ReadLine());
            char gender = char.Parse(Console.ReadLine());
            long PersonalId = long.Parse(Console.ReadLine());
            int employeeNum = int.Parse(Console.ReadLine());

            Console.WriteLine("First name: {0}", firstName);
            Console.WriteLine("Last name: {0}", lastName);
            Console.WriteLine("Age: {0}", age);
            Console.WriteLine("Gender: {0}", gender);
            Console.WriteLine("Personal ID: {0}", PersonalId);
            Console.WriteLine("Unique Employee number: {0}", employeeNum);
        }
    }
}
