using System;

namespace Chapter1_practice
{
    class Program
    {
        static void Main(string[] args)
        {
            Product dorayaki = new Product(98, "どら焼き", 210);
            int dorayakiPrice = dorayaki.GetPriceIncludingTax();
            Console.WriteLine("どら焼きは税込み" + dorayakiPrice + "円です");
        }
    }
}
