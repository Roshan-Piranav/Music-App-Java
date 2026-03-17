
import java.util.*;

public class userservice {

    static Map<Integer, user> users = new HashMap<>();

    Scanner sc = new Scanner(System.in);

    public void registerUser() {

        System.out.println("Enter phone number");

        int phone = sc.nextInt();

        System.out.println("Enter password");

        int pass = sc.nextInt();

        user u = new user(phone, pass);

        users.put(phone, u);

        System.out.println("User Registered");

    }

    public user loginUser() {

        System.out.println("Enter phone number");

        int phone = sc.nextInt();

        System.out.println("Enter password");

        int pass = sc.nextInt();

        user u = users.get(phone);

        if (u != null && u.getPassword() == pass)
            return u;

        return null;

    }

}
