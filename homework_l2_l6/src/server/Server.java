package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class Server {

//    private Vector<ClientHandler> clients;

    public Server(){
        ServerSocket server = null;
        Socket socket = null;
        BufferedReader in = null;
        PrintWriter    out= null;


        try {
            server = new ServerSocket(8189);
            System.out.println("Сервер запущен");



            while (true) {
                socket = server.accept();
                System.out.println("Клиент подключился");
                in = new BufferedReader( new InputStreamReader((socket.getInputStream())));
                out = new PrintWriter(socket.getOutputStream(), true);
                String input, output;


                while ((input = in.readLine()) != null) {
                if (input.equalsIgnoreCase("exit")) break;
                out.println("S ::: "+input);
                System.out.println(input);
                }
//                out.close();
//                in.close();
//                fromclient.close();
//                servers.close();


//                clients.add( new ClientHandler(this,socket));
            }
        } catch (IOException e) {
            System.out.println("Не удалось прослушать порт 8189");
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                System.out.println("Не удалось завершить соединение со стороны клиента");
            }
            try {
                server.close();
            } catch (IOException e) {
                System.out.println("Не удалось завершить соединение со стороны сервера");
            }
        }
    }


    }




//
//
//    public Server() {
//        clients = new Vector<>();
//        ServerSocket server = null;//почему именно в конструкторе класса? нельзя за пределами?
//        Socket socket = null;
//
//        try {
//            server = new ServerSocket(8189);
//            System.out.println("Сервер запущен");
//
//
//            while (true) {
//                socket = server.accept();
//                System.out.println("Клиент подключился");
//                clients.add( new ClientHandler(this,socket));
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                socket.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                server.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public void broadcastMsg(String msg) {
//        for (ClientHandler o: clients) {
//            o.sendMsg(msg);
//        }
//    }

//}
