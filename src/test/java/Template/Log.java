package Template;

public abstract class Log {
    String User;
    String password;

    Log() {}

    public boolean post(String message) {
        if (logIn(this.User, this.password)) {
            boolean result =  sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String User, String password);
    abstract boolean sendData(byte[] data);
    abstract void logOut();
}
