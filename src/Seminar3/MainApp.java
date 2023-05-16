package Seminar3;

public class MainApp {
    public static void main(String[] args) {
        Personal personal = new Personal();
        personal.addUser(new User("Vladimir", "Egorov", 16))
                .addUser(new User("Nikolai", "Malnikov", 24))
                .addUser(new User("Maksakova", "Natasha", 18));

        for (User user: personal) {
            System.out.println(user);

        }
        for (int i = 0; i < personal.users.size(); i++) {
            System.out.println();
        }
    }
}
