using System;
using System.Collections.Generic;

namespace Chapter3_1
{
    class Program
    {
        static void Main(string[] args)
        {
            var list = new List<string>
            {
                "Tokyo","New Delhi","Bangkok","London","Paris","Berlin","Canberra","Hong Kong",
            };
            list.ForEach(s => Console.WriteLine(s));
        }
    }
}
