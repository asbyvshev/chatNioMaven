package ru.chatNioMaven.server.NIO;



import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AuthServiceNIO {

    private static List<User> usersList =new LinkedList (Arrays.asList(new User []{
            new User("login1","pass1","nick1"),
            new User("login2","pass2","nick2"),
            new User("login3","pass3","nick3")
    }));

    public static String getNickByLoginAndPass(String login, String pass) {

        for (User user: usersList) {
            if (user.login.equals(login) && user.pass.equals(pass)){
                return user.nick;
            }
        }
        return null;
    }

    private static class User {
        String login;
        String pass;
        String nick;

        public User(String login, String pass, String nick) {
            this.login = login;
            this.pass = pass;
            this.nick = nick;
        }
    }
}
