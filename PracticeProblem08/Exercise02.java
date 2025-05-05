package PracticeProblem08;

abstract class Employee {
    private String name;
    protected int id;
    public static String department;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculatePay();

    // Getters and setters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

class ContractEmployee extends Employee {
    public static String projectName;
    public double contractAmount;

    public ContractEmployee(String name, int id, double contractAmount) {
        super(name, id);
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculatePay() {
        return contractAmount;
    }
}

class PartTimeEmployee extends Employee {
    public double hourlyRate;
    public int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

public class Exercise02 {

    public static void main(String[] args) {
        Employee.department = "Engineering";
        ContractEmployee.projectName = "Phoenix";

        PartTimeEmployee pt = new PartTimeEmployee("Alice", 101, 15.50, 80);
        ContractEmployee ce = new ContractEmployee("Bob", 102, 5000.00);

        System.out.println(pt.getName() + "'s pay: $" + pt.calculatePay());
        System.out.println(ce.getName() + "'s pay: $" + ce.calculatePay());
    }
}
