using System;

namespace Chapter4_practice1
{
    class Program
    {
        static void Main(string[] args)
        {
            YearMonth yearMonth = new YearMonth(2018, 12);
            YearMonth yearmonth = yearMonth.AddOneMonth();

            Console.WriteLine(yearMonth.ToString());
            Console.WriteLine(yearmonth.ToString());
        }
    }
}
