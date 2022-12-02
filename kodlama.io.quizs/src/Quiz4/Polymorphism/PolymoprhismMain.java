package Quiz4.Polymorphism;

public class PolymoprhismMain {
    public static void main(String[] args) {
        BaseCreditManager[] creditManagers = new BaseCreditManager[] {
            new FarmerCreditManager(),
            new TeacherCreditManager()
        };

        for (BaseCreditManager creditManager : creditManagers) {
            creditManager.calculate();
        }
    }
}
