// Employee.java
class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary); // Using setter to ensure non-negative salary
    }

    // Getter and Setter for firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and Setter for lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter and Setter for monthlySalary
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    // Method to calculate yearly salary
    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    // Method to give a 10% raise
    public void giveRaise() {
        this.monthlySalary *= 1.10;
    }
}

// EmployeeTest.java
public class EmployeeTest {
    public static void main(String[] args) {
        // Creating two Employee objects
        Employee emp1 = new Employee("John", "Doe", 5000);
        Employee emp2 = new Employee("Jane", "Smith", 6000);

        // Displaying yearly salaries before raise
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + " Yearly Salary: " + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + " Yearly Salary: " + emp2.getYearlySalary());

        // Giving each employee a 10% raise
        emp1.giveRaise();
        emp2.giveRaise();

        // Displaying yearly salaries after raise
        System.out.println("After 10% raise:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + " Yearly Salary: " + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + " Yearly Salary: " + emp2.getYearlySalary());
    }
}
