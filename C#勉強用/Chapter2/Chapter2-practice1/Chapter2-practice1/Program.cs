using System;

namespace Chapter2_practice1
{
    class Program
    {
        static void Main(string[] args)
        {
            var songs = new Song[]
            {
                new Song("sample1","artist1",150),
                new Song("sample2","artist2",160),
                new Song("sample3","artist3",120)
            };
            PrintSongs(songs);

        }

        private static void PrintSongs(Song[] songs)
        {
            foreach (var song in songs)
            {
                Console.WriteLine(@"{0}, {1} {2:m\:ss}",
                    song.Title, song.ArtistName, TimeSpan.FromSeconds(song.Length));
            }
        }
    }
}
