package Quiz4.Polymorphismv2;

public class EmailLogger extends BaseLogger {
    @Override
    public void log(String message) {
        System.out.println("Email logger: " + message);
    }
}
