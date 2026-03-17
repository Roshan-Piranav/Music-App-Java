
import java.util.*;

public class user_specific_pl {

    user currentUser;

    public user_specific_pl(user u) {

        currentUser = u;

    }

    public void start() {

        Scanner sc = new Scanner(System.in);
        service ss = new service();

        while (true) {

            System.out.println("\n===== USER MENU =====");
            System.out.println("1 Add Song");
            System.out.println("2 Delete Song");
            System.out.println("3 View Playlist");
            System.out.println("4 Add Device");
            System.out.println("5 Buy Subscription");
            System.out.println("6 Buy Album");
            System.out.println("7 Sync Devices");
            System.out.println("8 Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    ss.displayAvailableSongs();

                    System.out.println("Enter song id");

                    int id = sc.nextInt();

                    song s = ss.getSongById(id);

                    if (s != null) {

                        currentUser.playlist.add(s);
                        System.out.println("Song added");

                    }

                    break;

                case 2:

                    int i = 1;

                    for (song so : currentUser.playlist) {

                        System.out.println(i + ". " + so);
                        i++;

                    }

                    System.out.println("Enter id");

                    int remove = sc.nextInt();

                    song r = getSongById(remove);

                    if (r != null)
                        currentUser.playlist.remove(r);

                    break;

                case 3:

                    for (song so : currentUser.playlist)
                        System.out.println(so);

                    break;

                case 4:

                    System.out.println("Enter device name");

                    String dev = sc.nextLine();

                    device d = new device(dev);

                    currentUser.devices.add(d);

                    System.out.println("Device added");

                    break;

                case 5:

                    System.out.println("Plan Weekly/Monthly/Quarterly/Yearly");

                    String plan = sc.nextLine();

                    currentUser.sub = new subscription(plan);

                    System.out.println("Subscription activated");

                    break;

                case 6:

                    System.out.println("Enter album name");

                    String album = sc.nextLine();

                    currentUser.purchasedAlbums.add(album);

                    System.out.println("Album purchased");

                    break;

                case 7:

                    System.out.println("Playlist synced across devices");

                    break;

                case 8:

                    return;

            }

        }

    }

    private song getSongById(int id) {

        int count = 1;

        for (song s : currentUser.playlist) {

            if (count == id)
                return s;

            count++;

        }

        return null;

    }

}
