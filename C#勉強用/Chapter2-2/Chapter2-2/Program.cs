using Chapter2_2.SalesCalculator;
using System;

namespace Chapter2_2
{
    class Program
    {
        static void Main(string[] args)
        {
            var sales = new SalesCounter("Sales.csv");
            var amountPerStore = sales.GetPerStoreSales();
            foreach (var obj in amountPerStore)
            {
                Console.WriteLine("{0} {1}", obj.Key, obj.Value);
            }
        }
    }
}
