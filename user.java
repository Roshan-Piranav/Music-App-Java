
import java.util.*;

public class user {

    private int phoneno;
    private int password;

    Set<song> playlist = new LinkedHashSet<>();
    Set<device> devices = new HashSet<>();
    subscription sub;
    Set<String> purchasedAlbums = new HashSet<>();

    public user(int phoneno, int password) {

        this.phoneno = phoneno;
        this.password = password;

    }

    public int getPhoneno() { return phoneno; }
    public int getPassword() { return password; }

}
