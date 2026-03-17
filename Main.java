
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        userservice userService = new userservice();

        while (true) {

            System.out.println("\n===== MUSIC APP =====");
            System.out.println("1 Register");
            System.out.println("2 Login");
            System.out.println("3 Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    userService.registerUser();
                    break;

                case 2:
                    user u = userService.loginUser();

                    if (u != null) {

                        System.out.println("Login Successful");

                        user_specific_pl menu = new user_specific_pl(u);
                        menu.start();

                    } else {

                        System.out.println("Invalid credentials");

                    }

                    break;

                case 3:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice");

            }

        }

    }

}
