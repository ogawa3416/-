using System;
using System.Collections.Generic;
using System.Linq;

namespace Chapter3_1
{
    class Program
    {
        static void Main(string[] args)
        {
            var names = new List<string>
            {
                "Tokyo","New Delhi","Bangkok","London","Paris","Berlin","Canberra","Hong Kong",
            };

            var query = names.Select(s => s.Length);
            foreach (var n in query)
                Console.WriteLine("{0}",n);
        }
    }
}
