import java.util.ArrayList;
import java.util.Iterator;

public class ListRecursion {
    public static void main(String[] args){
        ArrayList<String> songs = new ArrayList<String>();
        ArrayList<String> artists = new ArrayList<String>();
        ArrayList<String> album = new ArrayList<String>();

        songs.add("Bye-Bye");
        songs.add("All of the Girls You Love Before");
        songs.add("To the Bone");
        songs.add("I Kissed a Girl");
        songs.add("Still Into You");

        artists.add("Mariah Carey");
        artists.add("Taylor Swift");
        artists.add("Pamungkas");
        artists.add("Katy Perry");
        artists.add("Ariana Grande");

        album.add("E=MC² (2008)");
        album.add("Lover (2019)");
        album.add("The Kinks (1994)");
        album.add("One of the Boys (2008)");
        album.add("Dangerous Woman (2016)");

        combine(songs.listIterator(), artists.listIterator(), album.listIterator());
    }

    public static void combine(Iterator<String> songs, Iterator<String> artists, Iterator<String> album){
        while(songs.hasNext() && artists.hasNext() && album.hasNext()){
            System.out.println(songs.next() + " - " + artists.next() + " - " + album.next());
        }
    }
}
