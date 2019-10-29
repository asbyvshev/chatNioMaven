package ru.chatNioMaven.server;

import ru.chatNioMaven.server.IO.Server;
import ru.chatNioMaven.server.NIO.ServerNIO;

import java.io.IOException;
import java.sql.SQLException;

public class MainServer {
    public static void main(String[] args) throws SQLException, IOException {
//        new Server();
        new Thread(new ServerNIO()).start();
    }
}
