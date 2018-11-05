using System;

namespace Chapter2_practice2
{
    class Program
    {
        static void Main(string[] args)
        {
            PrinInchToMeterList(1, 10);
        }

        static void PrinInchToMeterList(int start, int stop)
        {
            for (int inch = start; inch <= stop; inch++)
            {
                double meter = InchConverter.ToMeter(inch);
                Console.WriteLine("{0} inch = {1:0.0000} m", inch, meter);
            }
        }
    }
}
