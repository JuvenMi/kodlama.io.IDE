package Quiz4.Polymorphismv2;

public class Polymorphismv2Main {
    BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new DatabaseLogger(), new EmailLogger()};

}
