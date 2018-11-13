using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Chapter4_practice2
{
    class Program
    {
        static void Main(string[] args)
        {
            var YearMonths = new YearMonth[]
            {
                new YearMonth(2000,2),
                new YearMonth(2003,1),
                new YearMonth(2010,12),
                new YearMonth(2016,7),
                new YearMonth(2018,11),
            };

            WriteLine(YearMonths);
            Console.WriteLine("-------------------------");

            Exercise2_4(YearMonths);
            Console.WriteLine("-------------------------");

            Exercise2_5(YearMonths);
            Console.WriteLine("-------------------------");
        }

        public static void WriteLine(YearMonth[] ym)
        {
            foreach(var item in ym)
            {
                Console.WriteLine(item);
            }
        }

        public static YearMonth FindFirst21C(YearMonth[] ym)
        {
            foreach(var item in ym)
            {
                if (item.Is21Century)
                    return item;
            }
            return null;
        }

        public static void Exercise2_4(YearMonth[] ym)
        {
            var yearmonth = FindFirst21C(ym);
            if (yearmonth == null)
                Console.WriteLine("21世紀のデータはありません");
            else
                Console.WriteLine(yearmonth);
        }

        public static void Exercise2_5(YearMonth[] ym)
        {
            var array = ym.Select(yms => yms.AddOneMonth())
                                    .ToArray();
            foreach (var item in array)
            {
                Console.WriteLine(item);
            }
        }
    }
}
