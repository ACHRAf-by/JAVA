package fr.efrei.paumier.exemple.network;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerProgram {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (ServerSocket socket = new ServerSocket()) {
            socket.bind(new InetSocketAddress("127.0.0.1", 4242));

            Class classInformation = Class.forName("fr.efrei.paumier.exemple.network.ServerProgram$ClientConnection");
            classInformation.getAnnotation(Class.forName("org.junit.experimental.categories.Category"));

            while (true) {
                System.out.println("Waiting for socket...");
                ClientConnection connection = new ClientConnection(socket.accept());
                connection.start();
            }
        }
        //System.out.println("Done !");
    }

    private static class ClientConnection implements Runnable, Closeable {
        private final Thread thread;
        private final Socket socket;
        private final Scanner scanner;
        private final OutputStreamWriter writer;

        public ClientConnection(Socket socket) throws IOException {
            this.socket = socket;
            this.scanner = new Scanner(socket.getInputStream());
            this.writer = new OutputStreamWriter(socket.getOutputStream());

            thread = new Thread(this);
        }

        public void start() {
            thread.start();
        }

        @Override
        public void run() {
            try {
                System.out.format("Received socket%s\n", socket.getInetAddress());

                String message = receiveMessage(socket);
                System.out.format("Received message%s\n", message);

                String response = invertMessage(message);
                System.out.format("Sending message%s\n", response);

                sendMessage(socket, response);
                System.out.println("Closing...");
            }
            catch (IOException exception) {
                System.err.format("IO Exception: %s\n", exception);
                try {
                    socket.close();
                } catch (IOException e) {
                }
            }
        }

        @Override
        public void close() throws IOException {
            this.socket.close();
        }

        private String receiveMessage(Socket socket) throws IOException {
            return scanner.nextLine();
        }

        private static String invertMessage(String message) {
            return new StringBuilder(message)
                    .reverse()
                    .toString();
        }

        private void sendMessage(Socket socket, String message) throws IOException {
            writer.write(message  + "\n");
            writer.flush();
        }
    }
}
