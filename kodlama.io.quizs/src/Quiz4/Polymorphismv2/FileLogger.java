package Quiz4.Polymorphismv2;

public class FileLogger extends BaseLogger {
    @Override
    public void log(String message) {
        System.out.println("File logger: " + message);
    }
}
