import java.util.LinkedList;

public class List {
    public static void main(String[] args){
        LinkedList<String> songs = new LinkedList<>();
        LinkedList<String> artists = new LinkedList<>();
        LinkedList<String> album = new LinkedList<>();
        LinkedList<String[]> songIn = new LinkedList<>();
        
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

        for(int i = 0; i < songs.size(); i++){
            songIn.add(new String[]{songs.get(i), artists.get(i), album.get(i)});
        }
        for(String[] songInfo : songIn) {
            System.out.println(songInfo[0] + " - " + songInfo[1] + " - " + songInfo[2]);
        }
    }
}
