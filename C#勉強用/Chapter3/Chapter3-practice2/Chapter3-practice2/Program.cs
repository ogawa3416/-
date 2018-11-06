using System;
using System.Collections.Generic;
using System.Linq;

namespace Chapter3_practice2
{
    class Program
    {
        static void Main(string[] args)
        {
            var names = new List<string> {
                 "Tokyo", "New Delhi", "Bangkok", "London", "Paris", "Berlin", "Canberra", "Hong Kong",
            };

            //3.2-1
            Exercise2_1(names);

            //3.2-2
            Exercise2_2(names);

            //3.2-3
            Exercise2_3(names);

            //3.2-4
            Exercise2_4(names);


        }

        public static void Exercise2_1(List<string> names)
        {
            Console.WriteLine("都市名を入力。空行で終了");
            do
            {
                var line = Console.ReadLine();
                if (string.IsNullOrEmpty(line))
                    break;
                var index = names.FindIndex(s => s == line);
                Console.WriteLine(index);
            } while (true);
        }

        public static void Exercise2_2(List<string> names)
        {
            var count = names.Count(s => s.Contains("o"));
            Console.WriteLine("oが含まれている都市は" + count + "つあります");
        }

        public static void Exercise2_3(List<string> names)
        {
            var list = names.Where(s => s.Contains("o")).ToArray();
            foreach (var s in list)
                Console.WriteLine(s);
        }

        public static void Exercise2_4(List<string> names)
        {
            var selected = names.Where(s => s.StartsWith("B"))
                                .Select(s => s.Length);
            foreach (var length in selected)
                Console.WriteLine(length);
        }
    }
}
