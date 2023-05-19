package Seminar3;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Personal personal = new Personal();
        personal.addUser(new User("Vladimir", "Egorov", 16))
                .addUser(new User("Nikolai", "Melnikov", 24))
                .addUser(new User("Maksakova", "Natasha", 18))
                .addUser(new User("Atrem", "PV", 25));

        Personal personal2 = new Personal();
        personal2.addUser(new User("Katerina", "Egorova", 19));
        User user = new User("Lena", "Petrova", 27);
        user.setSubordinate(personal);

        personal2.addUser(user);
        User bigBoss = new User("Big","Boss", 35);
        user.setSubordinate(personal2);
        Company company = new Company(bigBoss);
        for (User subordinates: company) {
            System.out.println(subordinates);
        }
//        for (User user: personal) {
//            System.out.println(user);
//
//        }
//        for (int i = 0; i < personal.users.size(); i++) {
//            System.out.println();
//        }
//        List<User> users= personal.toList();
//        System.out.println("----------");
//        System.out.println(users);
//        System.out.println("----------");
//        Collections.sort(users);
//        System.out.println(users);
    }
}
