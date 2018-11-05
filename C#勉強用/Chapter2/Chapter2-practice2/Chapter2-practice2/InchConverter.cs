using System;
using System.Collections.Generic;
using System.Text;

namespace Chapter2_practice2
{
    class InchConverter
    {
        private static double ratio = 0.0254;

        // メートルからインチ
        public static double FromMeter(double meter)
        {
            return meter / ratio;
        }

        // インチからメートル
        public static double ToMeter(double inch)
        {
            return inch * ratio;
        }
    }
}
