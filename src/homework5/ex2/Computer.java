package homework5.ex2;

public class Computer {
    protected User user;

    public void login(String userName) {
        this.user = new User(userName);
    }

    public void logOut() {
        this.user = null;
    }

    public void printMessage(String message) {
        System.out.println("Сообщение: " + message);
    }

    public class User {
        protected String name;

        public User(String name) {
            this.name = name;
        }
    }
}
