/*
Fabella, Euge Kyle
BSIT301A
Data Structures and Algorithms
*/

import java.util.LinkedList;

public class songsAndArtists
{
    public static void main(String[] args)
    {
        //creating LinkedLists
        LinkedList songs = new LinkedList();
        LinkedList artists = new LinkedList();
        LinkedList playlist = new LinkedList();

        //adding songs to the LinkedList 'songs'
        songs.add("Yuri on Ice");
        songs.add("History Maker");
        songs.add("You Only Live Once");
        songs.add("Re:frain");
        songs.add("Yoku");

        //adding artists to the LinkedList 'artists'
        artists.add("Taro Umbayashi");
        artists.add("Dean Fujioka");
        artists.add("Wataru Hatano");
        artists.add("Aimer");
        artists.add("Eve");

        //showing what's inside the LinkedList 'songs' and 'artists'
        line();
        System.out.println(songs);
        System.out.println(artists);
        line();

        //in this 'for loop', it will add the contents of 'songs' and 'artists' to the LinkedList 'playlist'
        for (int i = 0; i < songs.size(); i++)
        {
            playlist.add(songs.get(i) + " - " + artists.get(i));
        }

        //and lastly, it will print out its contents (playlist)
        for (int i = 0; i < playlist.size(); i++)
        {
            System.out.println(playlist.get(i));
        }
        line();
    }

    //separator
    public static void line()
    {
        System.out.println("------------------------------------------------------------------");
    }
}
