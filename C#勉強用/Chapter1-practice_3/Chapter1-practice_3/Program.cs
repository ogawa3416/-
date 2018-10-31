using System;

namespace Chapter1_practice_3
{
    class Program
    {
        static void Main(string[] args)
        {
            var student = new Student
            {
                Grade = 2,
                ClassNumber = 1,
                Name = "山田太郎",
                Birthday = new DateTime(2000, 4, 5),
            };
            Console.WriteLine("学年:{0} クラス:{1}組 名前:{2} 誕生日:{3}", student.Grade,student.ClassNumber,student.Name,student.Birthday);
        }
    }
}
