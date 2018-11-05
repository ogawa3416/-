using System;
using System.Collections.Generic;
using System.Text;

namespace Chapter2_practice1
{
    class Song
    {
        public string Title { get; set; }
        public string ArtistName { get; set; }
        public int Length { get; set; }

        public Song(string title, string artistName, int length)
        {
            Title = title;
            ArtistName = artistName;
            Length = length;
        }
    }
}
