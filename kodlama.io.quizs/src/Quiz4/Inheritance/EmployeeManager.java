package Quiz4.Inheritance;

public class EmployeeManager extends PeopleManager {
    public void add(Employee employee) {
        System.out.println("Added: " + employee.getName());
    }
    public void setSalary(Employee employee, int salary) {
        System.out.println("Salary set: " + salary);
        employee.setSalary(salary);
    }
}

