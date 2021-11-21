package singleton;

public class DBConnection {

    private String connectionString;

    private static DBConnection instance;

    private DBConnection(String connectionString) {
        this.connectionString = connectionString;
    }

    public static DBConnection getInstance(String connectionStrings) {
        if (instance == null)
            instance = new DBConnection(connectionStrings);

        return instance;
    }

    public void connect() throws InterruptedException {
        System.out.println("Connecting to " + this.connectionString);
        Thread.sleep(1000);
        System.out.println("Connected!!");
    }
}
