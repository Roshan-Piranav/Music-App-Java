
public class song {

    private String artist;
    private String album;
    private String year;
    private String genre;
    private String songname;

    public song(String artist, String album, String year, String songname, String genre) {

        this.artist = artist;
        this.album = album;
        this.year = year;
        this.songname = songname;
        this.genre = genre;

    }

    public String getArtist() { return artist; }
    public String getAlbum() { return album; }
    public String getYear() { return year; }
    public String getGenre() { return genre; }
    public String getSongname() { return songname; }

    @Override
    public String toString() {

        return songname + " | " + artist + " | " + album + " | " + year + " | " + genre;

    }

    @Override
    public boolean equals(Object obj) {

        song other = (song) obj;

        return songname.equals(other.songname) &&
                artist.equals(other.artist) &&
                album.equals(other.album) &&
                year.equals(other.year) &&
                genre.equals(other.genre);

    }

}
