using System;
using System.Collections.Generic;
using System.Text;

namespace Chapter4_practice1
{
    public class YearMonth
    {
        public int Year { get; private set; }
        public int Month { get; private set; }

        public YearMonth(int year, int month)
        {
            this.Year = year;
            this.Month = month;
        }

        public bool Is21Century(int year)
        {
            return 2001 <= year && year <= 2100;
        }

        public YearMonth AddOneMonth()
        {
            if (Month == 12)
            {
                return new YearMonth(this.Year + 1, 1);
            }
            else
            {
                return new YearMonth(this.Year, this.Month + 1);
            }
        }

        public override string ToString()
        {
            return $"{Year}年{Month}月";
        }
    }
}
