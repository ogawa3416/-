using System;
using System.Collections.Generic;
using System.Text;

namespace Chapter2
{
    public static class FeetConverter
    {
        public static double FromMeter(double meter)
        {
            return meter / 0.3048;
        }

        public static double ToMeter(double feet)
        {
            return feet * 0.3048;
        }
    }
}
