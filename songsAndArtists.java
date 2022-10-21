/*
Fabella, Euge Kyle
BSIT301A
Data Structures and Algorithm
*/

import java.util.LinkedList;

public class songsAndArtists
{
    public static void main(String[] args)
    {
        //creating objects for linkedlist
        LinkedList songs = new LinkedList();
        LinkedList artists = new LinkedList();
        LinkedList playlist = new LinkedList();

        //songs
        songs.add("Yuri on Ice");
        songs.add("History Maker");
        songs.add("You Only Live Once");
        songs.add("Re:frain");
        songs.add("Yoku");

        //artists
        artists.add("Taro Umbayashi");
        artists.add("Dean Fujioka");
        artists.add("Wataru Hatano");
        artists.add("Aimer");
        artists.add("Eve");

        //playlist
        System.out.println("------------------------------------------------------------------");
        System.out.println(songs);
        System.out.println(artists);
        System.out.println("------------------------------------------------------------------");

        //in this 'for loop', it will add the songs and artists to the linked list playlist
        for (int i = 0; i < songs.size(); i++)
        {
            playlist.add(songs.get(i) + " - " + artists.get(i));
        }

        //and lastly, it will print out its contents
        for (int i = 0; i < playlist.size(); i++)
        {
            System.out.println(playlist.get(i));
        }
        System.out.println("------------------------------------------------------------------");
    }
}