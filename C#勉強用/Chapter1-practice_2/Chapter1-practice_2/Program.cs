using System;

namespace Chapter1_practice_2
{
    class Program
    {

        

        static void Main(string[] args)
        {
            MyClass myclass = new MyClass { X = 1, Y = 2 };
            MyStruct mystruct = new MyStruct { X = 1, Y = 2 };
            PrintObjects(myclass,mystruct);

            PrintObjectsTwice(myclass, mystruct);
            Console.WriteLine();
            Console.WriteLine("MyClass  : ({0},{1})", myclass.X, myclass.Y);
            Console.WriteLine("MyStruct : ({0},{1})", mystruct.X, mystruct.Y);
        }

        static void PrintObjects(MyClass obj1, MyStruct obj2)
        {
            Console.WriteLine("MyClass: ({0}, {1})", obj1.X, obj1.Y);
            Console.WriteLine("MyStruct: ({0}, {1})", obj2.X, obj2.Y);
        }

        static void PrintObjectsTwice(MyClass obj1, MyStruct obj2)
        {
            obj1.X *= 2;
            obj1.Y *= 2;
            obj2.X *= 2;
            obj2.Y *= 2;
            Console.WriteLine("MyClass  : ({0},{1})", obj1.X, obj1.Y);
            Console.WriteLine("MyStruct : ({0},{1})", obj2.X, obj2.Y);
        }

    }
}
