package fr.efrei.paumier.exemple.network;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientProgram {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket()) {
            socket.connect(new InetSocketAddress("127.0.0.1", 4242));

            SendMessage(socket);
            DisplayResponse(socket);
        }
    }

    private static void SendMessage(Socket socket) throws IOException {
        OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream());

        try(Scanner scanner = new Scanner(System.in) ) {
            String nextLine = scanner.nextLine();
            writer.write(nextLine + "\n");
            writer.flush();
        }
    }

    private static void DisplayResponse(Socket socket) throws IOException {
        Scanner networkScanner = new Scanner(socket.getInputStream());
        System.out.println(networkScanner.nextLine());
    }
}
