package Quiz4.Polymorphismv2;

public class DatabaseLogger extends BaseLogger {
    @Override
    public void log(String message) {
        System.out.println("Database logger: " + message);
    }
}
