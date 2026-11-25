public class EmployeePayroll {
    public static void main(String[] args) {
        Employee[] employees = {
            new FullTimeEmployee("Amina", 1, "Finance", 60000.0),
            new PartTimeEmployee("Rafi", 2, "Support", 450.0, 80),
            new ContractEmployee("Noor", 3, "Design", "Website refresh", 32000.0)
        };
        for (Employee employee : employees) {
            System.out.printf("%s: %.2f%n", employee.getName(), employee.calculatePay());
        }
    }
}

abstract class Employee {
    private final String name;
    private final int id;
    private final String department;
    Employee(String name, int id, String department) {
        this.name = name; this.id = id; this.department = department;
    }
    String getName() { return name; }
    abstract double calculatePay();
}

final class FullTimeEmployee extends Employee {
    private final double fixedSalary;
    FullTimeEmployee(String name, int id, String department, double fixedSalary) {
        super(name, id, department); this.fixedSalary = fixedSalary;
    }
    @Override double calculatePay() { return fixedSalary; }
}

final class PartTimeEmployee extends Employee {
    private final double hourlyRate;
    private final int hoursWorked;
    PartTimeEmployee(String name, int id, String department, double hourlyRate, int hoursWorked) {
        super(name, id, department); this.hourlyRate = hourlyRate; this.hoursWorked = hoursWorked;
    }
    @Override double calculatePay() { return hourlyRate * hoursWorked; }
}

final class ContractEmployee extends Employee {
    private final String projectName;
    private final double contractAmount;
    ContractEmployee(String name, int id, String department, String projectName, double contractAmount) {
        super(name, id, department); this.projectName = projectName; this.contractAmount = contractAmount;
    }
    @Override double calculatePay() { return contractAmount; }
}
