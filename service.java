
import java.util.*;

public class service {

    void catalog() {

        System.out.println("\n--- Music Catalog ---");

        for (song s : playlist.pl)
            System.out.println(s);

    }

    void displayAvailableSongs() {

        int id = 1;

        for (song s : playlist.pl) {

            System.out.println(id + ". " + s.getSongname() + " - " + s.getArtist());
            id++;

        }

    }

    song getSongById(int id) {

        int count = 1;

        for (song s : playlist.pl) {

            if (count == id)
                return s;

            count++;

        }

        return null;

    }

    void filterByArtist(String artist) {

        System.out.println("\nSongs by " + artist);

        for (song s : playlist.pl)

            if (s.getArtist().equalsIgnoreCase(artist))
                System.out.println(s);

    }

    void sortByYear() {

        List<song> list = new ArrayList<>(playlist.pl);

        Collections.sort(list, (a, b) -> a.getYear().compareTo(b.getYear()));

        System.out.println("\nSongs Sorted By Year");

        for (song s : list)
            System.out.println(s);

    }

}
