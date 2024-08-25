package homework5.ex2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Spy extends Computer {
    private static final String FILE_NAME = "resources/comp.log";
    private static final String USER_LOGOUT_MESSAGE = "Пользователь вышел";
    private static final File FILE = new File(FILE_NAME);

    private Computer computer;

    public Spy(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void login(String userName) {
        printUserLogIn(userName);
        super.login(userName);
    }

    @Override
    public void logOut() {
        try (FileWriter fileWriter = new FileWriter(FILE, true)) {
            fileWriter.write(USER_LOGOUT_MESSAGE + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        super.logOut();
    }

    @Override
    public void printMessage(String message) {
        try (FileWriter fileWriter = new FileWriter(FILE, true);) {
            fileWriter.write("Пользователь " + this.user.name + " отправил сообщение: " + message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        super.printMessage(message);
    }

    public void printUserLogIn(String name) {
        try (FileWriter fileWriter = new FileWriter(FILE, true);) {
            fileWriter.write("Пользователь " + name + " вошел\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
