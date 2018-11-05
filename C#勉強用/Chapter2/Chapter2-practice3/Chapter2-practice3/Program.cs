using System;

namespace Chapter2_practice3
{
    class Program
    {
        static void Main(string[] args)
        {
            var sales = new SalesCounter("sales.csv");
            var amountPerCategory = sales.GetPerCategorySales();
            foreach (var obj in amountPerCategory)
            {
                Console.WriteLine("{0} {1}", obj.Key, obj.Value);
            }
        }
    }
}
