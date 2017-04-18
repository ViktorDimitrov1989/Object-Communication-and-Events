package eventImplementation;

import eventImplementation.implementations.Dispatcher;
import eventImplementation.implementations.Handler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Handler firstHandles = new Handler();

        Dispatcher dispatcher = new Dispatcher();
        dispatcher.addNameChangeListener(firstHandles);

        String line;
        while (!"End".equals(line = reader.readLine())){
            dispatcher.setName(line);
        }
    }
}
