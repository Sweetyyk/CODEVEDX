// Employee.java
// TASK 2 - Object-Oriented Programming Design

class Employee {

    // Private fields (Encapsulation)
    private int id;
    private String name;
    private String department;
    private double salary;

    // Default Constructor
    Employee() {
        id = 0;
        name = "Not Assigned";
        department = "Not Assigned";
        salary = 0.0;
    }

    // Parameterized Constructor
    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to calculate annual salary
    public double calculateAnnualSalary() {
        return salary * 12;
    }

    // Method Overloading
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Department : " + department);
        System.out.println("Salary : " + salary);
    }

    // Overloaded method
    public void displayDetails(boolean showAnnualSalary) {
        displayDetails();

        if (showAnnualSalary) {
            System.out.println("Annual Salary : " + calculateAnnualSalary());
        }
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

// Main class
public class employee {

    public static void main(String[] args) {

        // Creating Employee object
        Employee emp1 = new Employee(101, "Srivalli", "IT", 35000);

        // Display employee details
        emp1.displayDetails(true);

        System.out.println();

        // Using overridden toString() method
        System.out.println(emp1);
    }
}
